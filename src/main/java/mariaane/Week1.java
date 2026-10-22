package mariaane.ganda;
import java.util. Scanner;

public class Week1 {
  public static void main(String[] args) {
    int age = 19;
    double height = 157.48;
    char initial = 'M';
    boolean status = true;

    String name = "Maglalang, Mariaane Jane";

    System.out.println("Your name is: "+ name + " " + initial + "."); 
    System.out.println("Your age is: "+ age); 
    System.out.println("Your height is: "+ height); 
    System.out.println("Is the student enrolled? " + status); 

    System.out.println("=====================================");

     int quantity = 3;
      double unitPrice = 250.50;
      double totalCost = quantity * unitPrice;
    
        String storeName = "G KASH ONLY";
        System.out.println("=== Shopping Summary ===");
        System.out.println("Store Name: " + storeName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: ₱" + unitPrice);
        System.out.println("Total Cost: ₱" + totalCost);

        /*
         * totalCost should NOT be declared as an int because
         * unitPrice is a double and the multiplication may
         * produce a decimal value. Using double prevents
         * the decimal portion from being lost.
         */
    
      System.out.println("=====================================");
        
      Scanner scanner = new Scanner(System.in);

      System.out.print("ENTER CENTIMETER VALUE: ");
      double centimeter = scanner.nextDouble();
        
      int wholeM = (int)(centimeter / 100);
      double remaining = (centimeter % 100);
        
      System.out.println("RESULT IS " + wholeM + "m with a remainder of " + remaining + "cm");
        
      int sampleIntVal = 35;
      double convertedInt = sampleIntVal;
        
      System.out.println("THE VALUE " + sampleIntVal + " IS CONVERTED TO " + convertedInt);
      //No casting is required because an int already represents a whole number, and converting it to a `double` simply adds .0 without changing its value.
        
      double sampleDoubleVal = 97.29;
      int convertedDouble = (int)sampleDoubleVal;
        
      System.out.println("THE VALUE " + sampleDoubleVal + " IS CONVERTED TO " + convertedDouble);
      //The .29 value from 97.29 is lost because converting a decimal number into a whole number removes the decimal portion.

      System.out.println("=====================================");

        byte number = 127;
        number++;

        System.out.println("=== BYTE OVERFLOW ===");
        System.out.println("After incrementing 127: " + number);
        // A byte can only store values from -128 to 127.
        // When 127 is incremented, it wraps around to -128.


       
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "Hello";

        System.out.println("\n=== STRING COMPARISON ===");

        System.out.println("str1 == str2: " + (str1.equals(str2)));
        System.out.println("str1.equals(str2): " + str1.equals(str2));

        System.out.println("str1 == str3: " + (str1.equals(str3)));
        System.out.println("str1.equals(str3): " + str1.equals(str3));

        System.out.println("str2 == str3: " + (str2.equals(str3)));
        System.out.println("str2.equals(str3): " + str2.equals(str3));

        /*
         * == compares the references or memory locations of String objects.
         * Since str1 and str2 were created using new String(), they are
         * different objects, so == returns false.
         *
         * equals() compares the actual contents of the Strings.
         * Since all three contain "Hello", equals() returns true.
         *
         * str3 uses a String literal, which is stored in the String pool,
         * so it has a different reference from the objects created with new.
         */

        int[] array1 = {10, 20, 30};
        int[] array2 = array1;

        System.out.println("\n=== SHARED ARRAY REFERENCE ===");

        System.out.println("Before modification:");
        System.out.println("array1[0]: " + array1[0]);
        System.out.println("array2[0]: " + array2[0]);

        // Modify the array through array2
        array2[0] = 100;

        System.out.println("\nAfter modifying array2[0]:");
        System.out.println("array1[0]: " + array1[0]);
        System.out.println("array2[0]: " + array2[0]);

        /*
        * array1 and array2 refer to the same array object.
        * Therefore, changing the array through array2 is also
        * visible through array1.
        */
  }

}
  
}
