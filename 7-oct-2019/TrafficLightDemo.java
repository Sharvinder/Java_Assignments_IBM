public class TrafficLightDemo { 
    public static void main(String[] args) 
    { 
        String color;
        java.util.Scanner scan =new java.util.Scanner(System.in);

        System.out.println("Enter the traffic light color");

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
            System.out.println("Entered traffic light color cannot be found");
            break;
         
        } 
        System.out.println(signal); 
    } 
} 
