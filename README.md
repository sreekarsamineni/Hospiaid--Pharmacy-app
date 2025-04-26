
# E-Pharmacy Android App

This is a mobile application built with **Android Studio** (Java) that provides a user-friendly platform for browsing and purchasing pharmacy products online.  
It also includes additional healthcare services for the elderly and hospitals.

## Features

- 📱 User Authentication (Login, Registration)
- 🏠 Home Page with banners and product categories
- 🛒 View New Products, Popular Products
- 🏥 Special sections for Elderly Care and Hospital Services
- 🔥 Animations for screen transitions
- 🌎 Firebase integration for authentication and data storage

## Tech Stack

- **Frontend:** Android (Java)
- **Backend:** Firebase
- **Libraries/Tools:** 
  - Firebase Authentication
  - Firebase Realtime Database / Firestore (if used)
  - Glide (optional for images)
  - Android ViewPager
  - Material Design Components
- **Build System:** Gradle

## Project Structure

```
.idea/
app/
 ├── src/
 │    ├── main/
 │    │    ├── java/com/example/sev2/
 │    │    │    ├── activities/
 │    │    │    ├── adapters/
 │    │    │    ├── fragments/
 │    │    │    ├── models/
 │    │    ├── res/
 │    │    └── AndroidManifest.xml
 │    ├── test/
 │    └── androidTest/
 ├── build.gradle
 ├── google-services.json
gradle/
 └── wrapper/
build.gradle
gradlew / gradlew.bat
local.properties
settings.gradle
README.md
```

## How to Run

1. **Clone the repository:**
   ```
   git clone https://github.com/your-username/e-pharmacy-app.git
   ```

2. **Open the project in Android Studio.**

3. **Set up Firebase:**
   - Create a Firebase project.
   - Add an Android app to the Firebase project.
   - Download the `google-services.json` file and place it inside the `app/` directory.
   - Enable **Authentication** (Email/Password).
   - Set up **Firestore** or **Realtime Database** if necessary.

4. **Build and Run** the project on an emulator or physical device.


## Folder Highlights

- `activities/` — Core screens like Login, Registration, FrontPage, Hospital services, Elderly Care.
- `adapters/` — RecyclerView adapters for categories and products.
- `models/` — Data models for categories and products.
- `layout/` — XML layouts for screens and components.
- `drawable/` — Images, icons, and graphical assets.

## Future Enhancements

- 🛒 Implement full checkout and payment gateway
- 📦 Add order tracking and status updates
- 🛠️ Push notifications for order status and promotions
- 🎯 Update to Material 3 design guidelines

## License

This project is licensed under the [MIT License](LICENSE).
