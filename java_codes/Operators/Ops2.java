public class OperatorsExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Arithmetic operators
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Comparison operators
        boolean isEqual = (a == b);
        boolean isNotEqual = (a != b);
        boolean isGreaterThan = (a > b);
        boolean isLessThan = (a < b);
        boolean isGreaterThanOrEqual = (a >= b);
        boolean isLessThanOrEqual = (a <= b);

        System.out.println("a == b: " + isEqual);
        System.out.println("a != b: " + isNotEqual);
        System.out.println("a > b: " + isGreaterThan);
        System.out.println("a < b: " + isLessThan);
        System.out.println("a >= b: " + isGreaterThanOrEqual);
        System.out.println("a <= b: " + isLessThanOrEqual);

        // Logical operators
        boolean andResult = (a > 0) && (b < 0);
        boolean orResult = (a > 0) || (b < 0);
        boolean notResult = !(a > 0);

        System.out.println("(a > 0) && (b < 0): " + andResult);
        System.out.println("(a > 0) || (b < 0): " + orResult);
        System.out.println("!(a > 0): " + notResult);
    }
}
