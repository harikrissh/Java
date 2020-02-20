import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
@WebServlet("/CheckUser")

public class CheckUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		PrintWriter out=response.getWriter();
		try{
			String a=request.getParameter("name");
			String b=request.getParameter("pwd");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","12345");
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from Customer");
			while(rs.next()){
				if(a.equals(rs.getString(2))&&b.equals(rs.getString(3))){
					out.print("Hello "+rs.getString(2));
				}
			}
			con.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
