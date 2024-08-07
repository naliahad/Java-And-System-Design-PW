package Module111;

public class servletTheory 
{

    public static void main(String[] args) {
        
    }
    /*
     Using Java we can build 2 types of application
a. Standalone applications(Using JSE)
b. WebApplication(using JEE)
++++++++++++++
Webapplication
++++++++++++++
The application which is developed using web related technologies like
html,css,javascript,angular,react,servlet,jsp) is called
webapplication.
eg:gmail.com,facebook.com
Note: webapplication provides services to the end user.
++++++++++++++++++++++++++++++
Request --- Response work flow
++++++++++++++++++++++++++++++
Server end
==========
1. Start the server and deploy the application inside the server.
2. Once the application is deployed, client can send the request.
Client end
==========
1. Browser sends the request to the deployed application using protocol called
"http".
Steps followed by the client to handle the request
++++++++++++++++++++++++++++++++++++++++++++++++++
a. browser sends the request(either for static or for dynamic)
b. server traps the request and identifiers whether the request is for
a. static resource
b. dynamic resoure
c. If the request is for static resource,then server only will take the copy of
that resource and sends the copy of the resource
as the response to the browser.
d. If the request is for static resource and if the resource is not available then
server will generate the response as
"404-page not found".
e. If the request is for dynamic resource, then server will identify for that
request which .java code should be executed.
f. To identify for a particular resource, which java file server will use
"web.xml/annotation".
g. Once the required java code is available then server will handover the control
to "container".
i. Container will execute the java code based on its "LifeCycle-Actions".
How to install tomcat server?
a. Go to the following link
https://tomcat.apache.org/download-90.cgi
b. click on 32-bit/64-bit Windows Service Installer (pgp, sha512)
c. Once the download starts, double click and install the set up file
d. During the installation it will ask for password supply the password as
"root123" and change the http-port-no :: 9999.
e. Once the installation is ready, just go to C:\tomcat9.0\bin\tomcat9.exe
f. Double click on that file and check the status of te server(
(11-Aug-2023 19:52:37.897 INFO [main] org.apache.catalina.startup.Catalina.start
Server startup in [10543] milliseconds)
++++++++++++++++++++++++++++++++++
Configuring eclipse with tomcat9.0
++++++++++++++++++++++++++++++++++
1. Click on Server tab
2. Select Apache folder(tomcat9.0)
3. Click on next
4. Click on finsih(make sure the server tab is filled with tomcat file)
5. Select tomcat9.0 file and start the server(check in conosle for the information
like server startup)

*/
}
