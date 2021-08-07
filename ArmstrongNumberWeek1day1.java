package assignments;

public class ArmstrongNumberWeek1day1 {
	public static void main(String[] args) {
		int input = 153;
		int original = 153;
		int quotient = 1;
		int remainder = 0;
		int calcOutput = 0;
		
		while (quotient !=0 ) {
			quotient = input/10;
			remainder = input%10;
			input = quotient;
			calcOutput = calcOutput + (remainder*remainder*remainder);
		
		}
		
		if (original == calcOutput) {
			System.out.println(original + " is an Armstrong number");
			
		} else
			System.out.println(original + " is not an Armstrong number");
	}

}
