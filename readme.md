# project page generator
### Video Demo

[![Video](http://img.youtube.com/vi/hYXd5P7yjos/0.jpg)](https://www.youtube.com/watch?v=hYXd5P7yjos "project page generator")
## About
This is a tool that a created to help me create webpages for my projects based on screenshots, title and description.
## How to use
1. Edit title and description in dist/data.text
2. Add images to folder dist/img
3.
   * Option 1:

    In a terminal do the following:
```
cd project-page-generator/dist
java -jar Project_page_generator.jar
```
A file named index.html should be created.

   * Option 2:

    Windows: double-click generate.bat  
    Linux: make generate.sh executable then double-click generate.sh

    A file named index.html should be created.


## More details

The .jar executable included in dist/ is compiled to work with java 5+
the project uses the [org.json](http://mvnrepository.com/artifact/org.json/json) to parse the JSON in data.txt, the library is included with the .jar .
