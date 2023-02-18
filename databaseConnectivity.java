import javax.swing.*;
import java.sql.*;
import java.awt.*;
public class databaseConnectivity {
    public static void main(String args[]) {

        try {
        	//Class.forName("com.mysql.jdbc.Driver"); 
		
		//establish the connection with mysql database

Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadbc","root","amity"); 
		       // javadbc is name of database , root is username of mysql, amity is password for mysql database
		      if (mycon == null) {
		          System.out.println("JDBC connection is not established");
		          return;
		      }else{
		          System.out.println("Congratulations," + 
		               " JDBC connection is established successfully.\n");
		       // close JDBC connection
		       //con.close();

		    } 
		//insert records into student table(contains 3 fields) under database name javadbc
			Statement stmt = mycon.createStatement();
			PreparedStatement ps = mycon.prepareStatement("insert into student values(?,?,?)");
			ps.setString(1,"2");     //1st field --> stdid (firstfield ,stdid)
			ps.setString(2,"Ananya");   //2nd field--> student name (secondfield ,stdname)
			ps.setString(3,"Engg");  //3rd field --> course (thirdfield ,course)
			ps.execute();
		// for delete and update record ,uncomment following command
			//PreparedStatement ps1 = mycon.prepareStatement("delete from  student where stdid ='4'");
			//stmt.executeUpdate("delete from  student where stdid ='3'");
			//stmt.executeUpdate("update student set stdname ='Kartikey' where stdid ='2'");

		ResultSet rs = stmt.executeQuery("select * from student"); // to see every row of student table
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
