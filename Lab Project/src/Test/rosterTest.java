package Test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


import Team.BasketballRoster;


public class rosterTest {

    @Test
    public void testInitTeam() {
        BasketballRoster basketballRoster = new BasketballRoster();
        assertEquals(13, basketballRoster.getTeamSize());
        //assertEquals(5, basketballRoster.getStarters().length);
    }



}
