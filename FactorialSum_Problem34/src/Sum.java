
public class Sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		long totalSum = 0;
		for(int i=10 ; i<1000000; i++){
			int sum = 0;
			String s = String.valueOf(i);
			for(int j=0;j<s.length();j++){
				if(s.charAt(j) == '0')
					sum += 1;
				else if(s.charAt(j) == '1')
					sum += 1;
				else if(s.charAt(j) == '2')
					sum += 2;
				else if(s.charAt(j) == '3')
					sum += 6;
				else if(s.charAt(j) == '4')
					sum += 24;
				else if(s.charAt(j) == '5')
					sum += 120;
				else if(s.charAt(j) == '6')
					sum += 720;
				else if(s.charAt(j) == '7')
					sum += 5040;
				else if(s.charAt(j) == '8')
					sum += 40320;
				else if(s.charAt(j) == '9')
					sum += 362880;				
			}
			
			if(sum == i){
				totalSum += i;
				System.out.println(i);
			}
				
			
		}
		
		System.out.println(totalSum);
	}

}
