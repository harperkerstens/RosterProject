package Data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import Team.Roster;
import Team.BasketballRoster;
import Team.HockeyRoster;

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


    public Roster createTeam(){
        Scanner input = new Scanner(System.in);
        System.out.println("What sport does your team play?");
        String type = input.next();
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
        System.out.println("What would you like to do next?");
        System.out.println(" 's' set the starting roster");
        //Make sure to print out the starting roster and the reserve
        System.out.println(" 'v' view the current roster");
        System.out.println(" 'a' add players");

       // String choice = input.next();

        String choice = "s";
        if(choice.toLowerCase() == "v"){
            roster.getTeam();
        }

        if (choice.toLowerCase() == "s"){
            System.out.println("Which player would you like to be a starter? (enter number)");
            roster.getTeam();
            //Set to players input minus 1 to respond to the next input
            int numChoice = 1 -1;

            System.out.println("What position would you like them to start? (Enter number)");

            roster.getStarters();
            
            //Same as the other variable
            int startChoice = 1 -1;

            roster.setStarters(startChoice, roster.getSpecificPlayer(numChoice));

            System.out.println("Updated Starter");
            roster.getStarters();
        }



        input.close();
        System.out.println("WE ARE DONE");
        return roster;
    }



}
