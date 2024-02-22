package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author OS
 */
public class DBContext {
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection conn = null;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        String url = "jdbc:sqlserver://" + serverName + ":" + portNumber + ";databaseName=" + dbName;
        conn = DriverManager.getConnection(url, user, password);
        return conn;
    }

    private final String serverName = "localhost";
    private final String portNumber = "1433";
    private final String user = "sa";
    private final String password = "1234";
    private final String dbName = "DonationMng";
}