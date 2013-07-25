import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PandigitalProduct_problem32 {

	private static List<String> digits = new ArrayList<String>();

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			digits.add(String.valueOf(i));
		}
		long sum = 0;
		for(int i=3124;i<=9876;i++){
			
			if(allUnique(i)){
				int x = i%10;
				if(x!=5 && x!=9 && x!=0){
					for(int j=2;j<80;j++){
						if(i%j==0){
							if(isPandigital(j, (i/j), i)){
								sum = sum + i;
								System.out.println(j+"*"+(i/j)+"="+i);
								break;
							}
						}
					}
				}
			}
		}
		System.out.println(sum);
	}

	static boolean isPandigital(int a, int b, int c) {
		String s = String.valueOf(a) + String.valueOf(b) + String.valueOf(c);
		//System.out.println(s);
		Set<Character> set = new HashSet<Character>();
		for(int i=0;i<s.length();i++){
			Character x = s.charAt(i);
			if(x=='0')
				return false;
			set.add(x);
		}
		if(set.size() != 9){
			return false;
		}
		return true;
	}
	
	static boolean allUnique(int x){
		String s = String.valueOf(x);
		Set<Character> set = new HashSet<Character>();
		for(int i=0;i<s.length();i++){
			Character c = s.charAt(i);
			set.add(c);
		}
		if(set.size() != 4){
			return false;
		}
		return true;
	}
}
