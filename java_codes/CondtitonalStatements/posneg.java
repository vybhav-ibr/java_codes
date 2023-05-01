public class Main {
  public static void main(String[] args) {
    int number = 10;

    // If-else statement
    if (number > 0) {
      System.out.println("Number is positive.");
    } else {
      System.out.println("Number is negative.");
    }

    // Switch statement
    switch (number) {
      case 0:
        System.out.println("Number is zero.");
        break;
      case 1:
        System.out.println("Number is one.");
        break;
      case 2:
        System.out.println("Number is two.");
        break;
      default:
        System.out.println("Number is not 0, 1, or 2.");
        break;
    }
  }
}
