

### Compile single module
javac -d output/com.apress.moduleA com.apress.moduleA/module-info.java com.apress.moduleA/com/apress/moduleA/Main.java

### Run application containing single module
java --module-path output --module com.apress.moduleA/com.apress.moduleA.Main

java --module-path output -m com.apress.moduleA/com.apress.moduleA.Main

### Compile multiple module
javac -d output --module-source-path . com.apress.moduleA/module-info.java com.apress.moduleA/com/apress/moduleA/Main.java

javac -d output --module-source-path . $(find . -name "*.java")

### Create jar module (packaging module)
jar --create --file lib/com.apress.moduleA.jar --main-class com.apress.moduleA.Main -C output/com.apress.moduleA .

jar --create --file lib/com.apress.moduleB.jar -C output/com.apress.moduleB .

jar --create --file lib/com.apress.moduleC.jar -C output/com.apress.moduleC .

### Run module
java --module-path lib --module com.apress.moduleA

### Linking modules
jlink --module-path lib;$JAVA_HOME/jmods --add-modules com.apress.moduleA --add-modules com.apress.moduleB --add-modules com.apress.moduleC --launcher launcher=com.apress.moduleA --output image

jlink --module-path lib;$JAVA_HOME/jmods --add-modules com.apress.moduleA --add-modules com.apress.moduleB --add-modules com.apress.moduleC --launcher launcher=com.apress.moduleA --output imagez --compress 2 --strip-debug

### Run 
cd runtimeImage

bin\java --module com.apress.moduleA/com.apress.moduleA.Main

or 

bin\launcher.bat

sh bin\launcher
