public class LogicalOperators{
	public static void main(String[] args){
		int x = 50;
		int y = 25;
		int z = 15;

		//Assigment operators
		 x+=5;
		 System.out.println(x);
		 
		 x*=5;
		 System.out.println(x);
		 
		 x-=5;
		 System.out.println(x);
		 
		 x/=5;
		 System.out.println(x);
		 
		 x%=5;
		 System.out.println(x);
		
	}
}
		//Arithetric operators
		int addition = x + y;
		System.out.println(addition);
		
		int multiplication = x * y;
		System.out.println(multiplication);
		
		int subtraction = x - y;
		System.out.println(subtraction);
		
		int division = x/y;
		System.out.println(division);
		
		int modulus = x % y;
		System.out.println(modulus);
		
        //logical operators
		boolean result1 = (x > y)&&(x <= z);
		System.out.println(result1);
		
		boolean result2 = (x > y)||(x <= z);
		System.out.println(result2);
		
		boolean result3 = !((x > y)&&(x <= z));
		System.out.println(result3);
	}
}