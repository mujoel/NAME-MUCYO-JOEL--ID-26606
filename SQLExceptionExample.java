import java.sql.*;

public class SQLExceptionExample {
    public static void main(String[] args) {
        try {
            // Attempting to connect to a non-existent database
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/invalidDB", "user", "password");
        } catch (SQLException e) {
            System.out.println("SQLException caught: " + e.getMessage());
        }
    }
}

