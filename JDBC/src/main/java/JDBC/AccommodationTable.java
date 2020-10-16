package JDBC;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AccommodationTable {
    private static final Logger logger = LogManager.getLogger(AccommodationTable.class);

    public static void createTableAccommodation(Connection connection) throws SQLException {

        PreparedStatement createTable =
                connection.prepareStatement(
                        "create table if not exists accommodation " +
                                "(" +
                                "id SERIAL primary key," +
                                "type varchar(32), " +
                                "bed_type varchar(32), " +
                                "max_guests int," +
                                "description varchar(512) " +
                                ")");
        createTable.executeUpdate();
        logger.info("AccommodationTable was created");
    }
}