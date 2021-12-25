package week1.day1.assignment1;

public class FibonacciSeries {

	public static void main(String[] args) {
		
	    int num1 = 0;
	    int num2 = 1;
	    int sum;
	    System.out.println(num1);
	    System.out.println(num2);
	    for (int i = 2; i < 8;i++) {
	    	
	    	sum = num1+num2;
	    	 num1 = num2;
	    	System.out.println(sum);
	    	num2=sum;
			
		}
		//learnings :  for loop,operators,declaring variables,assigning values to variables
		
		
			
	}
	
}
