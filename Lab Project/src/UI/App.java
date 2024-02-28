package UI;

import org.junit.rules.TemporaryFolder;

import Team.BasketballPlayer;
import Team.BasketballRoster;
import Team.HockeyRoster;
import Team.HockeyPlayer;
import Team.Player;
import Team.Roster;
import Data.teamCreator;
public class App {
    public static void main(String[] args) throws Exception {


        teamCreator handler = new teamCreator();

        Roster team = handler.createTeam();

            team.initTeam();

        if(team instanceof BasketballRoster){
            System.out.println("Instance of BasketballRoster");
        }

        if(team instanceof HockeyRoster){
            System.out.println("Instance of HockeyRoster");
        }


        }
}