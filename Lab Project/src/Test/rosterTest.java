package Test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import Team.Player;
import Team.Roster;


public class rosterTest {

    

        @Test
        public void testSetStartersSize() {
            Roster roster = new Roster();
            roster.setStartersSize(5);
            assertEquals(5, roster.starterSize);
        }
    
        @Test
        public void testSetTeamSize() {
            Roster roster = new Roster();
            roster.setTeamSize(10);
            roster.initTeam();
            assertEquals(10, roster.getTeamSize());
        }
    
        @Test
        public void testInitTeam() {
            Roster roster = new Roster();
            roster.setTeamSize(10);
            roster.setStartersSize(5);
            roster.initTeam();
            assertNotNull(roster.team);
            assertNotNull(roster.starters);
            assertEquals(10, roster.team.length);
            assertEquals(5, roster.starters.length);
        }



    @Test
    public void testGetSpecificPlayer() {
        Roster roster = new Roster();
        Player player = new Player("Test Player");
        roster.team = new Player[]{player};
        assertEquals(player, roster.getSpecificPlayer(0));
    }


}


