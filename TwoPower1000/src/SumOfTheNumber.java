// Sometimes using the language is more important than finding a mathematical solution


public class SumOfTheNumber {


	public static void main(String[] args) {
		
		int number = 1000;
		System.out.println("Number of digits in 2 to the power "+number+" is: "+((3*number/10)+1));
		
		long sum = 0; 
		for (char c : java.math.BigInteger.valueOf(2).pow(number).toString().toCharArray()) { 
		    sum += c - 48; 
		} 
		System.out.println("Sum of the digits is: "+sum);
		System.out.println(java.math.BigInteger.valueOf(2).pow(number).toString());

	}

}
