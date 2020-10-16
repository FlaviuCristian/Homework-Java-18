package JDBC;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;

public abstract class NewDatabase implements Connection {

    private static final Logger logger = LogManager.getLogger(NewDatabase.class);

    public static void createNewDatabase() {
        String JDBC_DRIVER = "java.sql.DriverManager";
        String DB_URL = "jdbc:postgresql://localhost:5432/";
        String USER = "postgres";
        String PASS = "123456";
        Connection connection;
        Statement statement;

        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            statement = connection.createStatement();

            String sql = "CREATE DATABASE booking";
            statement.executeUpdate(sql);
            logger.info("The database has been created");

            } catch (ClassNotFoundException exception) {
            exception.printStackTrace();
        } catch (SQLException sqlException) {
            logger.info("The database already exists");
        }
    }
}
