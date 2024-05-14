import java.util.Scanner;  
   
public class Task3 {    
    public static void main(String args[] )  
    {    
        int balance_amount, withdraw_amount, deposit_amount; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the balance amount:");
        balance_amount=sc.nextInt();
          
        while(true)  
        {  
            System.out.println("Automated Teller Machine");  
            System.out.println("Choose 1 for Withdrawal of amount");  
            System.out.println("Choose 2 for Deposit of amount");  
            System.out.println("Choose 3 for Check Balance in the account");  
            System.out.println("Choose 4 for EXIT from menu");  
            System.out.print("Choose the operation you want to perform:");  
  
            int choice = sc.nextInt();  
            switch(choice)  
            {  
                case 1 -> {
                    System.out.print("Enter money to be withdrawn:");
                    
                    withdraw_amount = sc.nextInt();
                    
                    if(balance_amount >= withdraw_amount)
                    {
                        balance_amount = balance_amount - withdraw_amount;
                        System.out.println("Please collect your money");
                    }
                    else
                    {
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                }  
   
                case 2 -> {
                    System.out.print("Enter money to be deposited:");
                    
                    deposit_amount = sc.nextInt();
                    
                    balance_amount = balance_amount + deposit_amount;
                    System.out.println("Your Money has been successfully depsited");
                    System.out.println("");
                }  

                case 3 -> {
                    System.out.println("Balance : "+balance_amount);
                    System.out.println("");
                }  
   
                case 4 -> System.exit(0);  
            }  
        }  
    }  
}