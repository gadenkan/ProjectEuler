import java.util.HashSet;
import java.util.Set;

public class SubstringDivisibility{
	static long sum = 0;
	public static void main(String[] args){
		String str = "0123456789";
		generateAnagramsAndCalculateSum(str);
		System.out.println(sum);
	}

	public static void generateAnagramsAndCalculateSum(String str){
		anagram("", str);
	}

	public static void divisibility(String str){
		if(str.charAt(5) != '5' && str.charAt(5) != '0'){
			return;
		}
		if(Integer.parseInt(str.substring(1,4)) % 2 !=0 ){
			return;
		}
		if(Integer.parseInt(str.substring(2,5)) % 3 !=0 ){
			return;
		}
		if(Integer.parseInt(str.substring(4,7)) % 7 !=0 ){
			return;
		}
		if(Integer.parseInt(str.substring(5,8))% 11 !=0 ){
			return;
		}
		if(Integer.parseInt(str.substring(6,9))% 13 !=0 ){
			return;
		}
		if(Integer.parseInt(str.substring(7,10))% 17 !=0 ){
			return;
		}
		System.out.println(str);
		sum = sum + Long.parseLong(str);
	}

	public static void anagram(String left, String right) {
		int n = right.length();
		if (n == 0){
			divisibility(left);
		}
		else {
			for (int i = 0; i < n; i++){
				anagram(left + right.charAt(i), right.substring(0, i) + right.substring(i+1, n));
			}
		}
	}
}