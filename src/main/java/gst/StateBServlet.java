package gst;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StateBServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int id=Integer.parseInt(req.getParameter("id"));
	String name=req.getParameter("name");
	String color=req.getParameter("color");
	
	ServletContext context=getServletContext();
	String cgst=context.getInitParameter("cgst");
	
	ServletConfig config=getServletConfig();
	String sgstofstateb=config.getInitParameter("sgstofstateb");
	
	
	System.out.println(cgst);
	System.out.println(sgstofstateb);
}
}
