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
        if(type.toLowerCase().equals("basketball")){
            // init basketballTeam
            //System.out.println("You have created a basketball team");
            input.close();
            return new BasketballRoster();

        }
        if(type.toLowerCase().equals("hockey")){
            //init hockeyTeam
            //System.out.println("You have created a Hockey team");
            input.close();
            return new HockeyRoster();
        }
        input.close();
        return null;
    }



}
