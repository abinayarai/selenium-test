This is a project for testing Voltdb Management Center using selenium.

Run the command

./gradlew test (For Linux)

gradlew.bat (For Windows)


To change the test url, you can make changes in the build.gradle or in the command line add

./gradlew test --Purl=http://192.168.1.1:8080

where http://192.168.1.1:8080 is the test url.


To take screenshots in the tests add the following command where you want the screenshot

takeScreenshot(name.getMethodName(), "test");

Here, name.getMethodName() gives the test method as the prefix of the filename "test" is the suffix you want to give to the screenshot file.

Screenshots get saved in a folder with name 'screenshots' inside the main folder 'selenium-test'.