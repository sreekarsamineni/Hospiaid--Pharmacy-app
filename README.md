E-Pharmacy Android App
This is a mobile application built with Android Studio (Java) that provides a user-friendly platform for browsing and purchasing pharmacy products online.
It also includes additional healthcare services for the elderly and hospitals.

Features
📱 User Authentication (Login, Registration)

🏠 Home Page with banners and product categories

🛒 View New Products, Popular Products

🏥 Special sections for Elderly Care and Hospital Services

🛍️ Add to Cart functionality

🎨 Smooth onboarding experience for new users

🔥 Animations for screen transitions

🌎 Firebase integration for authentication and data storage

Tech Stack
Frontend: Android (Java)

Backend: Firebase

Libraries/Tools:

Firebase Authentication

Firebase Realtime Database / Firestore (if used)

Glide (for image loading - optional)

Android ViewPager

Material Design Components

Gradle Build System

Project Structure
pgsql
Copy
Edit
.idea/                    # Android Studio project configs
app/
 ├── src/
 │    ├── main/
 │    │    ├── java/com/example/sev2/
 │    │    │    ├── activities/         # All Activities like MainActivity, LoginActivity, etc.
 │    │    │    ├── adapters/            # RecyclerView Adapters for displaying data
 │    │    │    ├── fragments/           # HomeFragment
 │    │    │    ├── models/              # Data Models for Categories and Products
 │    │    ├── res/                      # Layouts, Drawables, Animations, etc.
 │    │    └── AndroidManifest.xml
 │    ├── test/                          # Unit tests
 │    └── androidTest/                   # Instrumentation tests
 ├── build.gradle
 ├── google-services.json                # Firebase config file
gradle/
 └── wrapper/                             # Gradle Wrapper files
build.gradle
gradlew / gradlew.bat
local.properties
settings.gradle
README.md
How to Run
Clone this repository:

bash
Copy
Edit
git clone https://github.com/your-username/e-pharmacy-app.git
Open in Android Studio.

Set up Firebase:

Create a Firebase project.

Add an Android app to Firebase project.

Download and replace google-services.json in the app/ directory.

Enable Authentication (Email/Password).

Set up Firestore or Realtime Database as needed.

Build and Run the project on an emulator or physical device.

Screenshots

Home Page	Categories	Product Details	Cart
(Insert Screenshots)	(Insert Screenshots)	(Insert Screenshots)	(Insert Screenshots)
Folder Highlights
activities/ — Core screens like Login, Registration, FrontPage, Hospital services, Elderly Care.

adapters/ — Adapters for RecyclerViews like CategoryAdapter, NewProductsAdapter.

models/ — Data models like CategoryModel, PopularProductsModel.

res/layout/ — XML layouts for activities, fragments, and recyclerview items.

res/drawable/ — All images, icons, and custom drawables.

res/anim/ — Animation XMLs for smooth transitions.

Future Enhancements
🛒 Implement full checkout and payment system

📦 Add order tracking

🛠️ Implement push notifications for offers

🎯 Improve UI/UX with Material 3 designs

License
This project is licensed under the MIT License.
Feel free to use, modify, and distribute.

