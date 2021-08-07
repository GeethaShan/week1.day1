package assignments;

public class PrimeNumWeek1Day1 {
	public static void main(String[] args) {
		int input = 13;
		boolean flag = false;
		//Iterate from 2 to half of the input
		for (int i=2; i<=input/2; i++) {
			//Divide the input with each for loop variable and check the remainder
			if (input%i == 0) {
				//Set the flag a true and break
				flag = true;
				break;
			}
		}
		//Number is prime if flag is false else not a prime number
		if (flag == true) {
			System.out.println(input+" is not a prime number");
		}
		else 
			System.out.println(input+" is a prime number");
	}

}
