import java.util.*;
import java.io.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Redirect extends HttpServlet{
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
        PrintWriter p= res.getWriter();
        res.setContentType("text/html");
        if(req.getHeader("referer")!=null){
            p.println("you got it right");
        } else{
            res.sendRedirect("http://localhost:8080/redirect1/");
        }
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
        doPost(req, res);
    }
}