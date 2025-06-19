import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    public String deposit(double amount) {
        if (amount <= 0) {
            return "Deposit amount must be positive.";
        }
        balance += amount;
        return String.format("Successfully deposited ₹%.2f", amount);
    }
    public String withdraw(double amount) {
        if (amount <= 0) {
            return "Withdrawal amount must be positive.";
        }
        if (amount > balance) {
            return "Insufficient balance.";
        }
        balance -= amount;
        return String.format("Successfully withdrew ₹%.2f", amount);
    }

    public String checkBalance() {
        return String.format("Your current balance is: ₹%.2f", balance);
    }
}
public class ATM {
    private BankAccount account;
    private Scanner scanner;

    public ATM(BankAccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }
    public void showMenu() {
        System.out.println("\n====== ATM Service ======");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.print("Choose option 1 to 4: ");
    }
    public void run() {
        boolean running = true;

        while (running) {
            showMenu();
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println(account.checkBalance());
                    break;

                case "2":
                    System.out.print("Enter deposit amount: ");
                    try {
                        double depositAmount = Double.parseDouble(scanner.nextLine());
                        System.out.println(account.deposit(depositAmount));
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a number.");
                    }
                    break;

                case "3":
                    System.out.print("Enter withdrawal amount: ");
                    try {
                        double withdrawalAmount = Double.parseDouble(scanner.nextLine());
                        System.out.println(account.withdraw(withdrawalAmount));
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a number.");
                    }
                    break;

                case "4":
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Please choose between 1 and 4.");
            }
        }
    }
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000.0); 
        ATM atm = new ATM(userAccount);
        atm.run();
    }
}
