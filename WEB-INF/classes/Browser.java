import java.util.*;
import java.io.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Browser extends HttpServlet{
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
        PrintWriter p= res.getWriter();
        String color="red";
        res.setContentType("text/html");
        if(req.getHeader("user-agent").contains("Firefox")){
            color="yellow";
        }
        p.println("<html><body bgcolor=\""+color+"\"</body></html>");
    }
}