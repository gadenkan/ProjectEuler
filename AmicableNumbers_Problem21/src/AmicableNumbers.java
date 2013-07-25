import java.util.ArrayList;
import java.util.List;


public class AmicableNumbers {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<Integer>();
		int sumOfDivisors = 0;
		int sumOfDivisors2 = 0;
		int sumOfAmicableNumbers = 0;

		for(int i=1; i<=10000; i++)
			numbers.add(i);

		for(int i=1;i<=10000;i++){

			if(numbers.contains((Integer)i)){
				sumOfDivisors = 0;
				for(int j=1;j<=i/2;j++){
					if(i%j==0)
						sumOfDivisors += j; 
				}
				sumOfDivisors2 =0;
				for(int k=1;k<=sumOfDivisors/2;k++){
					if(sumOfDivisors%k==0)
						sumOfDivisors2 += k;
				}

				
				if(sumOfDivisors2 == i && sumOfDivisors != i){
					sumOfAmicableNumbers += sumOfDivisors+sumOfDivisors2;
					System.out.println(sumOfDivisors+"  "+sumOfDivisors2+"  "+i);
				}
				if(numbers.contains(i))
					numbers.remove((Integer)i);
				if(numbers.contains(sumOfDivisors)){
					numbers.remove((Integer)sumOfDivisors);
				}
			}
		}
		
		System.out.println(sumOfAmicableNumbers);
	}

}
