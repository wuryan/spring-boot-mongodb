##Spring Boot Mongodb simple demo##
###<i class="icon-file-text"></i>Specification###
- This application based on spring boot framework.
- If you want to run this demo you should install the mongodb on your operating system, Linux, OSX or something.

###<i class="icon-cog"></i>Configuration###
- Download the mongodb installer from the website.[Click me to the download page.](http://www.mongodb.org/ "Click to the mongodb homepage")
- Uncompress the mongodb installer file. e.g. on Ubuntu server.  
    tar -zvf mongodb.gz
- Start your mongodb server on operating system.  
    cd mongodb  
    ./mongod
- Import the project to your java IDE.
- Config the spring boot connection uri, plz modify the project -> resources -> applicatoin.properties file.
- Run the RunApplication.java
- Broswe the *****localhost:8080/api/v/save***** to insert a document to your mongodb server.
- Broswe the *****localhost:8080/api/v/{id}***** to view a document in JSON data format.  

###<i class="icon-bullhorn"></i>Report###
- If your find any bug, plz write email to me, my email address is zhouxy.vortex@gmail.com or you can write the bug description on issures.[https://github.com/JameChou/spring-boot-mongodb/issues](https://github.com/JameChou/spring-boot-mongodb/issues)

