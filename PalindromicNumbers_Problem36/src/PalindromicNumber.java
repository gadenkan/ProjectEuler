
public class PalindromicNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		long totalSum = 0;
		for(Integer i =1 ; i<1000000;i++){
			
			if(isPalindrome(i) && isBinaryPalindrome(Integer.toBinaryString(i))){
				totalSum += i;
			}
		}
		System.out.println(totalSum);
	}

	private static boolean isBinaryPalindrome(String binaryString) {
		
		String reverse = "";
		String numberString = binaryString;
		for(int i=(numberString.length())-1;i>=0;i--){
			reverse = reverse + numberString.charAt(i);
		}
		
		if(reverse.equals(numberString))
			return true;
		else{
			return false;
		}
		
		
	}

	private static boolean isPalindrome(Integer i) {
		String numberString = i.toString();
		String reverse = "";
		
		for(int x=(numberString.length())-1;x>=0;x--){
			reverse = reverse + numberString.charAt(x);
		}
		
		if(reverse.equals(numberString))
			return true;
		else{
			return false;
		}
	}

}
