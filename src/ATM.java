import java.util.Scanner;
public class ATM {
	public static void main(String[] args) {		
		Account[] account = new Account[10];
		Scanner input = new Scanner(System.in);
		int iD, choice;
		double amount;		
		
		//initialize accounts with ID and balance $100
		for (int i = 0; i < account.length - 1; i++) {
			account[i] = new Account();
			account[i].setID(i);
			account[i].setBalance(100);
		}
		
		//main loop
		do {
			//input validation loop
			do {
			System.out.print("Enter an account ID (0-" + (account.length - 1) + "): ");
			iD = input.nextInt();
				if (iD < 0 || iD > account.length - 1)
					System.out.println("\nAccount does not exist.");
			} while (iD < 0 || iD > account.length - 1);
			//main menu loop
			do {
			System.out.print("\nMain menu for account ID " + account[iD].getID() + ".\n1: check balance\n2: withdraw\n3: deposit\n4: exit\nEnter a choice: ");
			choice = input.nextInt();		
				switch (choice) {
				//display balance
				case 1: System.out.printf("\nAccount ID " + account[iD].getID() + " balance is: $%.2f\n",  account[iD].getBalance()); break;
				//withdraw
				case 2: System.out.print("Enter an amount to withdraw: ");
				amount = input.nextDouble(); 
				account[iD].withdraw(amount); break;
				//deposit
				case 3: System.out.print("Enter an amount to deposit: ");
				amount = input.nextDouble(); 
				account[iD].deposit(amount); break;
				//exit
				case 4: break;
				default: System.out.println("Not a valid choice."); break;
				}			
			} while (choice != 4);
		} while (choice == 4);
	}
}
	
