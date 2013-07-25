import java.math.BigDecimal;
import java.math.BigInteger;


public class Fraction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int theNumber = 0;
		int lenCount = 0;
		BigDecimal number = new BigDecimal("0");
		for(int i=2;i<999;i++){
			int count = 0;
			int count1=0;
			try{
				
				int index1 = 0;
				int repetition = 0;
				int recur = 0;
				int index2= 0 ;
				
				number = new BigDecimal("1").divide(new BigDecimal(String.valueOf(i)));
				String s = String.valueOf(number);
				count = s.length() - 2;
				String s1 = s.substring(2,s.length());
				
				count1=0;
				for(int a=1;a<s1.length();a++){
					
					if(s1.charAt(a) == s1.charAt(index1)){
						if(s1.charAt(a) == s1.charAt(0) && s1.charAt(a+1) == s1.charAt(1) && s1.charAt(a+1) == s1.charAt(2) && count1 !=0)
							break;
						repetition++;
						index1++;
						count1 = index1;
					}else if(s1.charAt(a) == s1.charAt(a-1)){
						recur++;
						if(recur >4)
							break;
					}
				}
				if(count1>lenCount){
					lenCount = count1;
				}
				
			}
			catch (Exception e) {
				BigInteger number1 = new BigInteger("10000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000").divide(new BigInteger(String.valueOf(i)));
				String s1 = String.valueOf(number1);
				count = s1.length();
				int index1 = 0;
				int recur = 0;
				
				count1=0;
				for(int a=1;a<s1.length();a++){
					
					if(s1.charAt(a) == s1.charAt(index1) || s1.charAt(a) == s1.charAt(index1+1)){
						if(s1.charAt(a) == s1.charAt(0) && s1.charAt(a+1) == s1.charAt(1) && s1.charAt(a+2) == s1.charAt(2) && index1 >0){
							//System.out.println(index1+"  1");
							break;
						}
						else if(s1.charAt(a) == s1.charAt(1) && s1.charAt(a+1) == s1.charAt(2) && s1.charAt(a+2) == s1.charAt(3) && index1 >1){
							//System.out.println(index1+"  2");
							break;
						}
						else if(s1.charAt(a) == s1.charAt(2) && s1.charAt(a+1) == s1.charAt(3) && s1.charAt(a+2) == s1.charAt(4) && index1 >2){
							//System.out.println(index1+"  3");
							break;
						}
						else if(s1.charAt(a) == s1.charAt(3) && s1.charAt(a+1) == s1.charAt(4) && s1.charAt(a+2) == s1.charAt(5) && index1 >3){
							//System.out.println(index1+"  4");
							break;
						}
						else if(s1.charAt(a) == s1.charAt(4) && s1.charAt(a+1) == s1.charAt(5) && s1.charAt(a+2) == s1.charAt(6) && index1 >4){
							System.out.println(index1+"  5");
							break;
						}
						else if(s1.charAt(a) == s1.charAt(5) && s1.charAt(a+1) == s1.charAt(6) && s1.charAt(a+2) == s1.charAt(7) && index1 >5){
							System.out.println(index1+"  6");
							break;
						}
						else if(s1.charAt(a) == s1.charAt(6) && s1.charAt(a+1) == s1.charAt(7) && s1.charAt(a+2) == s1.charAt(8) && index1 >6){
							System.out.println(index1+"  7");
							break;
						}
						else if(s1.charAt(a) == s1.charAt(7) && s1.charAt(a+1) == s1.charAt(8) && s1.charAt(a+2) == s1.charAt(9) && index1 >7){
							System.out.println(index1+"  8");
							break;
						}
						
						index1++;
						
					}
					if(s1.charAt(a) == s1.charAt(a-1)){
						if(s1.charAt(a+1) == s1.charAt(a+2) && s1.charAt(a+2) == s1.charAt(a+3))
							break;
					}
					count1 = a+1;
				}
				if(count1>lenCount){
					System.out.println("handled "+ number1+"  "+count);
					System.out.println(count1+"   asdasdasdadadasdada \n"+i);
					lenCount = count1;
					theNumber = i;
				}
			}
		}
		
		System.out.println(lenCount +" and the number is: "+theNumber);
			
		
	}

}
