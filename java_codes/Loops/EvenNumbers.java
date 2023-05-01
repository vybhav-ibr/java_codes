public class LoopApplication {

    public static void main(String[] args) {
        
        // Example 1: Print numbers from 1 to 10 using a for loop
        for(int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // Print a new line
        
        // Example 2: Print even numbers from 2 to 20 using a while loop
        int j = 2;
        while(j <= 20) {
            System.out.print(j + " ");
            j += 2; // Increment j by 2
        }
        System.out.println(); // Print a new line
        
        // Example 3: Print the first 5 elements of an array using a for-each loop
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int count = 0;
        for(int num : numbers) {
            if(count < 5) {
                System.out.print(num + " ");
                count++;
            } else {
                break; // Exit the loop once 5 elements have been printed
            }
        }
    }
}
