import java.until.Scanner;

public class NestedIfElse{
	public static void main(String[] args){
		Scanner.out.print("Enter name: ");
	    String name = input.nextLine();
	
	    System.out.print("Enter mark: ");
	    int mark = input.nextInt();
	
	    if (mark > 100){
			System.out.printIn("Mark can not be grester than 100%n")
	    }
	    else{

        if (mark>= 80){
			System.out.print("Candidate name: %s%n",name );
		    System.out.print("Candidate mark: %d%n",mark );
		    System.out.print("Candidate mark: %C%n",'A' );
	
        }	
	    else if (mark>= 70){
			System.out.print("Candidate name: %s%n",name );
		    System.out.print("Candidate mark: %d%n",mark );
		    System.out.print("Candidate mark: %C%n",'B' );
	
        }	
	    else if (mark>= 60){
			System.out.print("Candidate name: %s%n",name );
		    System.out.print("Candidate mark: %d%n",mark );
		    System.out.print("Candidate mark: %C%n",'C');
	
        }	
	    else if (mark>= 50){
			System.out.print("Candidate name: %s%n",name );
		    System.out.print("Candidate mark: %d%n",mark );
		    System.out.print("Candidate mark: %C%n",'D' );
	
        }	
	    else if (mark>= 40){
			System.out.print("Candidate name: %s",name ");
		    System.out.print("Candidate mark: %d,mark ");
		    System.out.print("Candidate mark: %C,'E' ");
	
        }	
	    else {
			System.out.print("Candidate name: %s",name ");
		    System.out.print("Candidate mark: %d,mark ");
		    System.out.print("Candidate mark: %C,'F' ");
	
             }
        }	
	
    }
}
