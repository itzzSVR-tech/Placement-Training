// 1. Base Class: Account
class Account { 
    protected String accountNumber;
    protected double balance;

    // Constructor
    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method: deposit()
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(accountNumber + ": Deposited $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method: withdraw() - This will be overridden in child classes
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(accountNumber + ": Withdrawn $" + amount);
        } else {
            System.out.println(accountNumber + ": Insufficient balance.");
        }
    }

    // Method: checkBalance()
    public void checkBalance() {
        System.out.println(accountNumber + ": Current Balance: $" + balance);
    }
}

// 2. Child Class: SavingAccount (Demonstrates Inheritance)
class SavingAccount extends Account {
    private double minBalance = 500.00; // Specific rule for Savings

    public SavingAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    // CONCEPT: Method Overriding
    // Savings accounts cannot drop below a minimum balance
    @Override
    public void withdraw(double amount) {
        if (balance - amount >= minBalance) {
            balance -= amount; // Direct access because balance is protected
            System.out.println(accountNumber + " (Savings): Withdrawn $" + amount);
        } else {
            System.out.println(accountNumber + " (Savings): Failed. Balance cannot drop below $" + minBalance);
        }
    }
}

// 3. Child Class: CurrentAccount (Demonstrates Inheritance)
class CurrentAccount extends Account {
    private double overdraftLimit = 1000.00; // Specific rule for Current

    public CurrentAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    // CONCEPT: Method Overriding
    // Current accounts allow you to withdraw more than you have (Overdraft)
    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println(accountNumber + " (Current): Withdrawn $" + amount);
        } else {
            System.out.println(accountNumber + " (Current): Failed. Overdraft limit exceeded.");
        }
    }
}

// Main class to run the system
public class BankSystem {
    public static void main(String[] args) {
        System.out.println("=== BANK ACCOUNT SYSTEM ===\n");

        // Create a Saving Account with $1000
        SavingAccount saver = new SavingAccount("SAV-001", 1000);
        saver.checkBalance();
        saver.deposit(200);
        saver.withdraw(800); // This should fail (would leave $400, min is $500)
        saver.withdraw(200); // This should pass
        saver.checkBalance();

        System.out.println("\n---------------------------\n");

        // Create a Current Account with $500
        CurrentAccount current = new CurrentAccount("CUR-001", 500);
        current.checkBalance();
        current.withdraw(1000); // This should pass (uses overdraft)
        current.checkBalance(); // Balance will be negative
        current.withdraw(5000); // This should fail (exceeds overdraft)
    }
}