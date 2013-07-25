// What is the sum of both diagonals in a 1001 by 1001 spiral?
public class SpiralGrid {

	public static void main(String[] args){
		
		long sumOfDiagonals=0;
		for(int i=1;i<=1001;i++){
			
			if(i%2==0){
				sumOfDiagonals += ((i*i)+1)*3;
			}
			else
				sumOfDiagonals += i * i ;
		}
		
		System.out.println(sumOfDiagonals);
	}
}
