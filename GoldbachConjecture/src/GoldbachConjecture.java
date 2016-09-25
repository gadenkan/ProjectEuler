import java.util.ArrayList;
import java.util.List;

public class GoldbachConjecture{

	public static void main(String[] args){

		boolean found = false;
		long x = 3;
		List<Long> primes = new ArrayList<>();

		while(!found){
			if(isPrime(x)){
				primes.add(x);
				//System.out.println(x + " is prime");
				x = x + 2;
				continue;
			}

			found = true;
			for(int i = 0; i < primes.size(); i++){
				double temp = (double)x - (double)primes.get(i);
				temp = temp / (double) 2;
				double sqrt = Math.sqrt(temp);
				//System.out.println("Sqrt "+sqrt);
				if(sqrt == (long) sqrt){
					found = false;
					x = x + 2;
					break;
				}
			}
		}
		System.out.println(x);
	}

	private static boolean isPrime(long i) {
		
		for(int x=2;x<=Math.sqrt(i);x++){
			if(i%x==0)
				return false;
		}
		return true;
	}	
}