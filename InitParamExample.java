import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InitParamExample")
public class InitParamExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.print("<h1>Init Parameters are: ");
		Enumeration e=getServletConfig().getInitParameterNames();
		while(e.hasMoreElements()){
			out.print(e.nextElement()+ " ");
		}
		ServletConfig con1=getServletConfig();
		out.println("<h1>Company: "+con1.getInitParameter("Company"));
		out.println("Venue: "+con1.getInitParameter("Venue"));
		out.println("Training: "+con1.getInitParameter("Training"));
		
		/*out.println("<h1>Company: "+getServletConfig().getInitParameter("Company"));
		out.println("Venue: "+getServletConfig().getInitParameter("Venue"));
		out.println("Training: "+getServletConfig().getInitParameter("Training"));*/
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
