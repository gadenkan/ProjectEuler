// EratosthenesSieve is most efficient for Prime Sum


public class PrimeSum {
	public static void main(String[] args){
		new PrimeSum().runEratosthenesSieve(2000000);
		
	}
	
	public void runEratosthenesSieve(int upperBound) { 

		long sum = 2;
		int upperBoundSquareRoot = (int) Math.sqrt(upperBound); 
		boolean[] isComposite = new boolean[upperBound + 1]; 
		
		for (int k = 2 * 2; k <= upperBound; k += 2) 
			isComposite[k] = true; 
		
		
		
		for (int m = 3; m <= upperBoundSquareRoot; m=m+2) { 

			if (!isComposite[m]) { 				
				sum = sum+m; 
				isComposite[m]=true;
				for (int k = m * m; k <= upperBound; k +=2*m) 
					isComposite[k] = true; 
			} 
		} 

		for (int m = upperBoundSquareRoot; m <= upperBound; m++) 
			if (!isComposite[m]) {				
				sum = sum+m; 
			}
		
		System.out.println("Sum of Primes upto "+upperBound+" is: "+ sum);
	}

}
