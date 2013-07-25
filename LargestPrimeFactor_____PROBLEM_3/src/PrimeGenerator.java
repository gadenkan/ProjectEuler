import java.util.ArrayList;
import java.util.List;


public class PrimeGenerator {
	
	public int[] getPrimes(int x){

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
		
		int[] returnVal = new int[primeList.size()];
		for(int m=0;m<primeList.size();m++){
			returnVal[m] = primeList.get(m);
		}
		
		
		return returnVal;
	}

}
