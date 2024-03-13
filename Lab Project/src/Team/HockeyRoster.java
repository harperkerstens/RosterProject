package Team;

import Data.Util;

public class HockeyRoster extends Roster {
    
  
    
    public HockeyRoster(){
        this.setTeamSize(23);
        this.setStartersSize(6);
        initTeam();
        
    }
 

    public void addToTeam(int slot){
      try {
            String nameToSet = Util.getStringInput("What is the players name?");
            this.team[slot] = new HockeyPlayer(nameToSet);
            getSpecificPlayer(slot).setRoster(this);
        } catch (Exception e) {
            System.out.println("Error:addToTeam " + e.getMessage());
        } 
    
    }
    
    public void addToTeam(int rosterSpot, String name){
        this.team[rosterSpot] = new HockeyPlayer(name);
        getSpecificPlayer(rosterSpot).setRoster(this);
    }

    public void establishTeam(){
        try {
            Integer run = 10;
            run = Util.getIntegerInput("How many players do you currently have? (Minimum 6, Max 23) ");
        
            while (run < 6 || run > 23){
                System.out.println("Invalid Number");
                System.out.println("How many players do you currently have? (Minimum 6, Max 23) ");
                run = Util.getIntegerInput();
            }
            System.out.println("Please enter the players names"); 
            for(int i = 0; i < run; i++){
                addToTeam(i);
            }
    } catch(Exception exception){
        System.out.println("Exception: " + exception.getMessage());
    }

}
    //Specific to sport
    public void getStarters(){
        if(this.starters[0] != null){
            System.out.println("Goalie 1: " + starters[0].getName() );
            }else{
                System.out.println("Goalie 1: Empty");
            }
            if(this.starters[1] != null){
                System.out.println("Right Defenseman 2: " + starters[1].getName() );
                }else{
                    System.out.println("Right Defenseman 2: Empty");
                }
             if(this.starters[2] != null){
                System.out.println("Left Defenseman 3: " + starters[2].getName() );
            }else{
                System.out.println("Left Defenseman 3: Empty");
            }
            if(this.starters[3] != null){
                System.out.println("Right Wing 4: " + starters[3].getName() );
                }else{
                    System.out.println("Right Wing 4: Empty");
                }
             if(this.starters[4] != null){
                System.out.println("Left Wing 5: " + starters[4].getName() );
            }else{
                System.out.println("Left Wing 5: Empty");
            }
            if(this.starters[5] != null){
                System.out.println("Center 6: " + starters[5].getName());
            }else{
                System.out.println("Center 6: Empty");
            }
            
    }

}