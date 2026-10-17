package mariaane.ganda;

import java.util.Scanner;

public Week3 {

    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

       System.out.println("===SIMPLE GRADE CLASSIFIER===");

        // FIRST TEST VALUE (FAILED)
        int score1 = 58, score2 = 87;
        if (score1 >= 60) {
            System.out.println("REMARKS: PASSED");
        } else {
            System.out.println("REMARKS: FAILED");
        }

        // SECOND TEST VALUE (PASSED)
        if (score2 >= 60) {
            System.out.println("REMARKS: PASSED");
        } else {
            System.out.println("REMARKS: FAILED");
        }

        System.out.println("\n=== MULTI-TIER DISCOUNT SYSTEM ===");

        double orderAmount = 18350.75;

        if (orderAmount >= 20000) {
            double discount = orderAmount * 0.15;
            double finalAmount = orderAmount - discount;

            System.out.println("DISCOUNT PROVIDED: " + discount);
            System.out.println("SUBTOTAL: " + finalAmount);

        } else if (orderAmount >= 10000) {
            double discount = orderAmount * 0.10;
            double finalAmount = orderAmount - discount;

            System.out.println("DISCOUNT PROVIDED: " + discount);
            System.out.println("SUBTOTAL: " + finalAmount);

        } else if (orderAmount >= 5000) {
            double discount = orderAmount * 0.05;
            double finalAmount = orderAmount - discount;

            System.out.println("DISCOUNT PROVIDED: " + discount);
            System.out.println("SUBTOTAL: " + finalAmount);

        } else {
            double discount = 0;
            double finalAmount = orderAmount - discount;

            System.out.println("DISCOUNT PROVIDED: " + discount);
            System.out.println("SUBTOTAL: " + finalAmount);
        }


        System.out.println("\n=== NESTED LOGIN VALIDATOR ===");

        String correctUsername = "student";
        String correctPassword = "java2026";

        String enteredUsername = "student";
        String enteredPassword = "java";

        if (enteredUsername.equals(correctUsername)) {
            System.out.println("USERNAME CORRECT. NOW VALIDATING");

            if (enteredPassword.equals(correctPassword)) {
                if (enteredUsername.equals(correctUsername)
                        && enteredPassword.equals(correctPassword)) {

                    System.out.println("ACCOUNT IS UNLOCKED");

                } else {
                    System.out.println("WRONG CREDENTIALS - ACCOUNT LOCKED");
                }

            } else {
                System.out.println("INCORRECT PASSWORD");
            }

        } else {
            System.out.println("INVALID USERNAME");
        }


        System.out.println("\n=== ATM TRANSACTION AUTHORIZER ===");

        String accountUser = "mariaane";
        String accountPin = "1126";
        double balance = 65000;

        System.out.print("ENTER YOUR USERNAME: ");
        String enteredUser = scanner.nextLine();

        System.out.print("ENTER YOUR PASSWORD: ");
        String enteredPin = scanner.nextLine();

        // 1. Nested if for username and PIN verification
        if (enteredUser.equals(accountUser)) {

            if (enteredPin.equals(accountPin)) {

        // 2. Else-if ladder to determine account tier
                String accountTier = "";

                if (balance >= 100000) {
                    accountTier = "PLATINUM";
                } else if (balance >= 75000) {
                    accountTier = "GOLD";
                } else if (balance >= 50000) {
                    accountTier = "SILVER";
                } else {
                    accountTier = "BRONZE";
                }

                System.out.println("ACCOUNT TIER: " + accountTier);


        // 3. Switch statement for daily limit and fee rate
                double withdrawalLimit = 0;
                double transactionRate = 0;

                switch (accountTier) {
                    case "PLATINUM":
                        withdrawalLimit = 15000.0;
                        transactionRate = 0.02;
                        break;
                    case "GOLD":
                        withdrawalLimit = 10000.0;
                        transactionRate = 0.03;
                        break;

                    case "SILVER":
                        withdrawalLimit = 5000.0;
                        transactionRate = 0.04;
                        break;
                    case "BRONZE":
                        withdrawalLimit = 2000.0;
                        transactionRate = 0.05;
                        break;
                }


                System.out.print("ENTER WITHDRAWAL AMOUNT: ");
                double withdrawal = scanner.nextDouble();

                double transactionFee = withdrawal * transactionRate;
                double totalDeduction = withdrawal + transactionFee;


          // 4. Nested if for withdrawal limit and account balance
                if (withdrawal <= withdrawalLimit) {
                    if (totalDeduction <= balance) {

                        balance -= totalDeduction;
                        System.out.println("\nSTATUS: APPROVED");
                        System.out.println("WITHDRAWAL AMOUNT: " + withdrawal);
                        System.out.println("TRANSACTION FEE: " + transactionFee);
                        System.out.println("TOTAL DEDUCTED: " + totalDeduction);
                        System.out.println("REMAINING BALANCE: " + balance);

                    } else {
                        System.out.println("\nSTATUS: DENIED");
                        System.out.println(
                            "REASON: Insufficient funds to cover the withdrawal and transaction fee."
                        );
                    }

                } else {
                    System.out.println("\nSTATUS: DENIED");
                    System.out.println(
                        "REASON: Withdrawal exceeds the daily limit of "
                        + withdrawalLimit + " for " + accountTier + " tier."
                    );
                }
            } else {
                System.out.println("\nSTATUS: DENIED");
                System.out.println("REASON: Incorrect PIN.");
            }
        } else {
            System.out.println("\nSTATUS: DENIED");
            System.out.println("REASON: Invalid username.");
        }

        scanner.close();
    }
}
