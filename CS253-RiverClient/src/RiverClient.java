/*
 * @Author Ayden Ballard - 905438
 * This class is a client to access the river server and allows
 * users to interact with the server depending on what commands they enter
 * into the console.
 */

import java.util.*;
import riverservice.RiverServer;
import riverservice.RiverServerService;

/**
 *
 * @author ayden
 */
public class RiverClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        RiverServerService service = new RiverServerService();   
        RiverServer port = service.getRiverServerPort();
        Scanner in = new Scanner(System.in);
        boolean exit = false;
        
        //printing the commands that the user can enter
        System.out.println("Welcome to the river data base \n"
                + "Commands are:\n"+
                "1.AddRiver <Name> <Length>\n"+
                "2.MakeTributary <Name> <Name>\n"+
                "3.UpdateLength <Name> <Length>\n"+
                "4.SearchByName <Name>\n"+
                "5.SearchByLength <Length>\n"+
                "6.PrintAllRivers\n"+
                "7.Exit\n");
        
        //while the user has not tried to exit
        while(exit != true){  
            System.out.println("Please enter a command");
            String userInput = in.nextLine();
            if(!userInput.equals("")){ //if a command is entered
                Scanner lineReader = new Scanner(userInput);
                String command = lineReader.next();
                
                try{
                    //switch statement to see what command the user 
                    switch(command.toUpperCase()){ //toUperCase to make it ignore caps
                        case "ADDRIVER":
                            if(port.addRiver(lineReader.next(), lineReader.nextInt())){
                                System.out.println("River added");
                            } 
                            else{ //if adding the river was not successful  
                                System.out.println("Error adding river");
                            }
                            break;
                        case "MAKETRIBUTARY":
                            if(port.makeTributary(lineReader.next(), lineReader.next())){
                               System.out.println("Tributary added"); 
                            }
                            else{ //if making the tributary wasnt successful
                                System.out.println("Error creating tributary");
                            }
                            break;
                        case "UPDATELENGTH":
                            if(port.updateLength(lineReader.next(), lineReader.nextInt())){
                                System.out.println("Update to river was successful");
                            }
                            else{ //if updating the length was not successful
                                System.out.println("Updating the river length was not successful");
                            }
                            break;
                        case "SEARCHBYNAME":
                            System.out.println("Found rivers:");
                            System.out.println(port.searchByName(lineReader.next())); 
                            break;
                        case "SEARCHBYLENGTH":
                            System.out.println("Found rivers:");
                            System.out.println(port.searchByLength(lineReader.nextInt()));
                            break;
                        case "PRINTALLRIVERS":
                            System.out.println("Found rivers:");
                            System.out.println(port.allRiversToString());
                            break;
                        case "EXIT":
                            System.out.println("Goodbye");
                            in.close(); //closing the scanners
                            lineReader.close();
                            exit = true;
                            break;
                        default:
                            System.out.println("Error, enter a valid command");
                    }//end of switch statement 
                }//end of try statement
                catch(Exception e){
                    //catching errors like if the user doesnt enter commands
                    //correctly
                    System.out.println("Error executing command");
                }
            } //end of if statement
        }//end of while loop
    }//end of method
    
}
