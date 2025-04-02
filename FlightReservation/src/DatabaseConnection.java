import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/FlightReservation";
    private static final String USER = "root";
    private static final String PASSWORD = "DELSCORCHO2@";

    //method establishing and returning db connection
    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to the Database.");
        } catch (SQLException e) {
            System.out.println("Database connection failed: " + e.getMessage());
        }
        return conn;
    }
        public static void main(String[] args) {
        Connection tesConnection = connect();
        if (tesConnection != null) {
            System.out.println("Connection test successful!");
        }
    }
}
// javac -cp "lib/mysql-connector-j-9.1.0.jar" -d bin src/DatabaseConnection.java to compile
// java -cp "lib/mysql-connector-j-9.1.0.jar:bin" DatabaseConnection test connection