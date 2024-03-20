package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import Team.HockeyPlayer;
import Team.HockeyRoster;

import org.junit.Test;

public class testHockeyRoster {



    @Test
    public void testAddToTeamWithSlot() {
        HockeyRoster roster = new HockeyRoster();
        roster.addToTeam(0, "Player 1"); // Adding a player to the first spot
        assertNotNull(roster.team[0]); // Checking if the player is added to the team
        assertEquals("Player 1", roster.team[0].getName()); // Checking if the player name is set correctly
    }


    @Test
    public void testGetStarters() {
        HockeyRoster roster = new HockeyRoster();
        roster.addToTeam(0, "Player 1");
        roster.addToTeam(1, "Player 2");
        roster.addToTeam(2, "Player 3");
        roster.addToTeam(3, "Player 4");
        roster.addToTeam(4, "Player 5");
        roster.addToTeam(5, "Player 6");
        roster.setStarters(0, new HockeyPlayer("Starter 1")); // Setting starter at the first spot
        roster.setStarters(1, new HockeyPlayer("Starter 2"));
        roster.setStarters(2, new HockeyPlayer("Starter 3"));
        roster.setStarters(3, new HockeyPlayer("Starter 4"));
        roster.setStarters(4, new HockeyPlayer("Starter 5"));
        roster.setStarters(5, new HockeyPlayer("Starter 6"));
        roster.getStarters(); // Testing if the method runs without exceptions
        // Manually verify output as this method prints to console
    }

}
