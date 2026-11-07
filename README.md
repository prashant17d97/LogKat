# LogKat

A small Kotlin Multiplatform logging library that gives Android and iOS apps one shared logging API.

## What it does

LogKat lets shared Kotlin code write log messages without branching into platform-specific logging calls.

- Android: writes to Logcat.
- iOS: writes to the Xcode/device console.
- Log levels: verbose, debug, info, warning, and error.

## Add the dependency

Add Maven Central to your repositories if it is not already configured:

```kotlin
repositories {
    mavenCentral()
}
```

Then add LogKat to the shared module:

```kotlin
commonMain.dependencies {
    implementation("io.github.prashant17d97:logkat:1.0.0")
}
```

## Use it

```kotlin
import io.github.prashant17d97.logkat.LogKat

LogKat.v("Home", "Verbose message")
LogKat.d("Home", "Debug message")
LogKat.i("Home", "Screen opened")
LogKat.w("Home", "Unexpected response")
LogKat.e("Home", "Request failed")
```

The same calls can be made from shared Kotlin code. LogKat routes the output to the platform's logging destination.

## Output examples

The screenshots below show sample output on each platform.

### Android

![LogKat output in Android Logcat](https://github.com/user-attachments/assets/44d08940-02b8-4f89-87b6-19108b5390dd)

### iOS

![LogKat output in the iOS console](https://github.com/user-attachments/assets/2f42155d-02bc-47bb-afb1-0548aa658d64)

## Project

- Package: `io.github.prashant17d97:logkat`
- Published through: Maven Central
- Platforms documented here: Android and iOS

## License

[Apache License 2.0](LICENSE)
