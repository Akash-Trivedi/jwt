import java.util.*;
import java.io.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cookie1 extends HttpServlet{
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
        res.setContentType("text/html");
        PrintWriter p= res.getWriter();
        p.println("this is inside the servlet");
        Cookie ck[]= req.getCookies();
        if(ck!=null){
            for(int i=0; i<ck.length; i++){
                if(ck[i].getName().equals("name") && ck[i].getValue().equals("akash")){
                    p.println("welcome again!");
                }
            }
        } else{
            p.println("welcome new user");
            Cookie ck1= new Cookie("name", "akash");
            ck1.setMaxAge(60*2);
            res.addCookie(ck1);
        }
    }
}
