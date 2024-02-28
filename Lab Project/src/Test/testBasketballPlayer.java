package Test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import Team.BasketballPlayer;

public class testBasketballPlayer {
    
    @Test
    public void testBasketballPlayer() {
        // Creating a BasketballPlayer object
        BasketballPlayer player = new BasketballPlayer("John Doe", "Center", 23, 30);

        // Testing methods
        assertEquals("John Doe", player.getName());
        assertEquals("Center", player.getPosition());
        assertEquals(30, player.getPlayerMinutes());
        
        // Setting new values
        player.setName("Jane Doe");
        player.setPosition("Forward");
        player.setPlayerMinutes(25);

        // Testing methods after setting new values
        assertEquals("Jane Doe", player.getName());
        assertEquals("Forward", player.getPosition());
        assertEquals(25, player.getPlayerMinutes());
    }
}