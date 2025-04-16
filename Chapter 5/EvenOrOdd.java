import java.util.Scanner;
public class EvenOrOdd{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		
		if(num % 2 == 0){
			System.out.printf("%d is an even number",num); 
		} 
		else{
			System.out.printf("%d is an odd number",num);
		}
	}
}