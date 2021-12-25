package week1.day1.assignment1;

public class Factorial {

	public static void main(String[] args) {
		int fact=1;
		for (int i = 5; i >=1 ; i--) {
			fact = i*fact;
		}
		System.out.println(fact);
		//learnings : Declaring variables,for loop,operators
	}
}
