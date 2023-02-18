import javax.swing.*;
import java.sql.*;
import java.awt.*;
public class databaseConnectivity {
    public static void main(String args[]) {

        try {
        	//Class.forName("com.mysql.jdbc.Driver"); 

Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadbc","root","amity");
		      if (mycon == null) {
		          System.out.println("JDBC connection is not established");
		          return;
		      }else{
		          System.out.println("Congratulations," + 
		               " JDBC connection is established successfully.\n");
		       // close JDBC connection
		       //con.close();

		    } 
			Statement stmt = mycon.createStatement();
			PreparedStatement ps = mycon.prepareStatement("insert into student values(?,?,?)");
			ps.setString(1,"6");
			ps.setString(2,"Mr.Amity");
			ps.setString(3,"engg");
			ps.execute();
			//PreparedStatement ps1 = mycon.prepareStatement("delete from  student where stdid ='4'");
			stmt.executeUpdate("delete from  student where stdid ='3'");
			stmt.executeUpdate("update student set stdname ='APJ' where stdid ='2'");

		ResultSet rs = stmt.executeQuery("select * from student");
		while(rs.next())
		{
			//System.out.println(rs.getString("stdid")+" "+rs.getString("stdname")+" "+rs.getString("course"));
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));

		}
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
}