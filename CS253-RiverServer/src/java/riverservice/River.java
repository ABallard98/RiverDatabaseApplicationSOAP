/**
 * @Author Ayden Ballard - 905438
 * This class is used to represent a river, a river has a name, a length 
 * and a list of its tributaries
 */

package RiverService;

import java.util.ArrayList;

/**
 *
 * @author ayden
 */
public class River {
    
    private String name; //name of the river
    private int length; //length of the river in km
    private final ArrayList<River> TRIBUTARIES; //tributaries of the river
    
    /**
     * Constructor for river object
     * @param name - name of the river
     * @param length - length of the river in km
     */
    public River(String name, int length){
        this.name = name;
        this.length = length;
        this.TRIBUTARIES = new ArrayList<>();
    }
    
    /**
     * Method to set the length of the river
     * @param length - length of the river 
     */
    public void setLength(int length){
        this.length = length;
    }
    
    /**
     * Method to set the name of the river
     * @param name - name of the river
     */
    public void setName(String name){
        this.name = name;
    }
    
    /**
     * Method to return the name of the river
     * @return name of the river
     */
    public String getName(){
        return this.name;
    }
    
    /**
     * Method to return the length of the river
     * @return length of the river
     */
    public int getLength(){
        return this.length;
    }
    
    /**
     * Method to add a tributary to the river
     * @param river - river to be added as a tributary
     */
    public void addTributary(River river){
        if(TRIBUTARIES.contains(river)){
            System.out.println("Already exists as tributary");
        }
        else{
            TRIBUTARIES.add(river);
        }
    }
    
    /**
     * Method to get the total length of the river including 
     * the tributaries and the tributaries of those tributaries etc.
     * @return total length of the river
     */
    public int getTotalLength(){
        int total = this.length;
        for(River r : TRIBUTARIES){
            total += r.getTotalLength();
        }
        return total;
    }
    
    /**
     * Method to return a string containing all the information about 
     * the river
     * @return information about the river
     */
    @Override
    public String toString(){
        return this.name + ", " + this.length + "km (" + 
                this.getTotalLength() + "km including tributaries)";
    }
    
    
    
    
}
