import java.util.Scanner;
public class TrafficLightDemo { 
    public static void main(String[] args) 
    { 
        String color;
        Scanner scan =new Scanner(System.in);

        System.out.println("Enter the colour");

        color=scan.nextLine();

        String signal=null; 
  
        
        switch (color) { 
            case "yellow" :  
            signal="ready";
            break;
            
            case "green" :  
            signal="Go";
            break; 
            
            case "red" : 
            signal="Stop";
            break; 

            default:
            signal="invalid";
            System.out.println("Entered Colour cannot be found");
            break;
         
        } 
        System.out.println(signal); 
    } 
} 
