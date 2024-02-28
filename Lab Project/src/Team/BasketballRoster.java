package Team;
import java.util.Scanner;
public class BasketballRoster extends Roster {
   
    private int slot;
    private Player team[];
    public BasketballRoster(){
        this.setTeamSize(13);
        this.setStarters(5);
        initTeam();
    }

    
    public void establishTeam(){
        Scanner input = new Scanner(System.in);
        int run = 0;
        System.out.println("How many players do you currently have? (Minimum 5, Max 13) ");
        run = input.nextInt();
        System.out.println("About to enter loop");
        while (run < 5 || run > 13){
            System.out.println("In the loop");
            System.out.println("Invalid Number");
            System.out.println("How many players do you currently have? (Minimum 5, Max 13) ");
             run = input.nextInt();
        }

        System.out.println("Left the loop");
        input.close();
        for(int i = 0; i <= run; i++){
            this.addToTeam();
        }

    }

    public void addToTeam(){
        System.out.println("What is the players name?" );
        Scanner input = new Scanner(System.in);
        String nameToSet = input.next();
       this.team[slot] = new BasketballPlayer(nameToSet);
        slot++;
        input.close();
    }


}
