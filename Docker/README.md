
#### <ins>Java application (Spring boot) to jar</ins>

   1.    If your project is maven project.

   2.    Add or check ur **_pom.xml_** file of the project for **_packaging_** tag

   3.    Go to the **_root folder of your project_** and run **_$mvn package_**

   4.    Check if your jar is created and placed in **_'target folder'_** 

#### <ins>Spring boot application in Docker container</ins>
     
   1.    Create a **_'Dockerfile'_** in root of your project

   2.    Make sure that the name of the _Dockerfile_ and there is **_no_** extension of this file

   3.    Add content in  the **_'Dockerfile'_** (to check the content go to the reference 
         link below.

   4.    Go to the directory where your **_Dockerfile_** in terminal

   5.    Run the command **$docker build -t spring-mysql .** (where **_spring-mysql_** is 
         name of the image to be created using the **_Dockerfile_** and, the dot **.** tells the location of your **_Dockerfile_**.

   6.    Now run that image by the command at terminial 
         **$docker run -d -p 8089:8089 --name my-spring-app spring-mysql** {where **_-d_** tells to run it in **_dettached_** mode, **_p_** tells the **_port no_**. (_edit in **application.properties** also_), **_--name_** tells the name the container, and **_spring-mysql_** tells the name of the image to run}


     Refer https://spring.io/blog/2018/11/08/spring-boot-in-a-container

####  <ins>Develop Sprint-boot and MySQL application and run in one docker</ins>
 For the above go to the links 
 
     1.   https://medium.com/thecodefountain/develop-a-spring-boot-and-mysql-application-and-run-in-docker-end-to-end-15b7cdf3a2ba

     2.   https://dzone.com/articles/all-about-hibernate-manytomany-association

#### <ins>Multi-Containers</ins>
     
     For learning Structure/framework of multi-containers refer https://docs.docker.com/get-started/07_multi_container/


#### <ins>For Refernce </ins>

     Follow the link for Reference https://www.youtube.com/watch?v=zJ6WbK9zFpI