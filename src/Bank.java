import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<String, Account> accounts;

    public Bank() {
        this.accounts = new HashMap<>();
    }

    public void createAccount(String name, String address, String email, String phone) {
        String accountNumber = generateAccountNumber();
        Account account = new Account(name, address, email, phone, accountNumber);
        accounts.put(accountNumber, account);
        System.out.println("Account created successfully:\n" + account);
    }

    private String generateAccountNumber() {
        return "ACC" + (accounts.size() + 1);
    }

    public void performTransaction(String accountNumber, int choice, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            switch (choice) {
                case 1 -> account.deposit(amount);
                case 2 -> account.withdraw(amount);
                default -> System.out.println("Invalid transaction choice.");
            }
        } else {
            System.out.println("Account not found.");
        }
    }

    public Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }
}