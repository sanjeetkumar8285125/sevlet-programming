package addex;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import  javax.servlet.http.*;
public class add extends HttpServlet  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		int num1=Integer.parseInt(req.getParameter("first"));
		if(num1%2==0) {
			pw.println(num1+" is even");
		}
		else
		{
		pw.println(num1+" is odd");
		}
		
	}
}
