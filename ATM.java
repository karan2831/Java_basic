import java.util.Scanner;

public class ATM
{
    public static void main(String[] args) 
    {
        double balance = 1000.0; 
        int pin = 1234;
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the ATM!");
        System.out.print("Enter your PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin != pin) 
        {
            System.out.println("Incorrect PIN. Access denied.");
            sc.close(); 
            return;
        }

        int choice = 0;
        do {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            if (choice == 1) 
            {
                System.out.println("Current Balance: $" + balance);
            }

            else if (choice == 2)
            {
                System.out.print("Enter amount to deposit: $");
                double deposit = sc.nextDouble();
                if (deposit > 0)
                {
                    balance += deposit;
                    System.out.println("Deposit successful! New Balance: $" + balance);
                } else {
                    System.out.println("Invalid deposit amount.");
                }
            }

            else if (choice == 3) 
            {
                System.out.print("Enter amount to withdraw: $");
                double withdraw = sc.nextDouble();
                if (withdraw > 0 && withdraw <= balance) 
                {
                    balance -= withdraw;
                    System.out.println("Withdrawal successful! New Balance: $" + balance);
                } else {
                    System.out.println("Insufficient balance or invalid amount.");
                }
            }

            else if (choice == 4) 
            {
                System.out.println("Thank you for using the ATM. Goodbye!");
            }

            else 
            {
                System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        sc.close(); 
    }
}
