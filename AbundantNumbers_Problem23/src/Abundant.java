import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Abundant {

	public static void main(String[] args){
		long totalSum=0;
		Set<Integer> abundantNumbers = new HashSet<Integer>();
		Set<Integer> sumOfAbundantNumbers = new HashSet<Integer>();
		for(int i=2;i<28124;i++){
			int sum =0;
			for(int j=1;j<i;j++){
				
				if(i%j==0)
					sum += j ;
			}
			
			if(sum > i){
				abundantNumbers.add(i);
			}
		}
		System.out.println("here");
		
		Iterator<Integer> z = abundantNumbers.iterator();
		while (z.hasNext()) {		
			int n = z.next();
			Iterator<Integer> x = abundantNumbers.iterator();
			while (x.hasNext()) {	
				int m = n+x.next();
				if(m<28124)
					sumOfAbundantNumbers.add(m);				
			}
		}
		
		
		
 		for(int i=1;i<28124;i++){
			if(sumOfAbundantNumbers.contains(i)){				
				continue;
			}
			else{
				totalSum += i;
			}
				
		}
		
		System.out.println(totalSum);
			
	}
}
