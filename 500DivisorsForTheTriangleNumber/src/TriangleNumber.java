// What is the value of the first triangle number to have over five hundred divisors?
public class TriangleNumber {

	public static void main(String[] args) {

		int divisorLimit = 500;
		int numberOfDivisors = 0;
		int triangleNumber = 1 ;
		int count = 1;
		while(numberOfDivisors < divisorLimit){
			numberOfDivisors = 1;
			for(int i=2;i<=Math.sqrt(triangleNumber);i++){
				if(triangleNumber%i==0)
					numberOfDivisors++;
			}
			if(numberOfDivisors==1)
				numberOfDivisors = 2;
			else
				numberOfDivisors *= 2;
			
			if(Math.sqrt(triangleNumber) * Math.sqrt(triangleNumber) == triangleNumber)
				numberOfDivisors--;
			
			if(numberOfDivisors < divisorLimit){
				count++;
				triangleNumber += count;				
				//System.out.println(count+"  "+triangleNumber);
			}
			else
				break;
		}
		System.out.println(triangleNumber);
		System.out.println(numberOfDivisors);
		
	}

}
