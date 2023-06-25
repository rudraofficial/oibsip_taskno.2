import java.util.Scanner;

public class ATM {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the ATM!");
        System.out.print("Enter your user ID: ");
        String userID = scanner.nextLine();
        System.out.print("Enter your PIN: ");
        int pin = scanner.nextInt();

        if (validateUser(userID, pin)) {
            System.out.println("Login successful!");
            int choice;
            do {
                System.out.println("What would you like to do?");
                System.out.println("1. Transactions History");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Transfer");
                System.out.println("5. Quit");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        // Demo transaction history
                        System.out.println("Transaction history:");
                        System.out.println("Demo Transaction history-");
                        System.out.println("1. 12/03/2023 - Withdrawal - ₹100");
                        System.out.println("2. 10/03/2023 - Deposit - ₹500");
                        System.out.println("3. 08/03/2023 - Transfer - ₹200");
                        System.out.println();
                        break;
                    case 2:
                        // Withdraw money
                        System.out.println("Withdraw money:");
                        System.out.print("Enter the amount you want to withdraw: ");
                        int amount = scanner.nextInt();
                        System.out.println("You have withdrawn ₹" + amount + ".");
                        System.out.println();
                        break;
                    case 3:
                        // Deposit money
                        System.out.println("Deposit money:");
                        System.out.print("Enter the amount you want to deposit: ");
                        amount = scanner.nextInt();
                        System.out.println("You have deposited ₹" + amount + ".");
                        System.out.println();
                        break;
                    case 4:
                        // Transfer money
                        System.out.println("Transfer money:");
                        System.out.print("Enter the amount you want to transfer: ");
                        amount = scanner.nextInt();
                        System.out.println("The transfer of ₹" + amount + " has been successful.");
                        System.out.println();
                        break;
                    case 5:
                        System.out.println("Thank you for using the ATM!");
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            } while (choice != 5);
        } else {
            System.out.println("Invalid user ID or PIN!");
        }
    }

    private static boolean validateUser(String userID, int pin) {
        return userID.equals("123456") && pin == 1234;
    }

    private static void showTransactionHistory() {
        // TODO: Show the transaction history
    }

    private static void withdrawMoney() {
        // TODO: Withdraw money
    }

    private static void depositMoney() {
        // TODO: Deposit money
    }

    private static void transferMoney() {
        // TODO: Transfer money
    }
}