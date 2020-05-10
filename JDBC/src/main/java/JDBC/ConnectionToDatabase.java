package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class ConnectionToDatabase implements Connection {
    static Connection newConnection(
            String type, String host, String port,
            String dbName, String user, String password)
    {
        String url = "jdbc:" + type + "://" + host + ":" + port + "/" + dbName +
                "?user=" + user + "&password=" + password;;

        System.out.println(url);

        try {
            return DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
