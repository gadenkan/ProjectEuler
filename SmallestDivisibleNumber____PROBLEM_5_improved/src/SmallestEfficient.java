
public class SmallestEfficient {
	
	public static void main(String[] args){
		
		// What is the smallest number(N) divisible by each of the numbers 1 to k?
		int k=40; 
		long N=1; 
		int i=0;
		boolean check = true;
		int limit = (int) Math.sqrt(k);
		// array of prime numbers
		int[] p = {2,3,5,7,11,13,17,19,23,27,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97};
		// array of power of primes used in factorization
		int[] a = new int[p.length];
		while(p[i]<=k){
			a[i]=1;
			if(check){
				if(p[i]<=limit){
					a[i]=(int) Math.floor((Math.log(k)/Math.log(p[i])));
				}
				else{
					check = false;
				}
			}
			N = (long) (N * (Math.pow(p[i], a[i])));
			i++;			
		}
		
		System.out.println(N);
		
	}

}
