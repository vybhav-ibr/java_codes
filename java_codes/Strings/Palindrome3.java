import java.util.*;

public class Main {
    public static void main(String args[]) {
        String original = "Prepinsta", reverse = "";  // Objects of String class
        
        int length = original.length();
        for (int i = length - 1; i >= 0; i--) 
        reverse = reverse + original.charAt(i);

        if (original.equals(reverse))
            System.out.println("Entered string is a palindrome.");
        else
            System.out.println("Entered string isn't a palindrome.");
    }
}