public class StaticMethodWithoutReturnType{
	public static void main(String[] args){
		StaticMethodWithoutReturnType.addition();
		
	}
	public static void addition(){
		int num1 = 15;
		int num2 = 20;
		
		int sum = num1 + num2;
		System.out.printf("The sum is %d%n",sum);
	}
}