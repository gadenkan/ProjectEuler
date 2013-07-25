//There exists exactly one Pythagorean triplet for which a + b + c = 1000.Find the product abc.

public class TripletSum1000_1 {

	public static void main(String[] args) {
		
		int number = 1000;
		
		for(int i=3;i<=(number-3)/3;i++){
			for(int j=i+1;j<=(number-i-1)/2;j++){
				int k = number-j-i;
					
						if(k*k == (j*j) + (i*i)) {
							System.out.println(i+" "+j+" "+k);
							System.out.println(i*j*k);
							System.exit(0);
						}
					
						
				
			}
		}

	}

}
