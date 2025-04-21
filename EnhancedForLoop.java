public class EnhancedForLoop{
	public static void main (String [] args){
		int[] numbers = {9,3,5,4,3};
		
		String names = {"John","Mark","Precious","Nelly","Patience"};
		
		for (int i = 0; i < 5; i++){
			System.out.printf("%d%n",numbers[i]);
		}
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		for (int num : numbers){
			System.out.printf("%d%n",num);
		}
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		for (String names: names){
			System.out.printf("%s%n",name);
		
	}
	
}