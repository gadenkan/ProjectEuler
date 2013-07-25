import java.math.BigInteger;


public class SumOfPowers {

	public static void main(String[] args){

		long sum = 0;
		for(Integer i=1 ; i<=1000; i++){
			BigInteger b = new BigInteger(i.toString());
			BigInteger bTemp = new BigInteger(i.toString());
			for(int j=0 ; j<i-1; j++){
				b = b.multiply(bTemp);				
			}
			String s = b.toString();
			int length = s.length();
			String s2 = "";
			if(length >=12)
				s2 = s.substring(length-11, length);
			else
				s2 = s;
			
			sum  = sum + Long.parseLong(s2);						
		}
		
		System.out.println(sum);
	}

}
