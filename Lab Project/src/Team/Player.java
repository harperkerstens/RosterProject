package Team;
import java.util.Objects;

public  class Player {

    public String name = "empty";
    public String position = "empty";
    public int jerseyNum = 0;
    public int playerMinutes = 0;
    public String  playerNote = "empty";
    String newLine = System.getProperty("line.separator");
    private Roster roster;

    public Player(){
        this.name = "Not Set";
        this.position = "Not Set";
        this.jerseyNum = 0;
        this.playerMinutes = 0;
    }

    public Player(String name){
        this.name = name;
        this.position = "Not set";
        this.jerseyNum = 0;
        this.playerMinutes = 0;
    }

    public Roster getRoster(){
        return roster;
    }
    
    public void setRoster(Roster roster){
        this.roster = roster;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position, jerseyNum); 
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Player other = (Player) obj;
        return Objects.equals(name, other.name) && Objects.equals(position, other.position)
                && jerseyNum == other.jerseyNum;
    }


 
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
    
    public void setJerseyNumber(int setNum){
        this.jerseyNum = setNum;
    }
    
    public int getJerseyNumber(){
        return this.jerseyNum;
    }

    public String getInfo(){
        String toRe = "Player Name: " + this.getName() + "\n" +
        "Player Position: " + this.getPosition() + "\n" +
        "Player Jersey Number: " + this.getJerseyNumber() + "\n" +
        "Player Minutes: " + this.getPlayerMinutes() + "\n" +
        "Player Note: " + this.getPlayernote();

        return toRe;
    }
    
}
