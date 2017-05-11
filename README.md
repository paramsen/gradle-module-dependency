# gradle-module-dependency

This repo showcases how one can include a "raw" Android project as an additional encapsulated Gradle module. 

The typical usecase would be when one finds a lib not published and thus cannot be included like `compile 'some-cool-lib:3.2.1'`. 

## Instructions

For this example I want to add [this library](https://github.com/GreaseMonk/android-timetable-core) into my app, apparently there are newer commits that the released version does not include.
I could simply copy-paste `src/main/java/com/greasemonk/timetable` into my `/src/main/java` but that would hurt my eyes each time I see it.  

Instead I:

1. Download the repo as a zip
2. [Paste the content into a new folder in the root of my Android project][1]
3. Sanitize the [new build.gradle][2] from all unecessary stuff
4. Add the new module to [./settings.gradle][3]
5. Add the dependency to my app module in its [build.gradle][4]
6. Run the app and resolve any build problems by sanitizing the [new build.gradle][2] if any occur
    * *Dry my eyes for the beauty of module dependencies is blinding*

[1]: https://github.com/paramsen/gradle-module-dependency/tree/master/android-timetable-core
[2]: https://github.com/paramsen/gradle-module-dependency/blob/master/android-timetable-core/build.gradle
[3]: https://github.com/paramsen/gradle-module-dependency/blob/master/settings.gradle
[4]: https://github.com/paramsen/gradle-module-dependency/blob/master/app/build.gradle#L30
