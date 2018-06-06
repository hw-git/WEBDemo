package org.lanqiao.servletdemo;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

//@WebServlet("/servletDemo1")
public class ServletDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        ServletConfig config = this.getServletConfig();
////        String username = config.getInitParameter("username");
////        System.out.println("username=" + username);
////        String servletName = config.getServletName();
////        System.out.println("servletName=" + servletName);
////        Enumeration<String>  paramNames =  config.getInitParameterNames();
////        while(paramNames.hasMoreElements()){
////            String name = paramNames.nextElement();
////            String  value = config.getInitParameter(name);
////            System.out.println("paraName=" + name + "------value =" + value);
////        }


        ServletContext application = this.getServletContext();
        Integer count =   (Integer)application.getAttribute("count");
          if(count == null){

              count = 0;
              application.setAttribute("count",count);
          }else{
              count++;
              application.setAttribute("count",count);
          }
          count = (Integer) application.getAttribute("count");
        PrintWriter out =  response.getWriter();
          out.write("<h1>当前访问次数为：" + count+"</h1>");
        }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doPost(request,response);
    }
}
