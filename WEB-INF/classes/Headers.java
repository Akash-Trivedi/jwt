import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class Headers extends HttpServlet 
{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String title = "Servlet Example: Showing Request Headers";
		out.println("<HTML><HEAD><TITLE>" + title + "</TITLE></HEAD>");
		out.println("<BODY BGCOLOR=\"#FDF5E6\"><H1 ALIGN=\"CENTER\">" + title + "</H1>");
		out.println("<B>Request Method: </B>"+request.getMethod()+"<BR>");
		out.println("<B>Request URI: </B>" + request.getRequestURI() + "<BR>");
		out.println("<B>Request Protocol: </B>"+ request.getProtocol() + "<BR><BR>");
		out.println("<TABLE BORDER=1 ALIGN=\"CENTER\">");
		out.println("<TR BGCOLOR=\"#FFAD00\"><TH>Header Name<TH>Header Value");
		
        Enumeration headerNames = request.getHeaderNames();
		
        while(headerNames.hasMoreElements()) {
			String headerName = (String)headerNames.nextElement();
			out.println("<TR><TD>" + headerName);
			out.println(" <TD>" + request.getHeader(headerName));
		}
		out.println("</TABLE>\n</BODY></HTML>");
	}
    
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}
// import java.io.IOException;
// import java.io.PrintWriter;
// import javax.servlet.http.HttpServletResponse;
// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServlet;

// public class Headers extends HttpServlet{

//     public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
//         PrintWriter out= response.getWriter();
//         response.setContentType("text/html");
//         out.println(request.getContentLength());
//         out.println("<br>"+request.getParameter("age"));
//     }
// }