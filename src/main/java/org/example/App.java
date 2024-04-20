package org.example;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws LifecycleException {
        System.out.println( "Servlet World!" );
        Tomcat tomcat = new Tomcat();

        Context context = tomcat.addContext("", null);
        Tomcat.addServlet(context, "h1", new HelloServlet());
        context.addServletMappingDecoded("/hello", "h1");

        tomcat.getConnector();
        tomcat.start();
        tomcat.getServer().await();
    }
}
