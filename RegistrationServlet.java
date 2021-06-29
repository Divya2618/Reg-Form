
package java.matrimonial.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegistrationServlet extends HttpServlet {

    
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            try{ 
               String a =request.getParameter("email");
               String b =request.getParameter("password");
               String c =request.getParameter("profile");
               String d =request.getParameter("contact");
               String e =request.getParameter("name");
               String f =request.getParameter("age");
               String g =request.getParameter("gender");
               String h =request.getParameter("Bdate");
               String i =request.getParameter("address");
               String j =request.getParameter("country");
               String k =request.getParameter("city");
               String l =request.getParameter("state");
               String m =request.getParameter("pin");
               String n =request.getParameter("religion");
               String o =request.getParameter("education");
               String p =request.getParameter("height");
               String q =request.getParameter("caste");
               String r =request.getParameter("occupation");
               String s =request.getParameter("weight");
               String t =request.getParameter("scaste");
               String u =request.getParameter("salary");
               String v =request.getParameter("marital");
               
               
             
               Class.forName("com.mysql.jdbc.Driver");
               Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/matrimonial", "root", "root");
               PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
               
               ps.setString(1,a);
               ps.setString(2,b);
               ps.setString(3,c);             
               ps.setString(4,d);
               ps.setString(5,e);
               ps.setString(6,f);
               ps.setString(7,g);
               ps.setString(8,h);
               ps.setString(9,i);
               ps.setString(10,j);
               ps.setString(11,k);
               ps.setString(12,l);
               ps.setString(13,m);
               ps.setString(14,n);
               ps.setString(15,o);
               ps.setString(16,p);
               ps.setString(17,q);
               ps.setString(18,r);
               ps.setString(19,s);
               ps.setString(20,t);
               ps.setString(21,u);
               ps.setString(22,v);
                  ps.executeUpdate();
             out.println("Data Saved.");
           }catch (Exception e2) {out.println(e2);} 
            }  
        }
    }
  
  

