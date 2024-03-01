package Data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

import Team.Roster;
import Team.BasketballRoster;
import Team.HockeyRoster;
import Data.Util;

public class teamCreator implements saveTeam, loadTeam {


    //C:\University\Year 3 Semester 2\COSC 210\LAB PROJECT\Lab Project\src\UI\team_data.txt

String filePath = "C:\\University\\Year 3 Semester 2\\COSC 210\\LAB PROJECT\\Lab Project\\src\\UI\\team_data.txt";

    @Override
    public void loadTeamFromFile() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'loadTeamFromFile'");
    }

    @Override
    public void saveTeamToFile() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveTeamToFile'");
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

    // public String getStringInput(String message) {
    //     String result = "";        
    //     try{  
    //         BufferedReader input = new BufferedReader(new InputStreamReader(System.in));                     
    //         System.out.println(message);
    //         result = input.readLine();
    //     } catch(IOException e){
    //         System.out.println("getStringInput: IOError Occured" + e.getLocalizedMessage());
    //     } 
    //     return result;
    // }
    
    








    //MAIN METHOD

    public Roster createTeam(){
        //Scanner input = new Scanner(System.in);
        Roster Please = null;
        try{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));


        
        // System.out.println("What sport does your team play?");
        // String type = input.readLine();
        String type = Util.getStringInput("What sport does your team play?");
        //System.out.println("You entered: " + type);
        Roster roster = null;
        if(type.toLowerCase().equals("basketball")){
            // init basketballTeam
            System.out.println("You have created a basketball team");
            
            roster = new BasketballRoster();
            // roster.establishTeam();
            // input.close();

        }
        if(type.toLowerCase().equals("hockey")){
            //init hockeyTeam
            System.out.println("You have created a Hockey team");
            // input.close();
            roster =  new HockeyRoster();
        }

        roster.establishTeam();
   
            //Create a while loop to continuely ask for input until they enter E to exit
        boolean running = true;

        while (running){

            
            System.out.println();
            System.out.println("------------------------------");
            System.out.println();
            System.out.println("What would you like to do next?");
            System.out.println(" 's' Set the starting roster");
            //Make sure to print out the starting roster and the reserve
            System.out.println(" 'v' View the current roster");
            System.out.println(" 'a' Adjust players");
            System.out.println(" 'e' Exit the program");

       
        
        //String choice = "a";
        
            // String choice = input.readLine();
        String choice = Util.getStringInput("");
        System.out.println("Your choice was: " + choice);

        if(choice.toLowerCase().equals("v") ){
            roster.getTeam();
        }

        if (choice.toLowerCase().equals("s")){
            System.out.println("Which player would you like to be a starter? (enter number)");
            roster.getTeam();
            //Set to players input minus 1 to respond to the next input
            //int numChoice = 1 -1;
            int numChoice = Util.getIntegerInput() - 1;
            System.out.println("What position would you like them to start? (Enter number)");

            roster.getStarters();
            
            //Same as the other variable
            //int startChoice = 1 -1;
            int startChoice = Util.getIntegerInput() - 1;

            roster.setStarters(startChoice, roster.getSpecificPlayer(numChoice));

            System.out.println("Updated Starter");
            roster.getStarters();
        }


        if(choice.toLowerCase().equals("a") ){
            // Place this inside while loop so user can keep adjusting until they want to exit
          
            System.out.println("Which player would you like to adjust or view their information? (Enter Number)");
            System.out.println("If you'd like to add a player just enter the number of an empty roster spot");
            
            roster.getTeam();

            //Get user input on what player theyd like to adjust
           // int userChoice = 1 -1;
             int userChoice = Util.getIntegerInput() - 1;

            if(roster.getSpecificPlayer(userChoice) != null){
                //If roster spot is populated
            System.out.println("What would you like to adjust");
            System.out.println(" 'n' Name");
            System.out.println(" 'p' Position");
            System.out.println(" 'j' Jersey Number");
            System.out.println(" 'm' Minutes");
            System.out.println(" 'o' Player Notes ");
            System.out.println(" 'v' View Information");

            // Set to user choice
                //String secondUserChoice = "v";
                String secondUserChoice = Util.getStringInput();

                if(secondUserChoice.toLowerCase().equals("n") ){
                    System.out.println("What would you like " + roster.getSpecificPlayer(userChoice).getName() + " name to be changed to?");
                    //Set to user input
                    //String changeName = "Draymond Green";
                    String changeName = Util.getStringInput();

                    roster.getSpecificPlayer(userChoice).setName(changeName);
                }
                if(secondUserChoice.toLowerCase().equals("p") ){
                    System.out.println("What would you like " + roster.getSpecificPlayer(userChoice).getName() + " position to be changed to?");
                    //Set to user input
                    //String changePosition = "Draymond Green";
                    String changePosition = Util.getStringInput();
                    roster.getSpecificPlayer(userChoice).setPosition(changePosition);;
                }
                if(secondUserChoice.toLowerCase().equals("j") ){
                    System.out.println("What would you like " + roster.getSpecificPlayer(userChoice).getName() + " jersey number to be changed to?");
                    //Set to user input
                    //int changeJersey = 23;
                    int changeJersey = Util.getIntegerInput();
                    roster.getSpecificPlayer(userChoice).setJerseyNumber(changeJersey);;
                }
                if(secondUserChoice.toLowerCase().equals("m") ){
                    System.out.println("What would you like " + roster.getSpecificPlayer(userChoice).getName() + " minutes to be changed to?");
                    //Set to user input
                    //int changeMin = 40;
                    int changeMin = Util.getIntegerInput();
                    roster.getSpecificPlayer(userChoice).setPlayerMinutes(changeMin);;
                }
                if(secondUserChoice.toLowerCase().equals("o")){
                    System.out.println("What would you like " + roster.getSpecificPlayer(userChoice).getName() + " player note to be changed to?");
                    //Set to user input
                   // String changeNote = "Run Isolation Play when man guarding is a mismatch";
                   String changeNote = Util.getStringInput();
                    roster.getSpecificPlayer(userChoice).setPlayernote(changeNote);;
                }
                if(secondUserChoice.toLowerCase().equals("v")){
                    System.out.println(roster.getSpecificPlayer(userChoice).getInfo());
                }
                

            }else{
                //Roster spot is vacant
                System.out.println("What is the players name?");
                //Set to be the users input
               // String addName = "JOE SMITH";
                String addName = Util.getStringInput();
                roster.addToTeam(userChoice + 1,addName);
            }


            //Doesnt Run
            if(choice.toLowerCase().equals("e")){
                System.out.println("Exit ran");
                running = false;
                return roster;
            }

            
            
        }

        
        
        
        }
        input.close();
        return roster;
        
    }catch(IOException e){
        System.out.println("IOError Occured" + e.getLocalizedMessage());

    }catch(Exception e){
        System.out.println("Error Occured" + e.getLocalizedMessage());
    }finally{
        
    }
        System.out.println("WE ARE DONE");
        return Please;
        
        
    }



}