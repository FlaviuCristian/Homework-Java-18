package JDBC;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AccommodationToRoomFairRelationTable {
    private static final Logger logger = LogManager.getLogger(AccommodationToRoomFairRelationTable.class);

    static void createTableAccommodationToRoomFairRelationTable(Connection connection) throws SQLException {

            PreparedStatement createTable =
                    connection.prepareStatement(
                            "create table if not exists accommodation_to_room_fair_relation " +
                                    "(" +
                                    "id SERIAL not null," +
                                    "id_accommodation int, " +
                                    "id_room_fair int," +
                                    "primary key(id)," +
                                    "foreign key(id_accommodation) references accommodation(id),"+
                                    "foreign key(id_room_fair) references room_fair(id))");
            createTable.execute();
            logger.info("AccommodationToRoomFairRelationTable was created");
    }
}