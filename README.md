# agroup-homework
Homework for AGROUP developer position.

## Author
Alina Kabashkina
25.10.2020

## Task
There is a file somewhere on disk with ASCII text (any book in English). JAVA program should take name of the file as a program argument. It should parse file text and identify all separate words. Then it should count every word occurrences and print out in System.out all identified words and number of their occurrences in specific order: more popular words come first.

## How to launch?
Compile code from "src" folder
```
  javac Main.java
```
Launch program 
```
  java Main {path to .txt file}
```
Example
```
  java Main ../newTestFile.txt // Relative path
  java Main /Users/alinakabashkina/NewTaskForAgroup/newTestFile.txt // Absolute Path
```

## Why Java 15.0.1?
Need to stay up-to-date with modern technologies. Java version was not specified in the requirements.

## What was used?
### Laptop 
MacBook Pro 15 macOS Catalina 10.15.7

### Environment
IntelliJ IDEA 2020.1 Ultimate Edition

## What was done?
Program works with .txt format files. Program was tested with Cyrillic and English ASCII symbols. There are two .txt files, with example texts, in root folder (newTestFile.txt and cleanCode.txt). Program prints given in arguments path, counts words in file, prints list of all words in file, sorts and count occurrences of words and prints in specific order.

In code there is variant with case-insensitive option. If you need case-sensitive option, comment line number 36.




