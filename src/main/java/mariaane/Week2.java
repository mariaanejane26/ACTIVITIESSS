package mariaane.ganda;
import java.util.Scanner;

public class WEEK1 {
  public static void main(String[] args) {
    double total;
    Scanner scanner = new Scanner(System.in);

  System.out.println("=====================================");

  System.out.print("Enter first number: ");
  System.out.print("ENTER FIRST NUMBER: ");
  double num1 = scanner.nextDouble();

  System.out.print("ENTER SECOND NUMBER: ");
  double num2 = scanner.nextDouble();

  System.out.print("CHOOSE AN OPERATION [1-4]: ");
  int choice = scanner.nextInt();

switch (choice) {

    case 1 -> {
        // addition works with both positive and negative values
        total = num1 + num2;
        System.out.print("ADDITION: " + total);
          }

    case 2 -> {
        // subtraction works with both positive and negative values
        total = num1 - num2;
        System.out.print("SUBTRACTION: " + total);
          }

    case 3 -> {
        // division follows the correct sign based on the two values
        if (num2 != 0) {
            total = num1 / num2;
            System.out.print("DIVISION: " + total);
        } else {
            System.out.print("CANNOT DIVIDE BY ZERO");
        } }

    case 4 -> {
        // multiplication works with both positive and negative values
        total = num1 * num2;
        System.out.print("MULTIPLICATION: " + total);
          }

    default -> System.out.print("INVALID INPUT");
}

    System.out.println("=====================================");

    int average = 74, absences = 3;

    if ((average >= 75 && absences <= 3) || average >= 90) {
    System.out.println("\nSTUDENT PASSED, grades met the minimum threshold");
}
    else if (average < 75) {
    System.out.println("\nSTUDENT FAILED, failed to meet minimum threshold");
}
    else {
    System.out.println("\nINVALID AVERAGE");
}

    System.out.println("=====================================");

    double balance = 1000.00;

    System.out.println("INITIAL VALUE: " + balance);

    balance += 1.30;
    System.out.println("ADDING VALUE: " + balance);

    balance *= 67.67;
    System.out.println("MULTIPLYING VALUE: " + balance);

    balance += 420;
    System.out.println("FINAL VALUE: " + balance + "\n");


    int count = 10;

    System.out.println("=== POSTFIXING VALUE ===");

    System.out.println("COUNT++ VALUE: " + count++);
    System.out.println("WITHOUT COUNT++: " + count);

    System.out.println("=== PREFIXING VALUE ===");

    System.out.println("++COUNT VALUE: " + ++count);
    System.out.println("WITHOUT ++COUNT: " + count);

    /*
     * In count++, the current value is used first before the
     * increment happens. The value increases after the statement
     * is evaluated.
   */

    /*
     * In ++count, the value is incremented first before it is used.
     * This is why ++count produces a different result from count++.
   */

     System.out.println("=====================================");

    int num_1 = 50, num_2 = 67, num_3 = 90;

    System.out.println("=== PRECEDENCE PUZZLE SOLVER ===");

    boolean result_1 = ++num_1 + 25 > 10 && --num_1 * 2 > 0;
    System.out.println("RESULT 1: " + result_1); // true: num_1 becomes 51, then returns to 50 after --num_1.

    boolean result_2 = num_2 + num_3 <= 150 || (num_3 - num_2) * 5 >= 300;
    System.out.println("RESULT 2: " + result_2); // false: both conditions are false.

    boolean result_3 = (num_1 * 2) + (num_2 - num_1) >= 70
        || (num_3 / num_2) % 100 <= 157;
    System.out.println("RESULT 3: " + result_3);// true: the first condition is already true.
   }
}
