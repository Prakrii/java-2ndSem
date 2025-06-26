// Create a Java class called BankAccount with attributes for accountNumber, balance, and accountHolderName.
// Write a constructor to initialize the attributes and a method to deposit money into the account.

import java.util.Scanner;

public class BankAccount {
    long accountNumber;
    double balance;
    String accountHolderName;

    // Constructor
    BankAccount( long accountNumber,double balance, String accountHolderName){
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.accountHolderName=accountHolderName;
    }
      
    Scanner input=new Scanner(System.in);

// Method 
void deposit(){
  
double amount=  input.nextDouble();  

if (amount<=0){
    System.out.println("Please enter positive valid numeber");
}
else
{ 
    System.out.println("Amount Deposited: "+ amount);
    System.out.println("Previous Amount: "+ balance);
    balance=balance+amount;
   
    System.out.println("Current amount: "+ balance);
}
}

public static void main(String[] args) {
    System.out.println("Please enter amount to be deposited");
    BankAccount bankac=new BankAccount(21, 10000, "Ram Thapa");
    bankac.deposit();
}

}
