package UI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import Team.Roster;
import Team.BasketballRoster;
import Team.HockeyRoster;
import Data.Util;
import Data.loadTeam;
import Data.saveTeam;

@SuppressWarnings("unused")
public class teamCreator implements saveTeam, loadTeam {


    //C:\University\Year 3 Semester 2\COSC 210\LAB PROJECT\Lab Project\src\UI\team_data.txt

String filePath = "C:\\University\\Year 3 Semester 2\\COSC 210\\LAB PROJECT\\Lab Project\\src\\UI\\team_data.txt";

    @Override
    public void loadTeamFromFile(Roster roster) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] playerInfo = line.split(",");
                int index = Integer.parseInt(playerInfo[0]);
                String playerName = "";
                if (playerInfo.length > 1) {
                    playerName = playerInfo[1]; // Set the player name if it exists
                }
                roster.addToTeam(index, playerName);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void saveTeamToFile(Roster roster) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (int i = 0; i < roster.getTeamSize(); i++) {
                String playerName = roster.getSpecificPlayer(i) != null ? roster.getSpecificPlayer(i).getName() : "";
                writer.write(i + "," + playerName + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeToFile(String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getTeamFromFile() {
        StringBuilder teamInfo = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                teamInfo.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return teamInfo.toString();
    }

  
    








    //MAIN METHOD

    public Roster createTeam(){
        
        Roster Please = null;
        try{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Would you like to load a team? (yes/no)");
        String loadChoice = input.readLine();
        if (loadChoice.equalsIgnoreCase("yes")) {
            // If yes, load team and return
            Roster loadedTeam = new BasketballRoster(); // Just initialize with any type, will be overwritten
            loadTeamFromFile(loadedTeam);
            return loadedTeam;
        }
        
      
        String type = Util.getStringInput("What sport does your team play? (Hockey or Basketball)");
        Roster roster = null;
        if(type.toLowerCase().equals("basketball")){
            System.out.println("You have created a basketball team");
            roster = new BasketballRoster();
        }
        if(type.toLowerCase().equals("hockey")){
            System.out.println("You have created a Hockey team");      
            roster =  new HockeyRoster();
        }


        // Creates team and gets current roster
        roster.establishTeam();
   
            
        boolean running = true;


            // Main interface

        while (running){

            
            System.out.println();
            System.out.println("------------------------------");
            System.out.println();
            System.out.println("What would you like to do next?");
            System.out.println(" 's' Set the starting roster");
            System.out.println(" 'v' View the current roster");
            System.out.println(" 'a' Adjust players");
            System.out.println(" 'o' Save current team");
            System.out.println(" 'r' Load a team");
            System.out.println(" 'e' Exit the program");
            

       
        
                // Gets input on what theyd like to do
            String choice = Util.getStringInput();
            System.out.println("Your choice was: " + choice);

            
        if(choice.toLowerCase().equals("v") ){
            roster.getTeam();
        }
        
            // e works
        if(choice.toLowerCase().equals("e")){
            System.out.println("Good Bye");
            System.exit(0);
            // running = false;
            // return roster;
        }


            // s works
        if (choice.toLowerCase().equals("s")){
            System.out.println("Which player would you like to be a starter? (enter number)");
            roster.getTeam();
            int numChoice = Util.getIntegerInput() - 1;
            System.out.println("What position would you like them to start? (Enter number)");

            roster.getStarters();
            
            int startChoice = Util.getIntegerInput() - 1;

            roster.setStarters(startChoice, roster.getSpecificPlayer(numChoice));
            roster.getStarters();
        }


        // All of a's functions work
        if(choice.toLowerCase().equals("a") ){
          
            System.out.println("Which player would you like to adjust or view their information? (Enter Number)");
            System.out.println("If you'd like to add a player just enter the number of an empty roster spot");
            
            roster.getTeam();

             int userChoice = Util.getIntegerInput() - 1;

             // Runs if roster spot is populated and asks information to populate if empty
            if(roster.getSpecificPlayer(userChoice) != null){
                //If roster spot is populated
            System.out.println("What would you like to adjust");
            System.out.println(" 'n' Name");
            System.out.println(" 'p' Position");
            System.out.println(" 'j' Jersey Number");
            System.out.println(" 'm' Minutes");
            System.out.println(" 'o' Player Notes ");
            System.out.println(" 'v' View Information");

        
                String secondUserChoice = Util.getStringInput();

                if(secondUserChoice.toLowerCase().equals("n") ){
                    System.out.println("What would you like " + roster.getSpecificPlayer(userChoice).getName() + " name to be changed to?");
                    String changeName = Util.getStringInput();

                    roster.getSpecificPlayer(userChoice).setName(changeName);
                }

                if(secondUserChoice.toLowerCase().equals("p") ){
                    System.out.println("What would you like " + roster.getSpecificPlayer(userChoice).getName() + " position to be changed to?");
                    String changePosition = Util.getStringInput();
                    roster.getSpecificPlayer(userChoice).setPosition(changePosition);;
                }

                if(secondUserChoice.toLowerCase().equals("j") ){
                    System.out.println("What would you like " + roster.getSpecificPlayer(userChoice).getName() + " jersey number to be changed to?");
                    int changeJersey = Util.getIntegerInput();
                    roster.getSpecificPlayer(userChoice).setJerseyNumber(changeJersey);;
                }

                if(secondUserChoice.toLowerCase().equals("m") ){
                    System.out.println("What would you like " + roster.getSpecificPlayer(userChoice).getName() + " minutes to be changed to?");
                    int changeMin = Util.getIntegerInput();
                    roster.getSpecificPlayer(userChoice).setPlayerMinutes(changeMin);;
                }

                if(secondUserChoice.toLowerCase().equals("o")){
                    System.out.println("What would you like " + roster.getSpecificPlayer(userChoice).getName() + " player note to be changed to?");
                   String changeNote = Util.getStringInput();
                    roster.getSpecificPlayer(userChoice).setPlayernote(changeNote);;
                }

                if(secondUserChoice.toLowerCase().equals("v")){
                    System.out.println(roster.getSpecificPlayer(userChoice).getInfo());
                }
                

            }else{
                //Roster spot is vacant
                System.out.println("What is the players name?");
                String addName = Util.getStringInput();
                roster.addToTeam(userChoice,addName);
            }

           

            
            
        }

        if (choice.toLowerCase().equals("o")) {
            saveTeamToFile(roster);
        }

        if (choice.toLowerCase().equals("r")) {
            loadTeamFromFile(roster);
        }
        
        
        }
        return roster;
        
    }catch(Exception e){
        System.out.println("Error Occured" + e.getLocalizedMessage());
    }finally{
        
    }
        System.out.println("WE ARE DONE");
        return Please;
        
        
    }



}