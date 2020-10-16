package JDBC;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RoomFairTable {
    private static final Logger logger = LogManager.getLogger(RoomFairTable.class);

    static void createTableRoomFair(Connection connection) throws SQLException {

            PreparedStatement createTable =
            connection.prepareStatement(
                    "create table if not exists room_fair " +
                            "(" +
                            "id SERIAL primary key," +
                            "value double precision," +
                            "season varchar(32) " +
                            ")");
            createTable.executeUpdate();
        logger.info("RoomFairTable was created");

    }
}

