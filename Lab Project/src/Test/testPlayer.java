package Test;



import Team.Player;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class testPlayer {
    @Test
    public void testPlayerConstructor() {
        Player player = new Player("John Doe");
        assertEquals("John Doe", player.getName());
        assertEquals("Not set", player.getPosition());
        assertEquals(0, player.getJerseyNumber());
        assertEquals(0, player.getPlayerMinutes());
        assertEquals("empty", player.getPlayernote());
        assertEquals(null, player.getRoster());
    }

    @Test
    public void testSetName() {
        Player player = new Player("");
        player.setName("Jane Smith");
        assertEquals("Jane Smith", player.getName());
    }

    @Test
    public void testSetPosition() {
        Player player = new Player("");
        player.setPosition("Forward");
        assertEquals("Forward", player.getPosition());
    }

    @Test
    public void testSetJerseyNumber() {
        Player player = new Player("");
        player.setJerseyNumber(10);
        assertEquals(10, player.getJerseyNumber());
    }

    @Test
    public void testSetPlayerMinutes() {
        Player player = new Player("");
        player.setPlayerMinutes(90);
        assertEquals(90, player.getPlayerMinutes());
    }

    @Test
    public void testSetPlayernote() {
        Player player = new Player("");
        player.setPlayernote("Note");
        assertEquals("Note", player.getPlayernote());
    }

    @Test
    public void testGetInfo() {
        Player player = new Player("John Doe");
        player.setPosition("Forward");
        player.setJerseyNumber(10);
        player.setPlayerMinutes(90);
        player.setPlayernote("Note");
        String expectedInfo = "Player Name: John Doe\n" +
                "Player Position: Forward\n" +
                "Player Jersey Number: 10\n" +
                "Player Minutes: 90\n" +
                "Player Note: Note";
        assertEquals(expectedInfo, player.getInfo());
    }


}
