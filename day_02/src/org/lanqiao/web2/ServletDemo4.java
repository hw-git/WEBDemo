package org.lanqiao.web2;

import javax.servlet.*;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet(name = "ServletDemo4" ,urlPatterns = {"/demo4","/hello"},initParams = {@WebInitParam(name="username",value="root")})
@WebServlet("/world")
public class ServletDemo4 extends GenericServlet {


    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("注解配置.....");
        ServletConfig config =  this.getServletConfig();
        String value = config.getInitParameter("username");
        System.out.println("username = " + value);
    }
}
