package Team;

import java.util.Scanner;

public class Roster {
    private int teamSize;
    private Player team[];
    private int teamRecord;
    Scanner inputRoster = new Scanner(System.in);
    //private static int slot = 0;
    private Player starters[];

    public void setTeamSize(){
        System.out.println("How many players are on your team? ");
        int num = inputRoster.nextInt();
        this.teamSize = num;
        initTeam();
    }
    public void setStartersSize(int size){
        this.starters = new Player[size];
    }

    public void setTeamSize(int x){
        this.teamSize = x;
        initTeam();
    }

    public void initTeam(){
        this.team =  new Player [teamSize];
        }

    public int getTeamSize(){
        System.out.println("TEAM LENGTH IS:" + team.length);
        return this.teamSize;
    }

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

    public void getTeam() {
        System.out.println("Team Roster:");
        for (int i = 0; i < team.length; i++) {
            if (team[i] != null) {
                System.out.println("Player " + (i + 1) + ":");
                System.out.println("Name: " + team[i].getName());
                System.out.println("Position: " + team[i].getPosition());
                System.out.println("Player Minutes: " + team[i].getPlayerMinutes());
                System.out.println(); // Print an empty line for better readability
            } else {
                System.out.println("Player " + (i + 1) + ": EMPTY"); // Print "EMPTY" if the slot is not filled
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
                System.out.println("Player " + (i + 1) + ": EMPTY"); // Print "EMPTY" if the slot is not filled
            }
        }
    }

    public Player getSpecificPlayer(int num){
        return team[num];
    }

    public void setStarters(int spot, Player player){
        this.starters[spot] = player;
        
    }

    

    // Come back to allow for adding hockey player to the team
    // Implement in each class to add a specific instance of player

    
    public  void addToTeam(int rosterSpot, String name){

    }

        public  void establishTeam(){

        }
        

}
