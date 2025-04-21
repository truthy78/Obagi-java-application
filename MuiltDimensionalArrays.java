public class MuiltDimensionalArrays{
	public static void main (String[] args){
		
		int[][]ages ={
			           {31,15,20,16},
					   {45,12,34,35},	 
		               {18,17,54,28}
					   };

	                   	
              
					    int sumOfEven =0;
                        int countOfOdd =0;						
		            	for(int row = 0; row < 3; row++){
							for(int col = 0; col < 4; col++){
							if (ages [row][col] %2==0){
								
					            sumOfEven += ages[row][col];
								
							}
					        else{
								countOfOdd++;
							}
							
							
					    }   	
					
				}	
				
                     System.out.printf("The sum of all the numbers is %d%n",sumOfEven);   				
	                  System.out.printf("The count of all the numbers is %d%n",countOfOdd);   				
	}
}
					   