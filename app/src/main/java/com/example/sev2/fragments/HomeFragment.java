package com.example.sev2.fragments;

import android.app.ProgressDialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.sev2.R;
import com.example.sev2.adapters.CategoryAdapter;
import com.example.sev2.adapters.NewProductsAdapter;
import com.example.sev2.adapters.PopularProductsAdapter;
import com.example.sev2.models.CategoryModel;
import com.example.sev2.models.NewProductModel;
import com.example.sev2.models.PopularProductsModel;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {

    LinearLayout linearLayout;
    ProgressDialog progressDialog;

    RecyclerView catRecyclerview,newProductRecyclerview,popularRecyclerview;
    //Category recyclerview
    CategoryAdapter categoryAdapter;
    List<CategoryModel> categoryModelList;

    //New Products
    NewProductsAdapter newProductsAdapter;
    List<NewProductModel> newProductModelList;

    //Popular Products
    PopularProductsAdapter popularProductsAdapter;
    List<PopularProductsModel> popularProductsModelList;


    //FireStore base
    FirebaseFirestore db;

    public HomeFragment(){



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_home, container, false);


        progressDialog = new ProgressDialog(getActivity());
        catRecyclerview = root.findViewById(R.id.rec_category);
        newProductRecyclerview = root.findViewById(R.id.new_product_rec);
        popularRecyclerview = root.findViewById(R.id.popular_rec);


        db = FirebaseFirestore.getInstance();

        linearLayout = root.findViewById(R.id.home_layout);
        linearLayout.setVisibility(View.GONE);

        // Image Slider
        ImageSlider imageSlider = root.findViewById(R.id.image_slider);
        List<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.banner2,"Discount on ......", ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.banner1,"Discount on ......", ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.banner3,"Discount on ......", ScaleTypes.CENTER_CROP));

        imageSlider.setImageList(slideModels);


        progressDialog.setTitle("Welcome");
        progressDialog.setMessage("please wait....");
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.show();

        //Category
        catRecyclerview.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));
        categoryModelList = new ArrayList<>();
        categoryAdapter = new CategoryAdapter(getContext(),categoryModelList);
        catRecyclerview.setAdapter(categoryAdapter);

        db.collection("Category")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {

                                CategoryModel categoryModel = document.toObject(CategoryModel.class);
                                categoryModelList.add(categoryModel);
                                categoryAdapter.notifyDataSetChanged();
                                linearLayout.setVisibility(View.VISIBLE);
                                progressDialog.dismiss();
                            }
                        } else {

                            Toast.makeText(getActivity(), ""+task.getException(), Toast.LENGTH_SHORT).show();

                        }
                    }
                });

        //New Products
        newProductRecyclerview.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));
        newProductModelList = new ArrayList<>();
        newProductsAdapter = new NewProductsAdapter(getContext(),newProductModelList);
        newProductRecyclerview.setAdapter(newProductsAdapter);


        db.collection("NewProducts")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {

                                NewProductModel newProductsModel = document.toObject(NewProductModel.class);
                                newProductModelList.add(newProductsModel);
                                newProductsAdapter.notifyDataSetChanged();

                            }
                        } else {

                            Toast.makeText(getActivity(), ""+task.getException(), Toast.LENGTH_SHORT).show();

                        }
                    }
                });

        //Popular Products

        popularRecyclerview.setLayoutManager(new GridLayoutManager(getActivity(),2));
        popularProductsModelList = new ArrayList<>();
        popularProductsAdapter = new PopularProductsAdapter(getContext(),popularProductsModelList);
        popularRecyclerview.setAdapter(popularProductsAdapter);


        db.collection("AllProducts")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {

                                PopularProductsModel popularProductsModel = document.toObject(PopularProductsModel.class);
                                popularProductsModelList.add(popularProductsModel);
                                popularProductsAdapter.notifyDataSetChanged();

                            }
                        } else {

                            Toast.makeText(getActivity(), ""+task.getException(), Toast.LENGTH_SHORT).show();

                        }
                    }
                });



        return root;

    }
}