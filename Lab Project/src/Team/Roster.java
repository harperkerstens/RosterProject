package Team;

import java.util.Scanner;

import Data.Util;

public class Roster {
     int teamSize;
    public Player team[];
    public Player starters[];
    private int teamRecord;
    public int starterSize;
    Scanner inputRoster = new Scanner(System.in);
    //private int slot;
    


    public void setStartersSize(int size){
        this.starters = new Player[size];
    }

    public void setTeamSize(int x){
        this.teamSize = x;
    }


    // Must be called to set Arrays
    public void initTeam(){
        this.team =  new Player [teamSize];
        this.starters = new Player[starterSize];
        }


    public int getTeamSize(){
        System.out.println("TEAM LENGTH IS:" + team.length);
        return this.teamSize;
    }

    // Might get rid of this chunk
    /* 


    public void setTeamRecord(){
        System.out.println("What is the teams record?");
        int setRecord = inputRoster.nextInt();
        if(setRecord < 0){
            System.out.println("Team record can't be negative, What is the team record?");
            setRecord = inputRoster.nextInt();

            if(setRecord < 0){setTeamRecord();}else{this.teamRecord = setRecord;}
            
        }else{
            this.teamRecord = setRecord;
        }
        
    }

    public void setTeamRecord(int newRecord){
        
        int setRecord = newRecord;
        if(setRecord < 0){
            System.out.println("Team record can't be negative, What is the team record?");
            setRecord = inputRoster.nextInt();

            if(setRecord < 0){setTeamRecord();}else{this.teamRecord = setRecord;}
            
        }else{
            this.teamRecord = setRecord;
        }

    }

    public int getTeamRecord(){
        System.out.println("Your teams record is: " + this.teamRecord);
        return this.teamRecord;
    }
*/





    public void getTeam() {
        //System.out.println("Ran Basketball Rosters get team");
        for(int i = 0; i < team.length; i++){
            if(this.team[i] != null){
            System.out.println("Player " + (i + 1) + ": " + this.team[i].getName());
            }else{
                System.out.println("Player " + (i + 1) +": "+"Empty");
            }
        }
    }

    public String toString() {
        StringBuilder rosterInfo = new StringBuilder("Team Roster:\n");
        for (int i = 0; i < team.length; i++) {
            if (team[i] != null) {
                rosterInfo.append("Player ").append(i + 1).append(":\n");
                rosterInfo.append("Name: ").append(team[i].getName()).append("\n");
                rosterInfo.append("Position: ").append(team[i].getPosition()).append("\n");
                rosterInfo.append("Player Minutes: ").append(team[i].getPlayerMinutes()).append("\n\n");
            } else {
                rosterInfo.append("Player ").append(i + 1).append(": EMPTY\n");
            }
        }
        return rosterInfo.toString();
    }

    public int getTeamLength(){
        return this.team.length;
    }


    // Should be implemented in each class to format to each specific type of sport
    public void getStarters(){
        System.out.println("Starting Roster:");
        for (int i = 0; i < starters.length; i++) {
            if (starters[i] != null) {
                System.out.println("Player " + (i + 1) + ":");
                System.out.println("Name: " + starters[i].getName());
                System.out.println("Position: " + starters[i].getPosition());
                System.out.println("Player Minutes: " + starters[i].getPlayerMinutes());
                System.out.println(); // Print an empty line for better readability
            } else {
                System.out.println("Player " + (i + 1) + ": EMPTY"); 
            }
        }
    }

    public Player getSpecificPlayer(int num){
        return this.team[num];
    }

    public void setStarters(int spot, Player player){
        this.starters[spot] = player;
        
    }

    

    // Come back to allow for adding hockey player to the team
    // Implement in each class to add a specific instance of player

    
    public  void addToTeam(int slot, String name){
             try {
            String nameToSet = Util.getStringInput("What is the players name?");
            this.team[slot] = new Player(nameToSet);
        } catch (Exception e) {
            System.out.println("Error:addToTeam " + e.getMessage());
        } 
    }

        public  void establishTeam(){

        }
        

}
