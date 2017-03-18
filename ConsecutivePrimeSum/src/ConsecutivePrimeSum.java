import java.util.List;
import java.util.ArrayList;

public class ConsecutivePrimeSum{
	static List<Long> primes = new ArrayList<>();
	static int x = 1000000;

	public static void main(String[] args){

		getPrimes(x);
		System.out.println(primes.get(primes.size() -1));
		//System.out.println(primes);
		largestConsecutivePrimeSum();
	}

	public static void largestConsecutivePrimeSum(){
		int size = primes.size();
		int gLargest=0;
		long gThePrime=0;
		
		for(int i=0; i<size; i++){
			long primeSum = 0;
			int largest = 0;
			long thePrime = 0;
			//System.out.print(i+" ");
			for(int j=i; j<size; j++){
				primeSum = primeSum + primes.get(j);
				if(primeSum > x){
					break;
				}
				if(isPrime(primeSum) && (j-i+1) > largest){
					largest = j-i+1;
					thePrime = primeSum;
					//System.out.println(thePrime);
				}
			}
			if(gLargest < largest){
				gLargest = largest;
				gThePrime = thePrime;
			}
		}
		System.out.println("Longest Sum contains "+gLargest+" numbers");
		System.out.println("Longest prime is "+gThePrime);
	}
	
	public static void getPrimes(int n){
		if(n >= 2){
			primes.add(2l);
		}

		for(int i=3; i<=n; i++){
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

	public static boolean isPrime(long n){
		for(int j=2; j<= Math.sqrt(n); j++){
			if(n % j == 0){
				return false;
			}
		}
		return true;
	}
}