/**
 * @Author Ayden Ballard - 905438
 * This class is a web service that allows users to enter and store information
 * about rivers using a HashMap
 */
package RiverService;

import java.util.*;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author ayden
 */
@WebService
public class RiverServer {
    
    private final HashMap<Integer,River> hashmap;

    public RiverServer() {
        this.hashmap = new HashMap<Integer,River>(); 
    }
    
    /**
     * Method to construct a river and add it to the HashMap
     * @param name - name of the river
     * @param length - length of the river
     * @return true if successful, false if not
     */
    @WebMethod
    public synchronized boolean addRiver(String name, int length){
        try{
            River river = new River(name.toLowerCase(),length);
            hashmap.put(name.toLowerCase().hashCode(), river);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    
    /**
     * Method to find a river in the HashMap 
     * @param name - name of the river to search for
     * @return River 
     */
    private River findRiver(String name){
        HashMap clone = (HashMap) hashmap.clone(); //making a clone of the hashmap
        return (River) clone.get(name.hashCode());
    }
    
    /**
     * Method to search for a river and return a string containing
     * the information about that river
     * @param name - name of the river to search for
     * @return String of information about the river
     */
    @WebMethod
    public String searchByName(String name){
        String output = findRiver(name.toLowerCase()).toString(); 
        if(output != null){
            return output;
        }
        else{
            return "No river by that name was found";
        }
    }
    
    /**
     * Method to add a river as a tributary to a second river
     * @param river1 - main river
     * @param river2 - new tributary of main river
     * @return true if successful, else false
     */
    @WebMethod
    public synchronized boolean makeTributary(String river1, String river2){
        try{
            River mainRiver = findRiver(river1);
            River tributary = findRiver(river2);
            mainRiver.addTributary(tributary);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    
    /**
     * Method to search for a river based on the length
     * @param length 
     * @return String of rivers with a length of over the 
     *          parsed input and their information 
     */
    @WebMethod
    public String searchByLength(int length){
        HashMap clone = (HashMap) hashmap.clone(); //cloning the hashmap
        String output = "";
        Set set = clone.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){ //loop through the hashmap
            Map.Entry mentry = (Map.Entry) iterator.next();
            River tempRiver = (River) mentry.getValue();
            
            //if the length if greater than the length given by the user
            if(tempRiver.getTotalLength() >= length){
                //add the river to the output string
                output += tempRiver.toString() + "\n";
            }
        }
        if(output.equals("")){
            output = "No rivers over the given length was found";
        }
        return output;
    }
        
    /**
     * Method to update the length of a river
     * @param name - name of the river to be updated
     * @param length - new length of the river
     * @return true if successful, else false
     */
    @WebMethod
    public synchronized boolean updateLength(String name, int length){
        try{
            if(hashmap.containsKey(name.hashCode())){
                findRiver(name.toLowerCase()).setLength(length);
                return true;
            }
        }
        catch(Exception e){
            return false;
        }
        return false;
    }
    
    /**
     * Method to print all of the rivers in the HashMap and
     * their information
     * @return String of all rivers
     */
    @WebMethod
    public String allRiversToString(){
        String output = "";
        HashMap clone = (HashMap) hashmap.clone();
        Set set = clone.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){ //loop through the hashmap
            Map.Entry mentry = (Map.Entry) iterator.next();
            River tempRiver = (River) mentry.getValue();
            output += tempRiver.toString() + "\n";
        }
        return output;
    }
    
    
}
