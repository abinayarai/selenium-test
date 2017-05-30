This is a project for testing Voltdb Management Center using selenium.

Run the command

./gradlew test (For Linux)

gradlew.bat (For Windows)


To change the test url, you can make changes in the build.gradle or in the command line add

./gradlew test --Purl=http://192.168.1.1:8080

where http://192.168.1.1:8080 is the test url.