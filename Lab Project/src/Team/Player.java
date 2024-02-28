package Team;

public abstract class Player {

    public String name = "empty";
    public String position = "empty";
    public int jerseyNum = 0;
    public int playerMinutes = 0;
    public String  playerNote = "empty";

 
    public void setName(String newName) {
        this.name = newName;
    }

   
    public String getName() {
        return this.name;
    }

    
    public void setPosition(String newPosition) {
        this.position = newPosition;
    }


    public String getPosition() {
        return this.position;
    }

  
    public void setPlayerMinutes(int minutes) {
        this.playerMinutes = minutes;
    }

  
    public int getPlayerMinutes() {
        return this.playerMinutes;
    } 

    public void setPlayernote(String note){
         this.playerNote = note;
    }
    
    public String getPlayernote(){
        return this.playerNote;
    }
    
    
}
