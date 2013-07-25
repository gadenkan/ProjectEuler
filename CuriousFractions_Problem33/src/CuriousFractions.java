
public class CuriousFractions {

	public static void main(String[] args) {
		
		int[][] result = new int[4][2];
		int a=0;
		
		for(double i=11;i<99;i++){
			String numI = String.valueOf(i);
			if(i%10 == 0)
				continue;
			for(double j=i+1;j<100;j++){
				if(j%10 == 0)
					continue;
				String numJ = String.valueOf(j);
				
				if(numI.charAt(0) == numJ.charAt(0)){
					double x = numI.charAt(1) - 48;
					double y = numJ.charAt(1) - 48;
					if(x/y == i/j){
						result[a][0] = (int) i;
						result[a++][1] = (int) j;
					}
				}
				
				if(numI.charAt(0) == numJ.charAt(1)){
					double x = numI.charAt(1) - 48;
					double y = numJ.charAt(0) - 48;
					if(x/y == i/j){
						result[a][0] = (int) i;
						result[a++][1] = (int) j;
					}
				}
				
				if(numI.charAt(1) == numJ.charAt(0)){
					double x = numI.charAt(0) - 48;
					double y = numJ.charAt(1) - 48;
					if(x/y == i/j){
						result[a][0] = (int) i;
						result[a++][1] = (int) j;
					}
				}
				
				if(numI.charAt(1) == numJ.charAt(1)){
					double x = numI.charAt(0) - 48;
					double y = numJ.charAt(0) - 48;
					if(x/y == i/j){
						result[a][0] = (int) i;
						result[a++][1] = (int) j;
					}
				}
					
			}
		}
		
		
		long numerator = 1;
		long denominator = 1;
		for(int i=0;i<result.length;i++){
			System.out.println(result[i][0] +"  "+ result[i][1]);
			numerator *= result[i][0];
			denominator *= result[i][1];			
		}
		
		
		System.out.println(numerator + "  "+ denominator);
		
		int limit = (int) (numerator/2);
		for(int i=2;i<= limit;i++){
			
			if(numerator % i ==0 && denominator % i ==0){
				numerator /= i;
				denominator /= i;
				i--;
			}				
		}
		System.out.println(numerator + "  "+ denominator);
		
	}

}
