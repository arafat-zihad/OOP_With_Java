
import java.util.Scanner;

class ATM {

    int PIN = 5678;
    float Balance;

    public void checkPIN() {
        System.out.println("Enter your PIN");
        Scanner sc = new Scanner(System.in);
        int enterPIN = sc.nextInt();

        if (enterPIN == PIN) {
            menu();
        } else {
            System.out.println("Enter a valid PIN");
            menu();
        }
    }

    public void menu() {
        System.out.println("Enter Your Choice: ");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if (opt == 1) {
            checkBalance();
        } else if (opt == 2) {
            withdraw();
        } else if (opt == 3) {
            deposit();
        } else if (opt == 4) {
            return;
        } else {
            System.out.println("Enter a valid choice");
        }
    }

    public void checkBalance() {
        System.out.println("Balance: " + Balance);
        menu();
    }

    public void withdraw() {
        System.out.println("Enter Amount to Withdraw: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount > Balance) {
            System.out.println("Insufficient Balance");
        } else {
            Balance = Balance - amount;
            System.out.println("Money Withdraw Succesful");
        }
        menu();
    }

    public void deposit() {
        System.out.println("Enter the Amount: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money Deposited Succesfully");
        menu();
    }

}

public class ATM_Machine {

    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkPIN();
    }
}

