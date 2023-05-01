import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your age: ");
    int age = scanner.nextInt();

    if (age < 18) {
      System.out.println("Sorry, you are too young to vote.");
    } else {
      System.out.println("You are eligible to vote.");
    }
  }
}
