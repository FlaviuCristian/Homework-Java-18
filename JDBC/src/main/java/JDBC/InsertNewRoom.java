package JDBC;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertNewRoom {

    private final DataSource ds;

    public InsertNewRoom(DataSource ds) {
        this.ds = ds;
    }

    private static final Logger logger = LogManager.getLogger(InsertNewRoom.class);

    public static void insertRoom(Connection connection) throws SQLException {

        try {
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }
            PreparedStatement insertRoom1 =
                    connection.prepareStatement("insert into accommodation " +
                            "(type, bed_type, max_guests, description) values " +
                            "('basic','single', 1, 'basic_room' )");
        logger.info("Room 1 has been added to the database");

            PreparedStatement insertRoom2 =
                    connection.prepareStatement("insert into accommodation " +
                            "(type, bed_type, max_guests, description) values " +
                            "('studio', 'king', 2, 'premium_room'  )");

        logger.info("Room 2 has been added to the database");

            insertRoom1.executeUpdate();
            insertRoom2.executeUpdate();
            connection.commit();
            connection.rollback();
    }
}

