package AccountManagement;
import java.util.*;
public class AccountManagement {
	    static Scanner sc = new Scanner(System.in);
	    static Date currentDate = new Date();

	    // Arrays to store account information for multiple customers
	    static long[] accountNumbers = new long[100];  // Store up to 100 accounts
	    static String[] customerNames = new String[100]; // Store customer names
	    static long[] balances = new long[100]; // Store balances for each account
	    static int accountCount = 0; // To track the number of created accounts

	    // Method to create a new account
	    public static void createAccount(String customerName, long accountNumber, long initialBalance) {
	        accountNumbers[accountCount] = accountNumber;
	        customerNames[accountCount] = customerName;
	        balances[accountCount] = initialBalance;
	        accountCount++;
	        System.out.println("Account created successfully!");
	    }

	    // Method to withdraw money from an account
	    public static void withdraw(long accountNumber, long amount) {
	        boolean found = false;
	        for (int i = 0; i < accountCount; i++) {
	            if (accountNumbers[i] == accountNumber) {
	                found = true;
	                if (amount <= balances[i]) {
	                    balances[i] -= amount;
	                    System.out.println("Money withdrawn successfully!");
	                    System.out.println("Current balance: " + balances[i]);
	                    System.out.println("Transaction Date: " + currentDate);
	                } else {
	                    System.out.println("Insufficient balance!");
	                }
	                break;
	            }
	        }
	        if (!found) {
	            System.out.println("Account not found!");
	        }
	    }

	    // Method to display account details
	    public static void displayAccountDetails(long accountNumber) {
	        boolean found = false;
	        for (int i = 0; i < accountCount; i++) {
	            if (accountNumbers[i] == accountNumber) {
	                found = true;
	                System.out.println("Customer Name: " + customerNames[i]);
	                System.out.println("Account Number: " + accountNumbers[i]);
	                System.out.println("Account Balance: " + balances[i]);
	                break;
	            }
	        }
	        if (!found) {
	            System.out.println("Account not found!");
	        }
	    }

	    // Main method to interact with the user
	    public static void main(String[] args) {
	        while (true) {
	            System.out.println("\n--- Menu ---");
	            System.out.println("1. Create Account");
	            System.out.println("2. Withdraw Money");
	            System.out.println("3. Display Account Details");
	            System.out.println("4. Exit");
	            System.out.print("Choose an option: ");
	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter Customer Name: ");
	                    String name = sc.next();
	                    System.out.print("Enter Account Number: ");
	                    long accountNumber = sc.nextLong();
	                    System.out.print("Enter Initial Balance: ");
	                    long initialBalance = sc.nextLong();
	                    createAccount(name, accountNumber, initialBalance);
	                    break;
	                case 2:
	                    System.out.print("Enter Account Number: ");
	                    long withdrawAccountNumber = sc.nextLong();
	                    System.out.print("Enter Amount to Withdraw: ");
	                    long amount = sc.nextLong();
	                    withdraw(withdrawAccountNumber, amount);
	                    break;
	                case 3:
	                    System.out.print("Enter Account Number to Display Details: ");
	                    long displayAccountNumber = sc.nextLong();
	                    displayAccountDetails(displayAccountNumber);
	                    break;
	                case 4:
	                    System.out.println("Exiting...");
	                    System.exit(0);
	                    break;
	                default:
	                    System.out.println("Invalid option! Please try again.");
	            }
	        }
	    }
	}
