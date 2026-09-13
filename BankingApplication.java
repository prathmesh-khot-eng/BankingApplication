
import java.util.Scanner;

public class BankingApplication
{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("    +===============================================================+");
        System.out.println("    | ------------- Welcome to the Banking Services ----------------|");
        System.out.println("    |===============================================================|");
        System.out.println("    |                                                               |");
        System.out.println("    |              1. Withdrawal                                    |");
        System.out.println("    |              2. Deposit                                       |");
        System.out.println("    |              3. Bank Balance                                  |");
        System.out.println("    |              4. PIN                                           |");
        System.out.println("    |              5. Exit                                          |");
        System.out.println("    +===============================================================+");

       

        
        String pin  = "1234"; //This is account pin default because  account holder creates such pin for security purpose such for ATM purpose, this is hardcoded value
        double bankBalance = 0; //Initially 0
       
        // This is entry pin which must matches with above pin that is 1234
        String entryPIN ="";
        System.out.print(" Enter entry PIN: ");
        entryPIN = input.next();
        System.out.println();
        // Checking the entered pin and default pin are equal by .equals() method of string, it simply check values
     if(entryPIN.equals(pin)){
        //while loop
        while(true){
            System.out.println("\nChoose Your Choice : 1.Withdrawal \t 2.Deposit \t 3. Check Bank Balance \t 4.PIN \t 5.Exit :");
            int ch = input.nextInt();
            if(ch == 1){
                if(bankBalance != 0 && bankBalance > 0)
                {

                    //first we take input for withdrawal
                    System.out.println("Enter Withdrawal Amount: ");
                    int withdrawAmount = input.nextInt();
                
                    //the withdrawal amount should greater than 0 becauze bank balance is always greater than 0 or equal to zero
                    if(withdrawAmount < 0){
                        System.err.println("The amount less than 0 is not withdrawal ..");
                    }
                    // when withdraw amount greater than current bank balance then we can't withdraw because our bank balance is not sufficient to withdraw
                    else if(withdrawAmount > bankBalance ){
                        System.out.println("You can't withdraw , your balance is not sufficient");
                    }
                    else
                    {
                        if(withdrawAmount == 0){
                            System.out.println("You can't withdraw...");
                        }else{
                           bankBalance -= withdrawAmount;
                           System.out.println("Amount "+withdrawAmount+" Rs is withdrawal successfully..");
                           System.out.println("After withdrawal the Bank Balance : "+bankBalance);
                        }
                        
                    }
                }else{
                    System.out.println("You can't withdraw because your balance should greater than zero , then first you deposit some amount.");
                    }

            }
            else if(ch == 2)
            {

                    // Taking Deposit amount from user
                    System.out.println("Enter Deposit Amount : ");
                    int depositAmount = input.nextInt();  //user input (used nextInt() of Scanner class which used for taking input)

                        if(depositAmount <= 0){
                            System.out.println("Enter Valid amount for deposit, it always should greater than zero.");
                        }else{
                            bankBalance += depositAmount;
                            System.out.println("Amount "+depositAmount+" Rs is deposited successfully...");
                            System.out.println("After deposit the Bank balance : "+bankBalance);
                         }   



            }
            else if(ch == 3)
            {
                //The bank balance should be always greater than or equal to zero then only it visible , because balance is never go in negative value ,it always positive 
                if(bankBalance >= 0)
                System.out.println("Your Bank Balance is: "+bankBalance);
                else{
                    System.out.println("Bank balance should always greater than or equal to 0");
                }

            }
            else if(ch == 4)
            {
                //Current PIN
                System.out.println("Your current PIN: "+pin);


            }   
            else if(ch == 5)
            {
                System.out.println("Thank you.. For Taking benefit of our bank services");
                   //stop (break is used to stop working of loop , it terminate work of loop)
                break;
                
                
             }else if(ch < 0 || ch > 5){
                //If you not enterd valid choice the work is stopped forcefully
                System.out.println("You not entered valid choice so we are stopping the services.. Thank You!!");
                return;
             }
    }
    }else{
        System.out.println("You are not valid user..");
        return;
    }
} 

 }

    
