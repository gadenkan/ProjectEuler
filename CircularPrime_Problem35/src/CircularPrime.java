
public class CircularPrime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int finalCount = 0;
		for(int i =2 ; i<1000000;i++){
			
			if (!isPrime(i))
				continue;
			
			String number = String.valueOf(i);
			int count = 1;
			char[] c = number.toCharArray();
			boolean flag = false;
			
			
			while(count<number.length()){
				char temp = c[0];
				for(int j =0;j<(c.length)-1;j++){
					c[j] = c[j+1];
				}
				c[c.length-1] = temp;
				
				String s  = new String(c);
				
				int m = Integer.parseInt(s);				
				if(!isPrime(m)){
					flag = false;
					break;
				}
				else
					flag = true;
				count++;
			}
			
			if(!flag && i>9)
				continue;	
			
			finalCount++;
			System.out.println(i);
		}
		
		System.out.println(finalCount);
	}

	private static boolean isPrime(int i) {
		
		for(int x=2;x<=Math.sqrt(i);x++){
			if(i%x==0)
				return false;
		}
		return true;
	}

}
