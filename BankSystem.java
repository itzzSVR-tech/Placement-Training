import java.util.Scanner;

// 1. Base Class
class Account {
    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Success! Deposited: $" + amount);
        } else {
            System.out.println("Error: Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Success! Withdrawn: $" + amount);
        } else {
            System.out.println("Error: Insufficient funds.");
        }
    }

    public void checkBalance() {
        System.out.println("Account " + accountNumber + " Balance: $" + balance);
    }
}

// 2. Savings Class (Min Balance Rule)
class SavingAccount extends Account {
    private double minBalance = 500.00;

    public SavingAccount(String accNum, double initBal) {
        super(accNum, initBal);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= minBalance) {
            balance -= amount;
            System.out.println("Success! Withdrawn: $" + amount);
        } else {
            System.out.println("Failed: Savings account must maintain $" + minBalance);
        }
    }
}

// 3. Current Class (Overdraft Rule)
class CurrentAccount extends Account {
    private double overdraftLimit = 1000.00;

    public CurrentAccount(String accNum, double initBal) {
        super(accNum, initBal);
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Success! Withdrawn: $" + amount);
        } else {
            System.out.println("Failed: Overdraft limit exceeded.");
        }
    }
}

// 4. Main Class
public class BankSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account myAccount = null; // Polymorphism: Can hold Savings or Current

        System.out.println("=== WELCOME TO JAVA BANK ===");

        // Step 1: Account Setup
        System.out.print("Enter Account Number (e.g., USER123): ");
        String accNum = scanner.next();

        System.out.print("Enter Initial Balance: ");
        double initBal = scanner.nextDouble();

        System.out.println("Choose Account Type:");
        System.out.println("1. Savings Account (Min Balance $500)");
        System.out.println("2. Current Account (Overdraft allowed)");
        int type = scanner.nextInt();

        if (type == 1) {
            myAccount = new SavingAccount(accNum, initBal);
        } else {
            myAccount = new CurrentAccount(accNum, initBal);
        }

        System.out.println("\nAccount Created Successfully!");

        // Step 2: The "Calculator" Loop
        boolean running = true;
        while (running) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depAmount = scanner.nextDouble();
                    myAccount.deposit(depAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withAmount = scanner.nextDouble();
                    myAccount.withdraw(withAmount);
                    break;
                case 3:
                    myAccount.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for banking with us!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}