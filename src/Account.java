public class Account {
    private String name;
    private String address;
    private String email;
    private String phone;
    private String accountNumber;
    private double balance;

    public Account(String name, String address, String email, String phone, String accountNumber) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public String toString() {
        return "Name: " + name + "\nAddress: " + address + "\nEmail: " + email +
                "\nPhone: " + phone + "\nAccount Number: " + accountNumber +
                "\nBalance: " + balance;
    }
}