package hello;

import java.io.*;
import javax.servlet.*;

public class HelloServlet extends GenericServlet {
    
    public void service(ServletRequest request, ServletResponse response) 
        throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.println("<!DOCTYPE html>\n"+
		"<html>\n"+
		"<head>\n"+
		"<meta charset='UTF-8'>\n"+
                 "<title>HelloServlet</title>\n"+
                 "</head>\n"+
                 "<body>\n" +
                "<h2>HelloServlet</h2>\n" +
		"Go <a href='" +
                request.getServletContext().getContextPath()+
		//request.getServletContext().getContextPath() +
		"'>Back</a>\n"+
		"</body>\n"+
        "</html>");
        pw.close();
    } 
    
} 