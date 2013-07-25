import java.util.ArrayList;
import java.util.List;


public class PrimeFactor {

	public static void main(String[] args){
		
		long primeNumber = 600851475143L;
		long highestPrimeFactor = 1;
	
		List<Long> factorsArray = new ArrayList<Long>();
		long temp = primeNumber;
		
		
		// separating out factors of two to increment "number" by 2 in the next while loop
		while (temp%2 == 0){
			temp = temp / 2;
			factorsArray.add(2l);
		}
		
		
		long number = 3;
		// If there are no factors till "sqrt of temp" then temp is a prime
		long maxFactor = (long) Math.sqrt(temp);
		
		while(temp!=1 && number<= maxFactor){
			
			if(temp%number == 0){
				temp = temp/number;
				factorsArray.add(number);
				maxFactor = (long) Math.sqrt(temp);
			}
			else{
				number =  number + 2 ;
			}			
		}
		
		if(temp!=1){
			// since temp is a prime, adding it to list of factors
			factorsArray.add((long) temp);
		}
		
		
		
		highestPrimeFactor = factorsArray.get(factorsArray.size() - 1);		
		System.out.println(highestPrimeFactor);
	}
}
