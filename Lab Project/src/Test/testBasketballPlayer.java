package Test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import Team.BasketballPlayer;

public class testBasketballPlayer {
    
    @Test
    public void testConstructorWithNamePositionJerseyNumPlayerMinutes() {
        BasketballPlayer player = new BasketballPlayer("LeBron James", "Small Forward", 6, 35);
        assertEquals("LeBron James", player.getName());
        assertEquals("Small Forward", player.getPosition());
        assertEquals(6, player.getJerseyNumber());
        assertEquals(35, player.getPlayerMinutes());
    }

    @Test
    public void testDefaultConstructor() {
        BasketballPlayer player = new BasketballPlayer();
        assertEquals("James", player.getName());
        assertEquals("Point Guard", player.getPosition());
        assertEquals(23, player.getJerseyNumber());
        assertEquals(40, player.getPlayerMinutes());
    }

    @Test
    public void testConstructorWithName() {
        BasketballPlayer player = new BasketballPlayer("Kobe Bryant");
        assertEquals("Kobe Bryant", player.getName());
        assertEquals("Not set", player.getPosition());
        assertEquals(0, player.getJerseyNumber());
        assertEquals(0, player.getPlayerMinutes());
    }

}