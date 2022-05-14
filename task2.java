//import required classes and packages   
import java.util.*;  
  
//create ATMExample class to implement the ATM functionality  
public class task2 
{  
    //main method starts   
    public static void main(String args[] )  
    {  
        //declare and initialize balance, withdraw, and deposit  
        int balance = 100000, withdraw, deposit;  
          
        //create scanner class object to get choice of user  
        Scanner sc = new Scanner(System.in);  
          
        while(true)  
        {  
            System.out.println("ATM INTERFACE");  
            
            System.out.println("Choose 1 for Check Balance"); 
            System.out.println("Choose 2 for Withdraw");  
            System.out.println("Choose 3 for Deposit");  
            System.out.println("Choose 4 for Tranfer"); 
            System.out.println("Choose 5 for Quit");  
            System.out.print("Choose the operation you want to perform:");  
              
            //get choice from user  
            int choice = sc.nextInt();  
            switch(choice)  
            {  
                case 1:
                    //displaying the total balance of the user  
                    System.out.println("Balance : "+balance);  
                    System.out.println("");  
                    break;
                
                case 2:  
                    System.out.print("Enter money to be withdrawn:");  
                      
                    //get the withdrawl money from user  
                     withdraw = sc.nextInt();  
                      
                    //check whether the balance is greater than or equal to the withdrawal amount  
                    if(balance >= withdraw)  
                    {  
                        //remove the withdrawl amount from the total balance  
                        balance = balance - withdraw;  
                        System.out.println("Please collect your money");  
                    }  
                    else  
                    {  
                        //show custom error message   
                        System.out.println("Insufficient Balance");  
                    }  
                    System.out.println("");  
                    break;  
   
                case 3:  
                      
                    System.out.print("Enter money to be deposited:");  
                      
                    //get deposite amount from te user  
                    deposit = sc.nextInt();  
                      
                    //add the deposit amount to the total balanace  
                    balance = balance + deposit;  
                    System.out.println("Your Money has been successfully depsited");  
                    System.out.println("");  
                    break;  
   
                case 4:  
                    System.out.println("Account Based Tranfer");
                    System.out.print("Enter Account Number : ");
                    
                    System.out.print("Enter Amount : ");
                    int amount = sc.nextInt();
                    
                    if(amount > balance)
                        System.out.println("Balance is not sufficient");
                    else {  
                        System.out.println("The amount tranfer successfully");
                        balance = balance - amount;
                    }
                    System.out.println("");
                    break;  
   
                case 5:  
                    //exit from the menu  
                    System.exit(0);  
            }  sc.close();
        }
        
      
    }  
}  