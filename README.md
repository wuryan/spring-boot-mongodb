##Spring Boot Mongodb simple demo##
###Specification###
- This application based on spring boot framework.
- If you want to run this demo you should install the mongodb on your operating system, Linux, OSX or something.

###Run server application###
- Download the mongodb installer from the website.[Click me to the download page.](http://www.mongodb.org/ "Click to the mongodb homepage")
- Uncompress the mongodb installer file. e.g. on Ubuntu server.
    ```
    tar -zvf mongodb.gz
    ```
- Start your mongodb server on operating system.
    ```
    cd mongodb  
    ./mongod
    ```
- Import the project to your java IDE.
- Config the spring boot connection uri, plz modify the `project -> resources -> applicatoin.properties` file.
- Run the `RunApplication.java`

###Run web demo###
- Install `Node.js`
- Install `npm`, if you are in china, you can use ***taobao*** repository that you download the modules will become more faster.
    ```
    npm install
    npm start
    ```
- navigate your browser to `http://localhost:8000/app/index.html` to see the app running in your browser.

###Feedback###
- If your find any bug, plz write email to me, my email address is zhouxy.vortex@gmail.com or you can write the bug description on issures.[https://github.com/JameChou/spring-boot-mongodb/issues](https://github.com/JameChou/spring-boot-mongodb/issues)

