package Team;

public class HockeyPlayer extends Player {


    public HockeyPlayer(){
        this.name = "Connor Bedard";
        this.position = "Center";
        this.jerseyNum = 23;
        this.playerMinutes = 40;
    }

    public HockeyPlayer(String name){
        this.name = name;
        this.position = "Not set";
        this.jerseyNum = 0;
        this.playerMinutes = 0;
        
    }
    
}
