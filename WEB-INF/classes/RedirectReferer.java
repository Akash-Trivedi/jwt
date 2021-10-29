/*
*refering to the first page and then deciding whether to
*let go to another page. by checking the link.
*/
import java.util.*;
import java.io.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirectReferer extends HttpServlet{
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
        PrintWriter p= res.getWriter();
        res.setContentType("text/html");
        if(req.getHeader("referer")!=null){
            // cannot integrate it in single if because for null
            // string conversion is not allowed
            if(req.getHeader("referer").equals("http://localhost:8080/jwt/checkreferer.html"))
                p.println("you got it right");
            else
                res.setStatus(HttpServletResponse.SC_PRECONDITION_FAILED);
        } else{
            res.sendRedirect("http://localhost:8080/jwt/redirectsuccess.html");
        }
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
        doPost(req, res);
    }
}