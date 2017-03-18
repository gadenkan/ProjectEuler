import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class PrimeDigitReplacement {
	static List<Long> primes = new ArrayList<>();
	static int x = 1000000;
	static Map<String, List> mapper = new HashMap<>();

	public static void main(String[] args){
		getPrimes(x);
		//System.out.println(primes);
		for(int i=0; i<primes.size(); i++){
			String s = String.valueOf(primes.get(i));
			patternMatch(s);
		}

		Iterator<Entry<String,List>> iterator = mapper.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String,List> entry = (Map.Entry<String,List>) iterator.next();
			if(entry.getValue().size() == 8)
				System.out.println("Key : " + entry.getKey() + " Value :" + entry.getValue());
		}

	}

	public static void getPrimes(int n){

		for(int i=99999; i<=1000000; i++){
			boolean isPrime = true;
			for(int j=2; j<= Math.sqrt(i); j++){
				if(i % j == 0){
					isPrime = false;
					break;
				}
			}
			if(isPrime){
				primes.add(new Long(i));
			}
		}
	}

	public static void patternMatch(String str){

		List<String> pattern = getPattern(str);
		if(pattern.size() > 0){

			for(int i=0 ; i<pattern.size(); i++){
				//System.out.println("Pattern "+pattern);
				if(mapper.containsKey(pattern.get(i))){
					List<String> list = mapper.get(pattern.get(i));
					list.add(str);
					mapper.put(pattern.get(i), list);
				}else{
					List<String> list = new ArrayList<>();
					list.add(str);
					mapper.put(pattern.get(i), list);
				}
			}
		}
	}

	public static List<String> getPattern(String str){
		//System.out.println(str.lastIndexOf(str.charAt(0)));

		Map<Character, Integer> numMap = new HashMap<>();
		for(int i = 0; i<str.length(); i++){
			if(numMap.containsKey(str.charAt(i))){
				int x = numMap.get(str.charAt(i));
				numMap.put(str.charAt(i), x+1);
			}else{
				numMap.put(str.charAt(i), 1);
			}
		}
		
		List<String> list = new ArrayList<>();
		Iterator<Entry<Character,Integer>> iterator = numMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Character,Integer> entry = (Map.Entry<Character,Integer>) iterator.next();
				if(entry.getValue() == 3){
					String s = str.replaceAll(""+entry.getKey(), "x");
					list.add(s);
				}
				if(entry.getValue() == 4){
					int[] index = new int[4];
					index[0] = str.indexOf(entry.getKey());
					index[1] = str.indexOf(entry.getKey(), index[0]+1);
					index[2] = str.indexOf(entry.getKey(), index[1]+1);
					index[3] = str.indexOf(entry.getKey(), index[2]+1);
					StringBuilder s = new StringBuilder(str.replaceAll(""+entry.getKey(), "x"));
					for(int i=0; i<4; i++){
						s.setCharAt(index[i], str.charAt(index[i]));
						list.add(s.toString());
						s.setCharAt(index[i], 'x');
					}
				}
				if(entry.getValue() == 5){
					//System.out.println("**************** "+str);
					int[] index = new int[5];
					index[0] = str.indexOf(entry.getKey());
					index[1] = str.indexOf(entry.getKey(), index[0]+1);
					index[2] = str.indexOf(entry.getKey(), index[1]+1);
					index[3] = str.indexOf(entry.getKey(), index[2]+1);
					index[4] = str.indexOf(entry.getKey(), index[3]+1);
					StringBuilder s = new StringBuilder(str.replaceAll(""+entry.getKey(), "x"));
					for(int i=0; i<4; i++){
						for(int j=i+1; j<5; j++){
							s.setCharAt(index[i], str.charAt(index[i]));
							s.setCharAt(index[j], str.charAt(index[j]));
							list.add(s.toString());
							s.setCharAt(index[i], 'x');
							s.setCharAt(index[j], 'x');
						}

					}
				}
		}
		return list;
	}
}
