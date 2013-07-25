//There exists exactly one Pythagorean triplet for which a + b + c = 1000.Find the product abc.

public class TripletSum1000 {

	public static void main(String[] args) {
		
		for(int i=600;i>=250;i--){
			for(int j=i;j>=200;j--){
				for(int k=j;k>=200;k--){
					if(i+j+k == 1000){
						if((i*i == (j*j) + (k*k)) || (j*j == (i*i) + (k*k))    ||(k*k == (j*j) + (i*i)) ){
							System.out.println(i+" "+j+" "+k);
							System.out.println(i*j*k);
							System.exit(0);
						}
					}
						
				}
			}
		}

	}

}
