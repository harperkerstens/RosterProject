package Data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class Util {
    
    private Util() {}
    
    public static String getStringInput(String message) {
        String result = "";        
        try{  
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));                     
            System.out.println(message);
            result = input.readLine();
        } catch(IOException e){
            System.out.println("getStringInput: IOError Occured" + e.getLocalizedMessage());
        } 
        return result;
    }

    public static Integer getIntegerInput(String message) {
        Integer result = -1;        
        try{  
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));                     
            System.out.println(message);
            result = Integer.parseInt(input.readLine());
        } catch(IOException e){
            System.out.println("getStringInput: IOError Occured" + e.getLocalizedMessage());
        } 
        return result;
    }
}
