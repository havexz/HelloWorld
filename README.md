Hello World!
============

Just a Hello World app.

Getting the Code
----------------

### One Way

* Download the code from 'https://github.com/havexz/HelloWorld/downloads'.
* Extract the code to a folder of your choice.

### Another Way

* Go to the folder where you want to get the code.
* `git clone git://github.com/havexz/HelloWorld.git`

Build Intructions
-----------------

* `cd HelloWorld`
* `mvn package`


Running the program
-------------------

### One Way - Easy to use

* `cd HelloWorld` if you are not already there.
* `mvn dependency:copy-dependencies`
* `mvn dependency:copy-dependencies`
* `cd target`
* `cp ../proj_meta/templates/log4j.properties ./`
* `../proj_meta/scripts/easyrunjava -c .,./dependency com.rokoder.adhoc.helloworld.HelloWorldMain`

### Another Way - Long command

* `cd HelloWorld` if you are not already there.
* `mvn dependency:copy-dependencies`
* `cd target`
* `cp ../proj_meta/templates/log4j.properties ./`
* `java -cp .:./dependency/slf4j-api-1.6.3.jar:./dependency/slf4j-log4j12-1.6.3.jar:./dependency/log4j-1.2.16.jar:HelloWorld-1.0.0-SNAPSHOT.jar com.rokoder.adhoc.helloworld.HelloWorldMain`

Building the java-doc
---------------------

* `cd HelloWorld` if you are not already there.
* `mvn javadoc:aggregate-jar`
* Java doc can be found in './target' folder with file name 'HelloWorld-<version>-javadoc.jar'

NOTE: Instruction above are for Mac OSX/Linux/Unix. For Windows you might need slight change for running. Replace ':' with ';'.
