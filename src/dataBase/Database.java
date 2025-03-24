package dataBase;
import java.sql.Connection;
import java.sql.DriverManager;
public class Database {
    private static final String URL = "jdbc:mysql://localhost:3306/your_db_name";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
