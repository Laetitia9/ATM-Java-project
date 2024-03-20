package transaction;

import java.util.Scanner;

public class ProgramExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance = 5000, withdraw, deposit; //declare and initialize balance, withdraw and deposit
		Scanner s = new Scanner(System.in); //create scanner class object to get choice of user  
		while (true)
		{
			System.out.println("Automated Teller Machine");
			System.out.println("Choose 1 for Withdrawal");
			System.out.println("Choose 2 for Deposit");
			System.out.println("Choose 3 to Check Balance");
			System.out.println("Choose 4 to Check Pin");
			System.out.println("Choose 5 to Transfer Money");
			System.out.println("Choose 6 for EXIT");
			System.out.println("Choose the operation you want to perform:"); //get choice from user 
			int n = s.nextInt();
			switch(n)
			{
			
			case 1: //Withdrawal
				System.out.print("Enter money to be withdrawn:");  //get the withdrawal money from user  
				withdraw = s.nextInt();
				if(balance >= withdraw)  //check whether the balance is greater than or equal to the withdrawal amount  
				{
					balance = balance - withdraw;  //remove the withdrawal amount from the total balance  
					System.out.println("Please collect your money");	
				}
				else
				{
					System.out.println("Insufficient Balance"); //show custom error message 
				}
				System.out.print("balance :"+balance);
			System.out.println("");
			break;
			
			
			case 2: // Deposit
				System.out.print("Enter money to be deposited:");  //get deposit amount from the user 
				deposit = s.nextInt();
				balance = balance + deposit;  //add the deposit amount to the total balance  
				System.out.println("Your Money has been successfully deposited");
				System.out.print("Balance :"+balance);
				System.out.println("");
				break;
				
				
			case 3: //Check Balance
				System.out.println("Balance : "+balance); //displaying the total balance of the user 
				System.out.println("");
				break;
			
				
			case 4: //Check Pin
				Scanner input = new Scanner(System.in); // Create scanner class 
				int pin = 1234; // declare the correct pin
				
				int NumOfAttempts =0; // initialize number of trials
				while (NumOfAttempts <3)  { // number of attempts is less than 3
					NumOfAttempts = NumOfAttempts +1;
				
				System.out.println("enter pin : "); //print enter pin to help user
				int entry = input.nextInt();
				if (entry == pin) { //if entry is equal to pin number
				System.out.println("PIN ACCEPTED. YOU HAVE ACCESS TO YOUT ACCOUNT"); // them message prin accepted will appear
				break;
		
				}
				
				else {
					System.out.println("INCORRECT PIN. TRY AGAIN"); // if the pin is incorrect, the message incorrect pin will be displayed
					
				}
			} 
				if (NumOfAttempts ==3) { //maximum number of attempts is equal to 3
				System.out.println("Your account has been blocked"); //after 3 attempts,the account will be blocked
			}
			break;
				
				
			case 5: //Transfer Money
				System.out.println("Welcome"); //displaying a welcome message
				Scanner input1 = new Scanner (System.in);
				System.out.println("Choose between transfer, withdrawal, deposit, check balance: 1, 2, 3 or 4");
				int userChoice = input1.nextInt(); //declaring the integer userChoice
				double balance1 = 5000; // assigning a balance value
				
				switch (userChoice) {
				case 1:
							System.out.println("Enter amount to be transferred"); //print the message 
							double amount = input1.nextDouble();
							
							System.out.println("do you want to transfer this amount" + amount + "? yes or no?"); // asking the amount to be transferred
						    String transfer = input1.next();
						
						if (transfer.equalsIgnoreCase("yes")) {  //confirm amount to be transfered
							// then transfer amount
						System.out.println("Transfer successful"); //if yes then print transfer successfull
							
						}
						else if (transfer.equalsIgnoreCase("no")) { 
						System.out.println("Transfer failed"); //if no the display transfer failed
						amount = input1.nextDouble();
						break;
						}
						balance1 = balance1 - amount;
						System.out.println(balance1); //printing the total balance after transfer
						
				}
				break;
			case 6: //Exit
				System.exit(0); //exit from the menu 	
				
						
				
		}
	}

	}

}
