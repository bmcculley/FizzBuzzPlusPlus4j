# FizzBuzzPlusPlus4j
A basic FizzBuzz implementation that will allow for unit testing.

## First Steps
Currently this is only setup to run on Linux. It's written in Java so it should work on all
systems, but you'll need to create your own scripts to build and run.

 * You'll need to have both java and wget installed.
 * Clone or download the repository and cd into it.
 * Run the `build.sh` script, this will create a child directory `lib` and download both
   ** junit-4.12.jar
   ** hamcrest-core-1.3.jar
   then it will compile both `FizzBuzz.java` and `FizzBuzzTest.java`
 * Now it's time to run the tests with `runTest.sh`. Currently there are 4 tests and all should pass.

 