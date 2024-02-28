package Test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


import Team.BasketballPlayer;
import Team.BasketballRoster;
import Team.HockeyRoster;
import Team.Player;
import Team.Roster;


public class rosterTest {

    @Test
    public void testInitTeam() {
        BasketballRoster basketballRoster = new BasketballRoster();
        assertEquals(13, basketballRoster.getTeamSize());
        //assertEquals(5, basketballRoster.getStarters().length);
    }



}
