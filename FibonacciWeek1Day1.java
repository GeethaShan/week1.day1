package assignments;

public class FibonacciWeek1Day1 {
	public static void main(String[] args) {
		
		int firstNum = 0;
		int secNum = 1;
		int sum = 0;
		int range = 8;
		//Print first and second number of the series
		System.out.print(firstNum+","+secNum);
		//Iterate from 2 to less than range as already 
		//first 2 numbers of the series are printed
		for (int i=2; i<range; i++) {
			sum = firstNum + secNum;
			//Print next number of the series
			System.out.print(","+sum);
			//Assign 2nd number to 1st and sum to 2nd number
			firstNum = secNum;
			secNum = sum ;			
			
			
		}
	}

}
