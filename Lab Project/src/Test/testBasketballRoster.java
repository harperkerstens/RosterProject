package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import Team.BasketballPlayer;
import Team.BasketballRoster;

import org.junit.Test;

public class testBasketballRoster {
    /* 
      @Test
    public void testEstablishTeam() {
        BasketballRoster roster = new BasketballRoster();
        roster.establishTeam(); // Testing if the method runs without exceptions
        assertNotNull(roster.team); // Checking if the team array is initialized
        assertEquals(12, roster.getTeamSize()); // Checking if the team size is set correctly
    }

 /* 
    @Test
    public void testAddToTeam() {
        BasketballRoster roster = new BasketballRoster();
        roster.addToTeam(0, "Player 1"); // Adding a player to the first spot
        assertNotNull(roster.team[0]); // Checking if the player is added to the team
        assertEquals("Player 1", roster.team[0].getName()); // Checking if the player name is set correctly
    }
*/
    @Test
    public void testGetTeam() {
        BasketballRoster roster = new BasketballRoster();
        roster.addToTeam(0, "Player 1");
        roster.addToTeam(1, "Player 2");
        roster.getTeam(); // Testing if the method runs without exceptions
        // Manually verify output as this method prints to console
    }

    @Test
    public void testGetStarters() {
        BasketballRoster roster = new BasketballRoster();
        roster.addToTeam(0, "Player 1");
        roster.addToTeam(1, "Player 2");
        roster.addToTeam(2, "Player 3");
        roster.addToTeam(3, "Player 4");
        roster.addToTeam(4, "Player 5");
        roster.setStarters(0, new BasketballPlayer("Starter 1")); // Setting starter at the first spot
        roster.setStarters(1, new BasketballPlayer("Starter 2"));
        roster.setStarters(2, new BasketballPlayer("Starter 3"));
        roster.setStarters(3, new BasketballPlayer("Starter 4"));
        roster.setStarters(4, new BasketballPlayer("Starter 5"));
        roster.getStarters(); // Testing if the method runs without exceptions
        // Manually verify output as this method prints to console
    }

    @Test
    public void testGetSpecificPlayer() {
        BasketballRoster roster = new BasketballRoster();
        roster.addToTeam(0, "Player 1");
        roster.addToTeam(1, "Player 2");
        BasketballPlayer player = new BasketballPlayer("Specific Player");
        roster.addToTeam(2, player.getName());
        assertEquals(player, roster.getSpecificPlayer(2)); // Checking if the specific player is returned
    }

    @Test
    public void testSetStarters() {
        BasketballRoster roster = new BasketballRoster();
        BasketballPlayer player = new BasketballPlayer("Starter");
        roster.setStarters(0, player); // Setting starter at the first spot
        assertNotNull(roster.starters[0]); // Checking if the starter is set correctly
        assertEquals(player, roster.starters[0]); // Checking if the starter is set correctly
    }

}
