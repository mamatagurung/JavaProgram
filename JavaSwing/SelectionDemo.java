import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String dburl = "jdbc:mysql://localhost:3306/java";
		String username ="root";
		String password ="";
		
		try(Connection conn = DriverManager.getConnection(dburl, username, password)){
			
//			System.out.println("connection Successful");
			String query = "select * from users";
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(query);
			
			while(result.next()) {
				String name = result.getString("username");
				String pass = result.getString("password");
				String fullname = result.getString("fullname");
				String email = result.getString("email");
				
				System.out.println("Name= "+name +" Password = "+pass+ " Fullname = "+fullname +" Email :"+email);
			}
			
			
			
			
		}catch(SQLException e) {
			
		}
	}

}
