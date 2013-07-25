
public class Diff {
	
	public static void main(String[] args){
		
		int sumOfSquare =0 ;
		int squareOfSum=0;
		
		int sum=0;
		
		for(int i=1;i<=100;i++){
			
			sum=sum+i;
			sumOfSquare = sumOfSquare + (i*i);
		}
		
		squareOfSum = sum*sum;
		
		int diff = squareOfSum - sumOfSquare;
		System.out.println(diff);
	}

}
