class Helper {
 
    // Static method
    public static int sum(int a, int b)
    {
        // Simply returning the sum
        return a + b;
    }
}
 
// Class 2
class GFG {
 
    // Main driver method
    public static void main(String[] args)
    {
        // Custom values for integer
        // to be summed up
        int n = 3, m = 6;
 
        // Calling the static method of above class
        // and storing sum in integer variable
        int s = Helper.sum(n, m);
 
        // Print and display the sum
        System.out.print("sum is = " + s);
    }
}
 