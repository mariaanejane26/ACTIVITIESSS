package mariaane.ganda;
import java.util.Scanner;

public Week4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in) ;

    System.out.println("=== NUMBER AND SQUARE PRINTER ===");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " SQUARE: " + (i * i));
        }

        System.out.println("=============================");
        for (int a = 1; a <= 20; a++) {
            System.out.println(a + " SQUARE: " + (a * a));
        }
    
        System.out.println("=============================");
    
        System.out.println("=== SUM UNTIL SENTINEL VALUE ===");
    
        System.out.println("ENTER NEGATIVE NUMBERS TO STOP: ");
        int total = 0;

        while (true) {
            int userInput = scanner.nextInt();

            if (userInput < 0) {
                break;
            }

            total += userInput;
        }

        System.out.println("TOTAL: " + total);

        System.out.println("=============================");

        System.out.println("=== PATTERN GENERATOR ===");

        int size = 7;

        for (int column = 1; column <= size; column++) {

            if (column == 4) {
                break;
            }

            for (int row = 1; row <= size; row++) {

                if (row == 6) {
                    continue;
                }

                System.out.print("[" + row + "," + column + "] ");
            }

            System.out.println();
        }

        System.out.println("=============================");
        System.out.println("=== STORE INVENTORY SCANNER ===");

        int[][] inventory = {
            {10, 4, -1},
            {7, -1, 15},
            {3, 9, 2}
        };

        int menuChoice;

        do {

            System.out.println(
                "\n1. Total Stock | 2. Find Low Stock | 3. Restock Slot | 4. Exit"
            );

            System.out.print("Enter selection: ");
            menuChoice = scanner.nextInt();

            if (menuChoice == 1) {

                int totalStock = 0;

                for (int r = 0; r < inventory.length; r++) {

                    for (int c = 0; c < inventory[r].length; c++) {

                        if (inventory[r][c] == -1) {
                            continue;
                        }

                        totalStock += inventory[r][c];
                    }
                }

                System.out.println(
                    "Total Stock (skipping -1): " + totalStock
                );

            } else if (menuChoice == 2) {

                findLowStock:
                for (int r = 0; r < inventory.length; r++) {

                    for (int c = 0; c < inventory[r].length; c++) {

                        if (inventory[r][c] >= 0 && inventory[r][c] < 5) {

                            System.out.println(
                                "First low stock found at: Row "
                                + r + ", Col " + c
                            );

                            break findLowStock;
                        }
                    }
                }

            } else if (menuChoice == 3) {

                restockInventory(inventory, scanner);
            }

        } while (menuChoice != 4);

        System.out.println("Exiting system. Goodbye!");

        scanner.close();
    }


    public static void restockInventory(
        int[][] inventory,
        Scanner scanner
    ) {

        while (true) {

            System.out.print(
                "Enter target row and column indices: "
            );

            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (
                row < 0 ||
                row >= inventory.length ||
                col < 0 ||
                col >= inventory[row].length ||
                inventory[row][col] == -1
            ) {

                System.out.println("Invalid bounds");
                continue;
            }

            System.out.print("Enter amount to add: ");

            int amount = scanner.nextInt();

            inventory[row][col] += amount;

            System.out.println("Slot successfully restocked.");

            return;
        }
    }
}
