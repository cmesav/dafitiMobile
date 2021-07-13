# dafitiMobile
Mobile automation for dafiti app, to validate the registration and the possibility of adding a product to 
the shopping cart.

# Configuration
To execute the automation it is required to make some configurations, then it is explained how to make them:

* JDK: Install the java JDK, you can download from: https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
* IDE: Install an IDE, IntelliJ or eclipse: IntelliJ = https://www.jetbrains.com/es-es/idea/download/#section=windows 
                                            Eclipse = https://www.eclipse.org/downloads
* Install the dependency manager (Gradle) from the  https://gradle.org/install, in the manual installation section 
  select "Binary-only", download and unzip preferably directly on disk C.
* Install SDK with android studio.
* Install Apiumm.

# ENVIRONMENT VARIABLES: (configuration for windows)
* To configure the environment variables, in the start menu in the search bar type variable, in the results select
  the option "edit the system environment variables", in the system properties at the bottom select 
  "environment variables", there depending on the permissions on the computer (if you are administrator perform 
  it in the section "system environment variables" otherwise in "user variables". The following variables should
  be generated:
  * JAVA_HOME = path where java has been installed, example "C:\Program Files\Java\jdk1.8.0_281"
  * GRADLE_HOME = path where the gradle is decompressed, example "C:\Program Files\gradle-6.8"
  * After creating both variables, find the Path variable and edit, there they should be added as follows: 
    %JAVA_HOME%\bin %GRADLE_HOME%\bin.
  * The path where the drivers were stored should be included as a variable, for example: C:\BrowserDrivers.
  * ANDROID_HOME: path where is located the SDK folder, example: C:\Users\user\AppData\Local\Android\Sdk.
    
# Execution
* Run automation with the following command:
  gradlew clean test
  
# Evidence
The generated evidence is wired into the following path within the project folder:
    \target\site\serenity
* For the full report open index.html
* For single page report open serenity-summary
