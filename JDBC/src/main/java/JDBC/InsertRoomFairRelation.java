package JDBC;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertRoomFairRelation {
    private static final Logger logger = LogManager.getLogger(InsertRoomFairRelation.class);

    public static void insertRoomFairRelation(Connection connection) throws SQLException {

        PreparedStatement insertRoomFairRelation =
                connection.prepareStatement("insert into accommodation_to_room_fair_relation " +
                        "(id_accommodation, id_room_fair) values " +
                        "(1, 1 ),(2,1),(1,2),(2,1)"
                );
        logger.info("Room - Fair relation has been created");
        insertRoomFairRelation.execute();
    }
}
