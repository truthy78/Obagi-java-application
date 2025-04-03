import java.until.Scanner;

public class SwitchCase{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	
	    System.out.printIn("Enter *131# To subscribe Data");
	    System.out.printIn("Enter *310# To chaeck balance");
	    System.out.printIn("Enter *606# To borrow data");
	    System.out.printIn("");
	
	    System.out.print("Enter code: ");
	    String code = input.nextLine();
	
	    switch(code){
			case" *131#":
		    {
				System.out.printIn("Enter 1 for 1 month subscription");
	            System.out.printIn("Enter 2 for 2 months subscription");
	            System.out.printIn("Enter 3 for 3 months subscription");
			    System.out.printIn("Enter 4 for 4 months subscription");
			    System.out.printIn("");
			
			    System.out.print("Enter code: ");
			    int option = input.nextInt();
			
			    switch(option){
					case 1:
					{
						System.out.printIn("Your 1 month subscription has been activated")
				    }
				    break;
				
				    case 2:
				    {
						System.out.printIn("Your 2 month subscription has been activated")
				    }
				    break;
				
				    case 3:
				    {
						System.out.printIn("Your 3 month subscription has been activated")
				    }
				    break;
				
				    case 4:
				    {
						System.out.printIn("Your 4 month subscription has been activated")
				    }
				    break;
				
				   default:
				   System.option.printIn("invalid input")
				
			    }	
		    }
            break;

		    case"*131#":
		    {
				System.out.printIn("Your balance is : N764.89")
		    }
		    break;
		
		    case"*606#":
		    {
				System.out.printIn("Enter 1 To borrow 1000");
	            System.out.printIn("Enter 2 To borrow 2000");
	            System.out.printIn("Enter 3 To borrow 3000");
			    System.out.printIn("Enter 4 To borrow 4000");
			    System.out.printIn("");
			
			    System.out.print("Enter code: ");
			     int option = input.nextInt();
			     switch(option){
					case 1:
				    {
						System.out.printIn("You have borrowed 1000")
				    }
				    break;
				
				    case 2:
				    {
						System.out.printIn("You have borrowed 2000")
				    }
				    break;
				
				    case 3:
				    {
						System.out.printIn("You have borrowed 3000")
				    }
				    break;
				
				    case 4:
				    {
						System.out.printIn("You have borrowed 4000")
				    }
				    break;
					
					default:
					System.out.printIn("Invalid input")
				 }
			}	
			break;
		}
	}
}