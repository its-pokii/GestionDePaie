import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Connector {
    private static Connection instance = null;
    static final String URL = "jdbc:mysql://localhost:3306/gestion_paie";
    static final String USER = "root";
    static final String PASSWORD = "";
    public static Connection getInstance() throws SQLException {
        if (instance == null || instance.isClosed()) {
            instance = DriverManager.getConnection(URL, USER, PASSWORD);
        }
        return instance;
    }
}
