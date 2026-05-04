# Simpele Train App

Android app gebouwd met Kotlin en Jetpack Compose. Doel: een eenvoudige treinapp.

## Projectstructuur

```
android/          # Android app (Gradle project)
  app/src/main/
    java/com/quinten/trainapp/   # Kotlin broncode
    res/                         # Resources (layouts, icons, strings)
  build.gradle    # App-level dependencies
  settings.gradle # Projectnaam: "Train app", module: :app
index.html        # (placeholder, niet onderdeel van de Android app)
```

## Bouwen

```powershell
cd android
.\gradlew assembleDebug     # debug APK
.\gradlew installDebug      # installeer op verbonden apparaat/emulator
.\gradlew test              # unit tests
```

Vereiste: Android SDK op `C:\Users\Quinten\AppData\Local\Android\Sdk` (ingesteld via `local.properties`, niet in git).

## Tech stack

- **Taal**: Kotlin
- **UI**: Jetpack Compose + Material3
- **minSdk**: 26 (Android 8.0)
- **compileSdk**: 33 (Android 13)
- **Kotlin Compose compiler**: 1.3.2

## Naamgeving

- Package: `com.quinten.trainapp`
- App naam (strings.xml): `Train app`
