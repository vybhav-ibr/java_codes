public class Main {
  public static void main(String[] args) {
    int x = 5;
    int y = 10;
    
    // If-else statement
    if (x > y) {
      System.out.println("x is greater than y");
    } else {
      System.out.println("y is greater than x");
    }
    
    // Switch statement
    int day = 3;
    switch (day) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      default:
        System.out.println("Invalid day");
    }
  }
}
