package org.lanqiao.servletdemo;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

public class ServletDemo2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        //获取serveltContext对象    需要ServletConfig
//       ServletConfig  config  = this.getServletConfig();
//       ServletContext application  = config.getServletContext();
//       String appname = application.getInitParameter("appname");
//        System.out.println("appname = " + appname);
//        String realPath = application.getRealPath("Notes.txt");//通过该方法返回相对路径的资源的真实物理路径
//        System.out.println("realPath = " + realPath);
//        InputStream in  =  application.getResourceAsStream("Notes.txt");//将资源文件作为流对象返回
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
        response.setContentType("text/html;charset=utf-8");//设置响应的内容类型及其字符编码
        PrintWriter out =  response.getWriter();
        out.write("<h1>当前访问次数为：" + count+"</h1>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doPost(request,response);
    }
}
