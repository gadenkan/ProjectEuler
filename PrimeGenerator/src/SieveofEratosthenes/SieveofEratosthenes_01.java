package SieveofEratosthenes;



public class SieveofEratosthenes_01 {

	public static void main(String[] args) {

		new SieveofEratosthenes_01().runEratosthenesSieve_01(98765432);
	
	}

	public void runEratosthenesSieve_01(int upperBound) { 

		int upperBoundSquareRoot = (int) Math.sqrt(upperBound); 
		boolean[] isComposite = new boolean[upperBound + 1]; 		
		
		for (int k = 2 * 2; k <= upperBound; k += 2) 
			isComposite[k] = true; 
		
		System.out.println("2 ");
		for (int m = 3; m <= upperBoundSquareRoot; m=m+2) { 

			if (!isComposite[m]) { 
				System.out.println(m + " "); 
				isComposite[m] = true;
				for (int k = m * m; k <= upperBound; k += 2*m) 
					isComposite[k] = true; 
			} 
		} 

		for (int m = upperBoundSquareRoot; m <= upperBound; m++) 
			if (!isComposite[m]) 
				System.out.println(m + " "); 
	}
	
	
	
	
	
	
	public void runEratosthenesSieve(int upperBound) { 

		int upperBoundSquareRoot = (int) Math.sqrt(upperBound); 
		boolean[] isComposite = new boolean[upperBound + 1]; 
		for (int m = 2; m <= upperBoundSquareRoot; m++) { 

			if (!isComposite[m]) { 
				System.out.print(m + " "); 
				for (int k = m * m; k <= upperBound; k += m) 
					isComposite[k] = true; 
			} 
		} 

		for (int m = upperBoundSquareRoot; m <= upperBound; m++) 
			if (!isComposite[m]) 
				System.out.print(m + " "); 
	}

	

}
