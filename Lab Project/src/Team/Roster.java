package Team;

import java.util.Scanner;

import Data.Util;

public class Roster {
     int teamSize;
    public Player team[];
    public Player starters[];
    public int starterSize;
    Scanner inputRoster = new Scanner(System.in);
    //private int slot;
    


    public void setStartersSize(int size){
        this.starterSize = size;
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

   



    public void getTeam() {
        
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

    public void addPlayer(Player player){
        player.setRoster(this);
    }

    public void removePlayer(Player player){
        player.setRoster(null);
    }



    
    public  void addToTeam(int slot, String name){
             try {
            String nameToSet = Util.getStringInput("What is the players name?");
            this.team[slot] = new Player(nameToSet);
            getSpecificPlayer(slot).setRoster(this);
        } catch (Exception e) {
            System.out.println("Error:addToTeam " + e.getMessage());
        } 
    }

    //  Needs to be implimented in each sport to meet requirement of minimum and maximum players
        public  void establishTeam(){

        }
        

}
