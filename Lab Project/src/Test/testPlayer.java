package Test;



import Team.BasketballPlayer;
import Team.Player;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class testPlayer {
      @Test
    public void testSetName() {
        Player player = new BasketballPlayer();
        player.setName("John");
        assertEquals("John", player.getName());
    }

    @Test
    public void testSetPosition() {
        Player player = new BasketballPlayer();
        player.setPosition("Forward");
        assertEquals("Forward", player.getPosition());
    }



}
