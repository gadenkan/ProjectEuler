import java.math.BigInteger;


public class Sum {

	public static void main(String[] args){
		long sum =0;
		BigInteger product = new BigInteger("1");
		BigInteger number = new BigInteger("100");


		while(number.intValue() >1){
		
			product = product.multiply(number);
			number = number.subtract(new BigInteger("1"));
		}

		System.out.println("100! = "+product);
		
		for(char i: product.toString().toCharArray()){
			sum = sum + (i-48);
		}
		System.out.println("Sum of digits in 100! = "+sum);

	}
}
