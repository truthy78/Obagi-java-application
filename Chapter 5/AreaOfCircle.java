import java.util.Scanner;
public class AreaOfCircle{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		double radius = input.nextDouble();
		
		double inp = Math.pow(radius,2);
		
		double area = 3.14 * inp;	
        
        System.out.printf("The area is %.3f",area);
		
	}
	
}