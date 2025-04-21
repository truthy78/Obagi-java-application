public class MuiltDimensionalArray{
	public static void main (String[] args){
		
		int[][]numbers ={
			           {31,15,20,16},
					   {45,12,34,35},	 
					   {18,17,54,28}
		               };
			int sum =0;		   
			for(int row = 0; row < 3; row++){
				for(int col = 0; col < 4; col++){
					
					sum += numbers[row][col];
						
				}
			}		   
       		   
				 System.out.printf("The sum of all the numbers is %d%n",sum);   
				 System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
				 int Secondsum =0;	
				 for (int[] rows : numbers){
					for(int num :rows){
						Secondsum += num;
						
					}
				 }
				  System.out.printf("The sum of all the numbers is %d%n",Secondsum);   
		
	}
}