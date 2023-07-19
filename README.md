# Lab: Class 08
CF401 Java Partnered Lab: Class 08


## Feature Tasks

Use the file recent quotes.json to show random popular book quotes. Your program should use GSON to parse the 
.json file. The app needs no functionality other than showing the quote and the author when it is run. 
The app should choose one quote each time it is run.

### so what’s interesting here?

The interesting parts of this lab are:
- How do I use GSON?
- What class(es) should I write to encapsulate this functionality?
- How does the App class use the class(es) I write?
- How do I test this functionality?

[Link to the GSON Repository](https://github.com/google/gson)

### Gradle:
    `dependencies {
        implementation 'com.google.code.gson:gson:2.10.1'
    }`

**JPMS dependencies (Java 9+)**
These are the optional Java Platform Module System (JPMS) JDK modules which Gson depends on. 
This only applies when running Java 9 or newer.

***`java.sql` (optional since Gson 2.8.9)***
When this module is present, Gson provides default adapters for some SQL date and time classes.

***`jdk.unsupported`, respectively class `sun.misc.Unsafe` (optional)***
When this module is present, Gson can use the Unsafe class to create instances of classes without no-args constructor. 
However, care should be taken when relying on this. Unsafe is not available in all environments and its usage has some 
pitfalls, see `GsonBuilder.disableJdkUnsafe()`.

## Stretch Goals

* Note that if you implement any of these stretch goals, you should also write tests for them!

1. Allow users to type in an author (on the command line) and return a quote by that author.
2. Allow users to type in a word (on the command line) and return a quote that contains that word.
3. Allow both of those things at the same time, with two different command line args (for example, ./gradlew run --args "author Chimamanda" vs ./gradlew run --args "contains work")
