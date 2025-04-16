import java.util.Scanner;
public class Hypotenuse{ 
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of the adjacent: ");
		double adj = input.nextDouble();
		System.out.print("Enter the length of the opposite : ");
		double opp = input.nextDouble();
		
	
	    double num = Math.pow(adj,2);
		double num2 = Math.pow(opp,2);
		
		double hyp = num + num2;
		double result = Math.sqrt(hyp);
		
		System.out.printf("The length of the hypotenuse is %.0f%n",result);
		
	}
	
	
}