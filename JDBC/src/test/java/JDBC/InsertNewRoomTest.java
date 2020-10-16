package JDBC;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class InsertNewRoomTest {

    private static final Logger logger = LogManager.getLogger(InsertNewRoomTest.class);

    @Mock
    private DataSource ds;

    @Mock
    private Connection c;

    @Mock
    private PreparedStatement stmt;

    @Mock
    private Room room;

    @Before
    public void setUp() throws Exception {
        assertNotNull(ds);
        when(c.prepareStatement(any(String.class))).thenReturn(stmt);

        room = new Room();
        room.setId(1);
        room.setFair(150.0);
    }

    @Test
    public void insertRoom() throws Exception {
        new InsertNewRoom(ds).insertRoom(c);
    }

    @Test
    public void interrogatesTheDatabase() throws SQLException {
        c.prepareStatement("SELECT accommodation.type, accommodation.description, " +
                "accommodation.max_guests, room_fair.value, room_fair.season " +
                "FROM accommodation " +
                "Join accommodation_to_room_fair_relation " +
                "ON accommodation_to_room_fair_relation.id_accommodation = accommodation.id " +
                "Join room_fair " +
                "ON accommodation_to_room_fair_relation.id_room_fair = room_fair.id;");

        logger.info("The database was successfully queried");
    }
}