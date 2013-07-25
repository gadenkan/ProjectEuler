import java.util.ArrayList;
import java.util.List;


public class TriPentaHexa {

	public static void main(String[] args){
		
		int number = 2;
		List<Long> listT = new ArrayList<Long>();
		List<Long> listP = new ArrayList<Long>();
		List<Long> listH = new ArrayList<Long>();
		boolean flag = true;
		while(flag){
			long triangleNumber = 0;
			long pentagonalNumber = 0;
			long hexagonalNumber = 0;
			
			if(number%2==0){
				triangleNumber = (number/2)*(number+1);
				pentagonalNumber = (number/2)*((3*number)-1);
			}
			else{
				triangleNumber = number*((number+1)/2);
				pentagonalNumber = (number*(((3*number)-1)/2));
			}

			hexagonalNumber = number*((2*number)-1);
			
			listT.add(triangleNumber);
			listP.add(pentagonalNumber);
			listH.add(hexagonalNumber);
				
			if(listP.contains(triangleNumber) && listH.contains(triangleNumber)){
				System.out.println(triangleNumber);
				if(number>285)
					flag = false;				
			}
			
			number++;
		
		}
	}
}
