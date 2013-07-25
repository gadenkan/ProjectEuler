// What is the 10001st prime number?


public class PrimeNumber10001st {
	
	public static void main(String[] args){
		
		long primeCount=1;
		long number = 3;
		boolean bolPrime = false;
		
		while(primeCount!=10001){
			
			bolPrime = new PrimeNumber10001st().isPrime(number);
			if(bolPrime)
				primeCount++;
			number = number+2;
		}
		
		System.out.println(number-2);
		
	}
	
	public boolean isPrime(long x){
		
		for(int i=2;i<=Math.sqrt(x);i++){
			if(x%i==0)
				return false;
		}		
		return true;
	}

}
