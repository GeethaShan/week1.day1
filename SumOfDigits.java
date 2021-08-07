package assignments;

public class SumOfDigits {
	public static void main(String[] args) {
		int number=123;
		int quotient=1;
		int Remainder=0;
		
		while (quotient != 0) {
			quotient = number/10;
			Remainder = number%10 + Remainder;
			number = quotient;
			
		}
		System.out.println("Sum of the digits is "+ Remainder);
			
	}

}
