// Java program to find
// sublist in a List 
  
import java.util.*; 
  
public class GFG1 
{
    // Main Method 
    public static void main(String[] argv) throws Exception 
    { 
       // Exception try-catch block
        try { 
  
            ArrayList<String> arrlist = new ArrayList<String>(); 
  
            // Populating arrlist1 
            arrlist.add("Example"); 
            arrlist.add("in"); 
            arrlist.add("Geeks"); 
            arrlist.add("for"); 
            arrlist.add("Geeks"); 
  
            // print arrlist 
            System.out.println("Original arrlist: "
                            + arrlist); 
  
            // Getting the subList 
            // using subList() method 
            List<String> arrlist2 = arrlist.subList(2, 5); 
  
            // print the subList 
            System.out.println("Sublist of arrlist: "
                            + arrlist2); 
            } 
  
        // Exception try-catch block
        catch (IndexOutOfBoundsException e) 
        { 
            System.out.println("Exception thrown : " + e); 
        } 
  
        // Exception try-catch block
        catch (IllegalArgumentException e)
        { 
            System.out.println("Exception thrown : " + e); 
        } 
    } 
} 
 