
public class Combinatorics {
	
	public static void main(String[] args){
		
		int result = 0;
		for(int i =23;i<=100;i++){
			for(int j=1;j<=i;j++){
				int count = 1;
				long numerator = i;				
				long denominator = Math.min(j, i-j);				
				long prodNum = 1;
				long prodDen = 1;
				
				while(count<=Math.min(j, i-j)){
					prodNum *= numerator--;
					prodDen *= denominator--;
					count++;					
				}
				
				System.out.println(prodNum+" "+prodDen);				
				if(prodNum/prodDen > 1000000){
					int x = i - (2*j) + 1;
					result += x;
					break;
				}
			}
		}		
		System.out.println(result);
	}
}
