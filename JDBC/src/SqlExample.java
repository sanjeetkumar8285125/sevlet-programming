import java.sql.*;
public class SqlExample {
public static void main(String args[]) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student?serverTimezone=UTC","root","");
		
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from records");
		while(rs.next()) {
System.out.println(rs.getInt("rollno")+"  "+rs.getString("name")+" "+rs.getString("address")+" "+rs.getString("course"));
		}
		con.close();
	}
	catch(Exception e) {
		System.out.println(e);
	}

}

}

