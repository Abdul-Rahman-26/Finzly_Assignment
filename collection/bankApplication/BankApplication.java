package collection.bankApplication;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class BankApplication {

    private static Scanner scanner = new Scanner(System.in);
    public static boolean stop = false;
    public static Map<Long, Account> newAccount = new HashMap<>();

    public static void main(String[] args) {
        while (!stop) {
            System.out.println("|1 Add Account \n|2 Deposit \n|3 Withdraw \n|4 Check Balance \n|5 Exit\n|Select Option:");
            if (scanner.hasNextInt()) {
                int option = scanner.nextInt();

                if (isValid(option)) {
                    options(option);
                } else {
                    System.out.println("Invalid input. Please enter a valid numeric option.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid numeric option.");
                scanner.next();
            }
        }
        scanner.close();
    }

    private static boolean isValid(int option) {
        return option >= 1 && option <= 5;
    }

    private static void options(int option) {
        switch (option) {
            case 1:
                addAccount();
                break;
            case 2:
                accountdeposit();
                break;
            case 3:
                accountwithdraw();
                break;
            case 4:
                accountcheckBalance();
                break;
            case 5:
                exit();
                break;
            default:
                System.out.println("Enter the Valid option");
                break;
        }
    }

    private static void addAccount() {
        scanner.nextLine();
        System.out.println("Enter the Accountant Name: ");
        String accountName = scanner.nextLine();
        System.out.println("Enter the Account Number : ");
        long accountNumber = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Enter the Minimum amount : ");
        double balance = scanner.nextDouble();
        Account account = new Account(accountName, balance);
        newAccount.put(accountNumber, account);
    }

    private static void accountdeposit() {
        scanner.nextLine();
        System.out.println("Enter the account Number : ");
        long accNo = scanner.nextLong();
        scanner.nextLine();
        Account account = newAccount.get(accNo);
        if (account != null) {
            System.out.println("Enter the deposit amount: ");
            double amount = scanner.nextDouble();
            account.deposit(amount);
        } else {
            System.out.println("Account Not found");
        }
    }

    private static void accountwithdraw() {
        scanner.nextLine();
        System.out.println("Enter the account Number : ");
        long accNo = scanner.nextLong();
        scanner.nextLine();
        Account account = newAccount.get(accNo);
        if (account != null) {
            System.out.println("Enter the withdrawal amount: ");
            double amount = scanner.nextDouble();
            account.withdraw(amount);
        } else {
            System.out.println("Account Not found");
        }
    }

    private static void accountcheckBalance() {
        scanner.nextLine();
        System.out.println("Enter the account Number : ");
        long accNo = scanner.nextLong();
        scanner.nextLine();
        Account account = newAccount.get(accNo);
        if (account != null) {
            System.out.println("Available Balance = " + account.getBalance());
        } else {
            System.out.println("Account Not found");
        }
    }

    private static void exit() {
        System.out.println("Thank you !!!");
        stop = true;
    }
}
