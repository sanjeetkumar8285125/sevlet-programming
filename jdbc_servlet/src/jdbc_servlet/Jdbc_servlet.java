package jdbc_servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Jdbc_servlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		String n=req.getParameter("name");
		int r=Integer.parseInt(req.getParameter("roll"));
		String add=req.getParameter("address");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student?serverTimezone=UTC","root","");
			 PreparedStatement ps = con.prepareStatement
                     ("insert into stud values(?,?,?)");

         ps.setString(1,n);
         ps.setInt(2,r);
         ps.setString(3,add);
         int i = ps.executeUpdate();
         
         if(i > 0) {
             pw.println("You are sucessfully registered");
         }
     
     }
     catch(Exception se) {
         System.out.println(se);
     }
		
	}

}
