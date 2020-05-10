package JDBC;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertFair {
    private static final Logger logger = LogManager.getLogger(InsertFair.class);

    public static void insertFair(Connection connection) throws SQLException {

        try {
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }


        PreparedStatement insertFair1 =
                connection.prepareStatement("insert into room_fair " +
                        "(value, season) values " +
                        "(90.5 , 'summer' )");
        logger.info("The price for room 1 has been entered in the database");

        PreparedStatement insertFair2 =
                connection.prepareStatement("insert into room_fair " +
                        "(value, season) values " +
                        "(250, 'winter'  )");
        logger.info("The price for room 2 has been entered in the database");

        insertFair1.executeUpdate();
        insertFair2.executeUpdate();
        connection.commit();
        connection.rollback();

    }
}
