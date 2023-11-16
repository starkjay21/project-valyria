import java.util.Scanner;

public class OnlineBankingSystem {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Create Account");
            System.out.println("2. Perform Transaction");
            System.out.println("3. Display Account Details");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> createAccount(bank, scanner);
                case 2 -> performTransaction(bank, scanner);
                case 3 -> displayAccountDetails(bank, scanner);
                case 4 -> {
                    System.out.println("Exiting the system. Thank you!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void createAccount(Bank bank, Scanner scanner) {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter phone: ");
        String phone = scanner.nextLine();
        bank.createAccount(name, address, email, phone);
    }

    private static void performTransaction(Bank bank, Scanner scanner) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.print("Select a transaction type: ");
        int transactionChoice = scanner.nextInt();
        System.out.print("Enter amount: ");
        double transactionAmount = scanner.nextDouble();
        bank.performTransaction(accountNumber, transactionChoice, transactionAmount);
    }

    private static void displayAccountDetails(Bank bank, Scanner scanner) {
        System.out.print("Enter account number: ");
        String displayAccountNumber = scanner.nextLine();
        Account displayAccount = bank.getAccount(displayAccountNumber);
        if (displayAccount != null) {
            System.out.println(displayAccount);
        } else {
            System.out.println("Account not found.");
        }
    }
}