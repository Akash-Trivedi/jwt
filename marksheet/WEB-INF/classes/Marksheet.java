import java.io.IOException;
import java.io.PrintWriter;

import java.util.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

public class Marksheet extends HttpServlet{

  public void doPost(HttpServletRequest request, HttpServletResponse res) throws ServletException, IOException{
    res.setContentType("text/html");//type of data to be sent back to client
    PrintWriter out= res.getWriter();
    out.println("<html><body>") ;

    int a, b, c, d, per;

    out.println("<table border='1.0'>");
    Enumeration sub= request.getParameterNames();//contain all the Enumeration objects of parameter names.
    
    while(sub.hasMoreElements()){
      String names= (String)sub.nextElement();
      out.println("<tr><td>"+names+
      "</td><td>"+request.getParameter(names)+"</td><tr>");
    }
    out.println("</table>");
    out.println("</body></html>");

  }

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    doPost(request, response);
  }
}
