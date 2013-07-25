import java.math.BigInteger;


public class LychrelNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numberOfLychrels = 0;
		
		for(int i=1;i<10000;i++){
			
			BigInteger sum=new BigInteger(String.valueOf(i));
			boolean isLychrel = true;
			for(int j=0;j<=50;j++){
				BigInteger rev = reverse(sum);
				sum = sum.add(rev);								
				if(sum.equals(reverse(sum))){
					isLychrel = false;
					break;
				}							
			}
			if(isLychrel){
				numberOfLychrels++;
				System.out.println(i);
			}
				
		}
		System.out.println(numberOfLychrels);
	}
	
	private static BigInteger reverse(BigInteger x){
		String s = String.valueOf(x);
		String ret = "";
		for(int i=s.length()-1;i>=0;i--){
			ret = ret+s.charAt(i);
		}
		return new BigInteger(ret);
	}

	/*private static boolean isPalindrome(int sum) {

		String s= String.valueOf(sum);
		int length = s.length();
		for(int i=0;i<length/2;i++){
			if(s.charAt(i)!=s.charAt(length-1 - i)){
				return false;
			}			
		}
		return true;
	}*/

}
