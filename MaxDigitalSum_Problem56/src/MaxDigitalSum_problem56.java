import java.math.BigInteger;

public class MaxDigitalSum_problem56 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		long maxSum = 0;
		for(int i=99;i>1;i--){
			System.out.println(i);
			BigInteger a = new BigInteger(String.valueOf(i));
			for(int j=99;j>1;j--){
				long z = getSum(a.pow(j));
				if(z>maxSum){
					maxSum = z;
					System.out.println("i: "+i+". j: "+j+". sum= "+z);
				}
			}
		}
		System.out.println(maxSum);
	}
	
	static long getSum(BigInteger x){
		String s  = String.valueOf(x);
		long sum = 0;
		for(int i=0;i<s.length();i++){
			int j = Integer.parseInt(String.valueOf(s.charAt(i)));
			sum = sum+j;
		}
		return sum;
	}

}