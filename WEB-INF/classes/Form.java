import java.io.IOException;
import java.util.Enumeration;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServlet;

public class Form extends HttpServlet{

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        PrintWriter out= response.getWriter();
        response.setContentType("text/html");
        // type of request.getParameterNames() is collections
        // hence stored in enumeration and now use its methods
        // to traaverse the list.
        Enumeration list= request.getParameterNames();

        while(list.hasMoreElements()){
            String s= (String)(list.nextElement());
            out.println(s+":"+request.getParameterValues(s)[0]+"<br/>");
        }
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        doPost(request, response);
    }
}