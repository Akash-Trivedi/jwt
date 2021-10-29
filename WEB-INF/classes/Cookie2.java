import java.util.*;
import java.io.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cookie2 extends HttpServlet{
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
        res.setContentType("text/html");
        boolean found=false;
        PrintWriter p= res.getWriter();
        Cookie ck[]= req.getCookies();
        if(ck!=null){
            // this will print only when it gets the cookies
            // hence if not matched then it will print nothing
            for(int i=0; i<ck.length; i++){
                if(ck[i].getName().equals("name") && ck[i].getValue().equals("akash")){
                    p.println("welcome again!");
                    found=true;
                }
            }
            if(!found){
                p.println("Welcome new user among others");
                Cookie newUser= new Cookie("name-user", "Akash-Trivedi");
                // cookie value contains '-'
                res.addCookie(newUser);
            }
        } else{
            p.println("welcome new user");
            Cookie ck1= new Cookie("name", "akash");
            ck1.setMaxAge(60*2);
            res.addCookie(ck1);
        }
    }
}
