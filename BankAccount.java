import java.util.Scanner;


public class BankAccount{
	String accountName ="John Edward";
	String accountNumber ="4590468734";
	double accountBalance =94746.89;
	
	public double deposit(int amount){
		accountBalance += amount;
		
		return accountBalance;
	}
	
	public double withdrawal(int amount){
		accountBalance -= amount;
		if (amount > accountBalance){
			System.out.printf("insufficient funds");
		}
		else{
			accountBalance -= amount;
		}
		return accountBalance
	}
	
	public double checkbalance(){
		
	}
	
	public static void main(String[] args){
		BankAccount ba = new BankAccount();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to UBA Bank");
		System.out.println("Enter 1 to withdrawal");
		System.out.println("Enter 2 to deposit");
		System.out.println("Enter 3 to checkbalance");
		System.out.println();
		
		System.out.print("Enter your choice");
		int choice = input.nextInt();
		System.out.println();
		
		switch(choice){
			case 1:
			{
				System.out.print("Enter your choice");
		        int choice = input.nextInt();
				
			    System.out.println("================================");
				System.out.printf("Account name: "+ba.accountName);
		        System.out.printf("Account number: "+ba.accountNumber);
		        System.out.printf("Account balance: %c%.2f%n ",ba.accountBalance);
		
		        ba.withdrawal(withdrawalAmount);
		        System.out.printf("your balance is %C%.2f%n",ba,checkbalance);
				System.out.println();
			}
			break;
			
			case 2:
			{
				System.out.print("Enter your choice");
		        int choice = input.nextInt();
				
				System.out.print("enter amount to deposite");
				System.out.printf("Account name: ",+ba.accountName);
		        System.out.printf("Account number: ",+ba.accountNumber);
		        System.out.printf("Account balance %c%.2f%n ",ba.accountBalance);
				
				ba.deposit(depositAmount);
				System.out.printf("Your balance is %c%f%n",'$',ba.checkbalance());
				System.out.println();
		
			}
			break;
			default:
			
			System.out.println("invalid input");
		}
	}
	public double withdrawal(int amount){
		accountBalance -= amount;
		
		return accountBalance;
	}
	public double deposit(int amount){
		accountBalance += amount;
		
		return accountBalance;
		
	}
}