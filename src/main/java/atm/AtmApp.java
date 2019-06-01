package atm;

import java.util.Scanner;

public class AtmApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Atm myAtm = new Atm(500, "1111");
		
System.out.println("Enter your PIN");
String enteredPin = input.nextLine();

if (myAtm.getPin().equals(enteredPin)) {
	System.out.println("Welcome to the bank of we can code IT");
}

System.out.println("choose an option");
System.out.println("Press 1 to deposit funds");
System.out.println("Press 2 to withdrawal funds.");
System.out.println("Press 3 to check balance.");
System.out.println("Press 4 to exit.");
String menuOption = input.nextLine();

while (!menuOption.equals("4")) {
	
if (menuOption.equals("1")) {
	System.out.println("Enter the amount you would like to deposit:");
	double amountToDeposit = input.nextInt();
	myAtm.deposit(amountToDeposit);
	input.nextLine(); //gives us input separation
	
} else if(menuOption.equals("2")) {
	System.out.println("Enter the amount you would like to withdraw");
	double amountToWithdraw = input.nextInt();
	myAtm.withdraw(amountToWithdraw);
	input.nextLine(); //gives us input separation
	
} else if (menuOption.equals("3")) {
	System.out.println("Your current balance is" + myAtm.getBalance());
	
} else {
	System.out.println("Goodbye....thanks for banking with us today!");
		System.exit(0);
}

System.out.println("choose another option");
System.out.println("Press 1 to deposit funds");
System.out.println("Press 2 to withdrawal funds.");
System.out.println("Press 3 to check balance.");
System.out.println("Press 4 to exit.");
menuOption = input.nextLine();
	}

}}
