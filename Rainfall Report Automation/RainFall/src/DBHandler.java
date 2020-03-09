
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBHandler {
	static Connection connection;

	//Write the required business logic as expected in the question description
	public static Connection establishConnection() {

		//fill the code
try(InputStream input = new FileInputStream("src/db.properties");){
			
			Properties prop = new Properties();
			prop.load(input);
			Class.forName(prop.getProperty("db.classname"));
			connection = DriverManager.getConnection(
				prop.getProperty("db.url"),
				prop.getProperty("db.username"),
				prop.getProperty("db.password"));
			
			
		} catch (IOException | ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	return connection;
	}
	
	public static void main(String[] args) {
		System.out.println(DBHandler.establishConnection());
	}

	}

