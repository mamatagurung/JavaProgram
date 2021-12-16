import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dburl = "jdbc:mysql://localhost:3306/java";
		String username ="root";
		String password ="";
		
		try(Connection conn = DriverManager.getConnection(dburl, username, password)){
			
			String query ="INSERT INTO users (username, password, fullname, email) VALUES (?,?,?,?)";
			PreparedStatement statement = conn.prepareStatement(query);
			
			statement.setString(1, "Kathmandu");
			statement.setString(2, "secretkey");
			statement.setString(3, "Kailash Pandey");
			statement.setString(4, "kailash@gmail.com");
			
			int row = statement.executeUpdate();
			
			if(row>0) {
				System.out.println("Data inserted Successfully");
			}
			
			
			
		}catch(SQLException e) {
			
		}

	}

}
