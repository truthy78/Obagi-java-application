import java.util.Scanner;


public class BankAccount{
	String accountName ="John Edward";
	String accountNumber ="4590468734";
	double accountBalance =94746.89;
	
	public static void main(String[] args){
		BankAccount ba = new BankAccount();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to UBA Bank");
		System.out.println("Enter 1 to withdrawal");
		System.out.println("Enter 2 to deposit");
		
		
		System.out.print("Enter your choice");
		int choice = input.nextInt();
	
		
		switch(choice){
			case 1:
			{
				System.out.print("Enter your choice");
		        int choice = input.nextInt();
				
				System.out.print("enter amount to withdrawal");
				System.out.printf("Account name is %s%n",ba.accountName);
		        System.out.printf("Account number is %s%n",ba.accountNumber);
		        System.out.printf("Account balance is %.2f%n",ba.accountBalance);
		
		        ba.withdrawal(5000);
		        System.out.printf("your balance is %.2f%n",ba.accountBalance);
			}
			break;
			
			case 2:
			{
				System.out.print("Enter your choice");
		        int choice = input.nextInt();
				
				System.out.print("enter amount to deposite");
				System.out.printf("Account name is %s%n",ba.accountName);
		        System.out.printf("Account number is %s%n",ba.accountNumber);
		        System.out.printf("Account balance is %.2f%n",ba.accountBalance);
		
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