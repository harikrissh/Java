import java.sql.*;
import java.util.*;
public class DatabaseDemo {

	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://localhost:3306/mydb";
		String username="root";
		String password="12345";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection sqlCon=DriverManager.getConnection(url,username,password);
		Statement st=sqlCon.createStatement();
		String selectAll="select * from Vendor";
		String insertExample="insert into Vendor(VendorName, VendorPassword, VendorMobile, VendorAddress) values(?,?,?,?);";
		
		PreparedStatement ps=sqlCon.prepareStatement(insertExample);
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter vendor name");
		String vname=s.next();
		System.out.println("Enter vendor password");
		String vpwd=s.next();
		System.out.println("Enter vendor mobile");
		String vmob=s.next();
		System.out.println("Enter vendor location");
		String vloc=s.next();
		ps.setString(1, vname);
		ps.setString(2, vpwd);
		ps.setString(3, vmob);
		ps.setString(4, vloc);
		int rowInserted=ps.executeUpdate();
		if(rowInserted>0){
			System.out.println("Row inserted");
		}
		ResultSet result=st.executeQuery(selectAll);
		while(result.next()){
			System.out.println(result.getInt(1)+" "+result.getString(2)+" "+result.getString(3)+" "+result.getString(4)+" "+result.getString(5));
		}
		ps.close();
		st.close();
		sqlCon.close();

	}

}
