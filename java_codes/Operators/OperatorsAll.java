public class OperatorsExample {
  public static void main(String[] args) {
    
    // Arithmetic Operators
    int x = 10;
    int y = 5;
    int result = x + y;
    System.out.println("x + y = " + result); // Output: x + y = 15
    
    result = x - y;
    System.out.println("x - y = " + result); // Output: x - y = 5
    
    result = x * y;
    System.out.println("x * y = " + result); // Output: x * y = 50
    
    result = x / y;
    System.out.println("x / y = " + result); // Output: x / y = 2
    
    result = x % y;
    System.out.println("x % y = " + result); // Output: x % y = 0
    
    // Comparison Operators
    boolean isGreaterThan = x > y;
    System.out.println("x > y is " + isGreaterThan); // Output: x > y is true
    
    boolean isLessThan = x < y;
    System.out.println("x < y is " + isLessThan); // Output: x < y is false
    
    boolean isEqual = x == y;
    System.out.println("x == y is " + isEqual); // Output: x == y is false
    
    boolean isNotEqual = x != y;
    System.out.println("x != y is " + isNotEqual); // Output: x != y is true
    
    // Logical Operators
    boolean p = true;
    boolean q = false;
    
    boolean andResult = p && q;
    System.out.println("p && q is " + andResult); // Output: p && q is false
    
    boolean orResult = p || q;
    System.out.println("p || q is " + orResult); // Output: p || q is true
    
    boolean notResult = !p;
    System.out.println("!p is " + notResult); // Output: !p is false
  }
}
