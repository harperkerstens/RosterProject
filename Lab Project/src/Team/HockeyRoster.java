package Team;


public class HockeyRoster extends Roster {
    
    private Player team[];
    private int slot;
    public HockeyRoster(){
        setTeamSize(23);
        initTeam();
    }
    public void initTeam(){
        this.setStarters(6);
    }

    public void addToTeam(){
    team[slot] = new HockeyPlayer();
    slot++;
    }

}
