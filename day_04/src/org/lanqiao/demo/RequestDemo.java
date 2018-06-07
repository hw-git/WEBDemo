package org.lanqiao.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/requestDemo")
public class RequestDemo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request ,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.setCharacterEncoding("UTF-8");
       int  length =  request.getContentLength();
        System.out.println("contentLength="+ length);
        String type = request.getContentType();
        System.out.println("ContentType="+ type);
        String addr =  request.getLocalAddr();
        System.out.println("LocalAddr="+ addr);
       String encoding =  request.getCharacterEncoding();
        System.out.println("CharacterEncoding="+ encoding);
        String  path = request.getContextPath();
        System.out.println("ContextPath="+ path);
        String uri = request.getRequestURI();
        System.out.println("RequestURI="+ uri);
       String url =  request.getRequestURL().toString();
        System.out.println("RequestURL="+ url);
       String remoteAddr =  request.getRemoteAddr();
        System.out.println("remoteAddr="+ remoteAddr);
        //获取请求数据
       String  username =  request.getParameter("username");
        System.out.println("username="+ username);
      String  password =  request.getParameter("password");
        System.out.println("password="+ password);
        String[] usernames = request.getParameterValues("username");
        System.out.println(usernames.length);
    }
}
