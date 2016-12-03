import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class PrimePermutations{
	
	static List<Integer> primeAnagrams;
	static boolean[] visited = new boolean[10001];
	public static void main(String[] args){

		boolean found = false;
		for(int i=1000; i<10000; i++){
			if(!visited[i] && isPrime(i)){
				visited[i] = true;
				primeAnagrams = new ArrayList<>();
				anagram("", String.valueOf(i));
				if(primeAnagrams.size() == 3){
					Collections.sort(primeAnagrams);
					if((primeAnagrams.get(1) - primeAnagrams.get(0) == 3330) &&
						(primeAnagrams.get(2) - primeAnagrams.get(1) == 3330)){
						found = true;
					}
				}
			}
			if(found){
				break;
			}
		}
		System.out.println(primeAnagrams);
	}

	public static void anagram(String left, String right) {
		int n = right.length();
		if (n == 0){
			int x = Integer.parseInt(left);
			
			if(!visited[x] && isPrime(x)){
				primeAnagrams.add(x);
			}
			visited[x] = true;
		}
		else {
			for (int i = 0; i < n; i++){
				anagram(left + right.charAt(i), right.substring(0, i) + right.substring(i+1, n));
			}
		}
	}

	public static boolean isPrime(int x){
		for(int i=2; i<=Math.sqrt(x); i++){
			if(x % i == 0){
				return false;
			}
		}
		return true;
	}
}