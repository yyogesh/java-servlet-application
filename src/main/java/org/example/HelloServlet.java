package org.example;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

// @WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("In Service");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Hello Servlet</<h2>");
    }

//    http.createServer(function (req, res) {
//        res.writeHead(200, {'Content-Type': 'text/plain'});
//        res.write('Hello World!');
//        res.end();
//    }).listen(8080);
}
