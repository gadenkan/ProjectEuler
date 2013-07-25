import java.util.ArrayList;
import java.util.List;


public class TruncatePrime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//List<Integer> primes = new TruncatePrime().runEratosthenesSieve_01(1000000);
		List<Integer> primes = new TruncatePrime().getPrimes(1000000);
		List<Character> even = new ArrayList<Character>();
		even.add('0');
		even.add('2');
		even.add('4');
		even.add('6');
		even.add('8');
		even.add('5');
		int total = 0;

		for(int i=4; i<primes.size();i++){
			String primeNumber = primes.get(i).toString();
			
			
			String temp3 = primeNumber.substring(1,primeNumber.length());
			char[] c = temp3.toCharArray();
			boolean flagFirst = true;
			for(int x=0;x<c.length;x++){
				if(even.contains(c[x])){
					flagFirst = false;
					break;
				}
					
			}
			if(!flagFirst)
				continue;
			
			
			
			String temp = primeNumber.substring(0,primeNumber.length());
			String temp2 = primeNumber.substring(0,primeNumber.length());
			boolean flag = true;
			do{
				
				temp = temp.substring(1,temp.length());
				temp2 = temp2.substring(0,temp2.length()-1);
				
				if(!(primes.contains(Integer.parseInt(temp)) && primes.contains(Integer.parseInt(temp2)))){
					
					flag = false;
					break;
				}

			}while(temp.length() > 1);
			
			if(flag){
				System.out.println(primes.get(i));
				total += primes.get(i);
			}
		}
		
		System.out.println("total : "+total);

	}


	public List<Integer> runEratosthenesSieve_01(int upperBound) { 

		List<Integer> primes = new ArrayList<Integer>(); 
		int upperBoundSquareRoot = (int) Math.sqrt(upperBound); 
		boolean[] isComposite = new boolean[upperBound + 1]; 		

		for (int k = 2 * 2; k <= upperBound; k += 2) 
			isComposite[k] = true; 

		primes.add(2);
		for (int m = 3; m <= upperBoundSquareRoot; m=m+2) { 

			if (!isComposite[m]) { 
				primes.add(m);
				isComposite[m] = true;
				for (int k = m * m; k <= upperBound; k += 2*m) {
					isComposite[k] = true;
				}
			} 
		} 

		for (int m = upperBoundSquareRoot; m <= upperBound; m++) 
			if (!isComposite[m]) {
				primes.add(m);
			}

		return primes;
	}
	
	
	
	
	public List<Integer> getPrimes(int x){

		List<Integer> primeList = new ArrayList<Integer>();
		// generate Prime numbers till x
		
		
		primeList.add(2);
		primeList.add(3);
		for(int i=4;i<=x;i++){
			boolean isPrime = true;
			for(int j=2;j<=Math.sqrt(i);j++){
				if(i%j == 0){
					isPrime = false;
					break;					
				}					
			}
			
			if(isPrime)
				primeList.add(i);			
		}		
				
		return primeList;
	}
}
