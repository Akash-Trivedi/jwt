import java.util.*;
import java.io.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StatusCodes extends HttpServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        PrintWriter p= response.getWriter();
        response.setStatusCode(response.SC)
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
        doPost(req, res);
    }
}