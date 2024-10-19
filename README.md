---

# LogKat - KMP Log Library

[![Maven Central](https://img.shields.io/maven-central/v/io.github.prashant17d97/logkat.svg?label=Maven%20Central)](https://search.maven.org/artifact/io.github.prashant17d97/logkat)

The **LogKat** is a Kotlin Multiplatform (KMP) library that provides a unified solution for logging across Android and iOS platforms. This library simplifies cross-platform logging by eliminating the need for separate platform-specific code. With a single API, you can log messages that will appear in Android's Logcat or iOS's console, depending on the platform your app is running on.

### Key Features
- **Cross-Platform Logging**: Supports logging on both Android and iOS with no extra setup.
- **Unified API**: One simple API for logging across both platforms.
- **Color-Coded Output**: Logs are color-coded based on severity (Info, Debug, Warning, Verbose, Error) for easy identification.
- **Platform-Specific Output**: 
  - On Android, logs are sent to Logcat.
  - On iOS, logs appear in the console (stdout), ideal for debugging.

### Why Use LogKat?
Developers using Kotlin Multiplatform (KMP) often write separate logging logic for Android and iOS. This library eliminates that complexity by providing a **single-line logging solution** that works for both platforms. Here's why LogKat makes sense for your project:
- **Consistency Across Platforms**: No need to handle platform-specific log methods—use one consistent function.
- **Increased Productivity**: Spend less time on platform-specific logging code.
- **Ease of Integration**: Just add the library and start logging.

### iOS Logging Example
Here’s a sample of the log output in the iOS terminal console:

<img width="746" alt="iOS" src="https://github.com/user-attachments/assets/2f42155d-02bc-47bb-afb1-0548aa658d64">

### Android Logging Example
Here’s a sample of the log output in Android Logcat:

<img width="899" alt="Android" src="https://github.com/user-attachments/assets/44d08940-02b8-4f89-87b6-19108b5390dd">

## Installation

To use **LogKat**, add the following dependency in your Kotlin Multiplatform project:

### Gradle Setup

```kotlin
dependencies {
    implementation("io.github.prashant17d97:logkat:1.0.0")
}
```

Ensure your project is retrieving dependencies from Maven Central:

```kotlin
repositories {
    mavenCentral()
}
```

## How to Use

The library provides a simple API that handles platform-specific logging:

```kotlin
import io.github.prashant17d97.logkat.LogKat

LogKat.i("TestLogKat", "This is an informational message")
LogKat.d("TestLogKat", "Debugging message for developers")
LogKat.w("TestLogKat", "Warning: Something might be wrong!")
LogKat.v("TestLogKat", "Verbose message for detailed logging")
LogKat.e("TestLogKat", "Error occurred! Please investigate.")
```

### Example Output

#### Android (Logcat):
```
2024-10-19 21:15:13.217   6142-6142  MainApp                 com.connect.social                   D  DebugTest
2024-10-19 21:15:13.217   6142-6142  MainApp                 com.connect.social                   E  ErrorTest
2024-10-19 21:15:13.217   6142-6142  MainApp                 com.connect.social                   I  InfoTest
2024-10-19 21:15:13.217   6142-6142  MainApp                 com.connect.social                   V  VerboseTest
2024-10-19 21:15:13.217   6142-6142  MainApp                 com.connect.social                   W  WarningTest
```

#### iOS (Console):
```
2024-10-19 21:19:00.972524+0530 Connect[4962:41146884] 🔵 D   MainApp        DebugTest
2024-10-19 21:19:00.972600+0530 Connect[4962:41146884] 🔴 E   MainApp        ErrorTest
2024-10-19 21:19:00.972657+0530 Connect[4962:41146884] 🟢 I   MainApp        InfoTest
2024-10-19 21:19:00.972727+0530 Connect[4962:41146884] 🟣 V   MainApp        VerboseTest
2024-10-19 21:19:00.972786+0530 Connect[4962:41146884] 🟡 W   MainApp        WarningTest
```

### Supported Log Levels
The following log levels are supported, and each is color-coded:
- **INFO** (Green)
- **DEBUG** (Blue)
- **WARN** (Yellow)
- **VERBOSE** (Purple)
- **ERROR** (Red)

## How It Works

LogKat abstracts platform-specific logging:
- On **Android**, logs are sent to Logcat.
- On **iOS**, logs appear in the system console (stdout).

This means you use **one** line of code for both platforms without any additional platform checks or specific code.

## Get in Touch & Collaboration
If you have any questions or would like to collaborate, feel free to reach out!

- **Email**: [prashantsinghsca@gmail.com](mailto:prashantsinghsca@gmail.com)
- **LinkedIn**: [Prashant Kumar Singh](https://www.linkedin.com/in/prashant17d97)
- **Twitter**: [@prashant17d97](https://twitter.com/prashant17d97)

Contributions to the project are always welcome! Feel free to open issues or submit pull requests on [GitHub](https://github.com/prashant17d97/logkat).

## License
This library is distributed under the [MIT License](https://opensource.org/licenses/MIT). You are free to use, modify, and distribute it under the terms of this license.

---
