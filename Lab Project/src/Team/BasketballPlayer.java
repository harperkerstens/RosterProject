package Team;

public class BasketballPlayer extends Player {
  
   // private int fouls;

    // Constructor
    public BasketballPlayer(String name, String position, int jerseyNum, int playerMinutes) {
        this.name = name;
        this.position = position;
        this.jerseyNum = jerseyNum;
        this.playerMinutes = playerMinutes;
    }
    public BasketballPlayer(){
        this.name = "James";
        this.position = "Point Guard";
        this.jerseyNum = 23;
        this.playerMinutes = 40;
    }

    public BasketballPlayer(String name){
        this.name = name;
        this.position = "Not set";
        this.jerseyNum = 0;
        this.playerMinutes = 0;
    }

}