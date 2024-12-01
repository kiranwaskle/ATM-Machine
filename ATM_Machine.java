import javafx.scene.layout.Background;

import javax.sound.midi.SysexMessage;
import java.time.temporal.TemporalAmount;
import java.util.Scanner;

class ATM
{
    float balance;
    int PIN = 3568;

    public void checkpin()
    {
        System.out.println("Enter your pin");
        Scanner sc = new Scanner(System.in);
        int enterpin = sc.nextInt();

        if(enterpin==PIN)
        {
            menu();
        }
        else
        {
            System.out.println("Please enter a valid pin");
            checkpin();
        }
    }

    public void menu()
    {
        System.out.println("Enter your choice");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw money");
        System.out.println("3. Deposite money");
        System.out.println("4. Exit");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if(opt == 1)
        {
            checkBalance();
        }
        else if(opt == 2)
        {
            withDrawMoney();
        }
        else if(opt==3)
        {
            depositeMoney();
        }
        else if(opt == 4)
        {
            return;
        }
        else
        {
            System.out.println("Please enter a valid optiontion");
        }
    }

    public void checkBalance()
    {
        System.out.println("Balance: "+ balance);
        menu();
    }
    public void withDrawMoney()
    {
        System.out.println("Enter amount of money you want to withdraw");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextInt();

        if(amount>balance)
        {
            System.out.println("Insufficient balance");
        }
        else
        {
            balance = balance-amount;
            System.out.println("Money withdraw successfully");
        }
        menu();
    }

    public void depositeMoney()
    {
        System.out.println("Enter the amount of money you want to deposite");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        balance = balance + amount;
        System.out.println("Money deposite successfully yeah!!");
        menu();
    }
}

public class ATMmachine
{
    public static void main(String[]args)
    {
      ATM obj = new ATM();
      obj.checkpin();
    }
}
