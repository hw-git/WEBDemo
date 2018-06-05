package org.lanqiao.web2;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletDemo2")
public class ServletDemo2 extends MyServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        ServletConfig servletConfig =  this.getServletConfig();
        String val = servletConfig.getInitParameter("username");
        System.out.println("username="+val);
       String name =  servletConfig.getServletName();
       System.out.println("servletName="+name);
      String aVal =  servletRequest.getParameter("a");
      String bVal = servletRequest.getParameter("b");
        System.out.println("a="+aVal +"----"+"b="+bVal);
      String encoding =   servletRequest.getCharacterEncoding();
        System.out.println("encoding="+encoding );
      String type=  servletRequest.getContentType();
        System.out.println("type="+type );

       PrintWriter  wirter =  servletResponse.getWriter();
        wirter.write("<html>");
        wirter.write("<head>");
        wirter.write("<title>hello world</title>");
        wirter.write("</head>");
        wirter.write("<body>");
        wirter.write("<title>hello world</title>");
       wirter.write("<h1>hello world</h1>");
        wirter.write("</body>");
        wirter.write("</html>");
    }
}
