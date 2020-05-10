package JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import static JDBC.AccommodationTable.createTableAccommodation;
import static JDBC.AccommodationToRoomFairRelationTable.createTableAccommodationToRoomFairRelationTable;
import static JDBC.ConnectionToDatabase.newConnection;
import static JDBC.InsertFair.insertFair;
import static JDBC.InsertNewRoom.insertRoom;
import static JDBC.InsertRoomFairRelation.insertRoomFairRelation;
import static JDBC.NewDatabase.createNewDatabase;
import static JDBC.RoomFairTable.createTableRoomFair;

public class JdbcMain{

    public static void main(String[] args) throws SQLException {

        createNewDatabase();

        Connection connection = newConnection("postgresql", "localhost", "5432",
                "booking", "postgres", "123456");

        createTableAccommodation(connection);
        createTableRoomFair(connection);
        createTableAccommodationToRoomFairRelationTable(connection);
        insertRoom(connection);
        insertFair(connection);
        insertRoomFairRelation(connection);
    }
}
