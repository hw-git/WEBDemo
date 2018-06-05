package org.lanqiao.web;

import javax.servlet.*;
import java.io.IOException;

public class FirstServlet implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

        System.out.println("init........");
        String  paramValue = servletConfig.getInitParameter("hello");
       String servletName =  servletConfig.getServletName();
        System.out.println("servletConfig = [" + servletName + "]");
        System.out.println(paramValue);
    }

    @Override
    public ServletConfig getServletConfig() {
        System.out.println("getServletConfig........");
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service........");
}

    @Override
    public String getServletInfo() {
        System.out.println("getServletInfo........");
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("destroy........");
    }
}
