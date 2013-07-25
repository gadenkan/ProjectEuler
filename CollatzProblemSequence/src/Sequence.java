import java.util.LinkedHashMap;
import java.util.Map;

public class Sequence {

	public static void main(String[] args){

		long number = 0;		
		int largestCount = 0;
		int largestNumber =0;
		long maxNumber = 1000000L;
		int count = 0;
		Map<Long,Integer> map = new LinkedHashMap<Long, Integer>();

		for(long i=2;i<=maxNumber;i++){
			number = i;
			count = 1;			

			while(number!= 1){
				if (number <= maxNumber && map.containsKey(number)) {
					count += map.get(number) - 1; 
					number = 1;					
				} 
				else{
					if(number%2==0)
						number = number/2;
					else
						number = 3*number+1;
					count++;
				}
			}
			if(count>largestCount){
				largestCount = count;
				largestNumber = (int) i;
			}
			map.put(i, count); 			
		}
		
		System.out.println("No of numbers in chain: "+largestCount);
		System.out.println("Starting number to produce this chain: "+largestNumber);
	}
}
