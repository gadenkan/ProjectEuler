import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.LinkedHashMap;


public class DistinctPrimeFactors {
	static List<Integer> primes;
	public static void main(String[] args){
		primes = new ArrayList<>();
		primes.add(2);
		int index = 644;
		int count = 0;
		while (count != 4){
			updatePrimes(index);
			Map map = getPrimeFactors(index, new LinkedHashMap<>());
			if(map.size() == 4){
				count++;
			}else{
				if(count > 0){
					count = 0;
				}
			}
			index++;
		}
		System.out.println(index-4);
	}

	public static void updatePrimes(int x){
		int a = primes.get(primes.size() - 1);
		for(int i = a+1; i <= x; i++){
			if(isPrime(i)){
				primes.add(i);
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

	public static Map getPrimeFactors(int x, Map<Integer, Integer> map){
		for(int i=0; i<primes.size(); i++){
			if(x % primes.get(i) == 0){
				if(map.containsKey(primes.get(i))){
					map.put(primes.get(i), map.get(primes.get(i)) + 1);
				}else{
					map.put(primes.get(i), 1);
				}
				getPrimeFactors(x/(primes.get(i)), map);
				break;
			}
		}
		return map;
	}
}