public class Qudratic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		int finalA = 0;
		int finalB = 0;
		int finalCount=0;
		for(int i=-999 ; i<1000;i++){
			int a = i;
			for(int j=-999;j<1000;j++){
				
				int b = j;
				
				int number;
				int count=0;
				for(int m=0;m<10000;m++){
					number = (m*m) + (m*a) + b;
					if(isPrime(number)){						
						count++;
					}		
					else{
						break;
					}					
				}
				if(count > finalCount){
					finalCount = count;
					finalA = a;
					finalB = b;
				}					
			}
		}
		
		System.out.println(finalA);
		System.out.println(finalB);
		System.out.println("count:"+finalCount);
	}

	private static boolean isPrime(int number) {

		
		for(int i=2;i<=Math.sqrt(Math.abs(number));i++){

			if(number%i == 0){
				
				return false;
			}
		}		
		return true;
	}

}
