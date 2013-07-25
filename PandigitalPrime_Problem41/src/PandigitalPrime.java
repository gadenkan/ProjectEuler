import java.util.ArrayList;
import java.util.List;

/*We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n exactly once. For example, 2143 is a 4-digit pandigital and is also prime.

What is the largest n-digit pandigital prime that exists?
 */

public class PandigitalPrime {

	private static List<String> digits = new ArrayList<String>();
	private static int[] arr = new int[10];
	
	public static void main(String[] args) {

		for (int i = 1; i < 10; i++) {
			digits.add(String.valueOf(i));
		}
		System.out.println(digits);
	
		//Note: Nine numbers cannot be there (1+2+3+4+5+6+7+8+9=45 => always dividable by 3) 
		//Note: Eight numbers cannot be there (1+2+3+4+5+6+7+8=36 => always dividable by 3) 
	
		for (int i = 7654321; i > 1000 ; i=i-2) {
			if(i%3 == 0 || i%5==0 || i%7 == 0 || i%11==0){
				continue;
			}
			if(String.valueOf(i).length() != digits.size()){
				System.out.println(i);
				digits.remove(digits.size()-1);	
			}
			if(isPandigital(i)){
				
				if (isPrime(i)) { 
					System.out.println("largest n-digitv Pandigital Prime: "+i);
					break;
				}
			}
		}
	}


	public static boolean isPrime(int x) {

		for (int i = 2; i <= Math.sqrt(x); i++) {
			if (x % i == 0)
				return false;
		}
		return true;
	}
	
	public static boolean isPandigital(int x){
		
		String s = String.valueOf(x);
		
		arr = new int[digits.size()+1];
		for(int i=0;i<s.length();i++){
			
			String a = String.valueOf(s.charAt(i));
			if(!digits.contains(a)){				
				return false;
			}else{
				//System.out.println(digits +" contain: "+a);
				arr[Integer.valueOf(a)] = arr[Integer.valueOf(a)] +1;
				//System.out.println("count of "+a+" is: "+arr[Integer.valueOf(a)]);
			}
		}
		
		for(int i=1;i<arr.length;i++){
			if(arr[i] != 1)
				return false;
		}
		System.out.println("Is pandigital: "+x);
		return true;
	}

}