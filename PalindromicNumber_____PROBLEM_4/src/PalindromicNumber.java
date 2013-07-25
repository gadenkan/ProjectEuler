
public class PalindromicNumber {

	public static void main(String[] args){
	
		boolean x = false;
		int temp = 0;
		int product = 1;
		for(int i = 999;i>0;i--){
			for(int j=999;j>=i;j--){			
				product = i*j;
				if(product<temp)
					break;
				x = new PalindromicNumber().isPalindrome(product);			
				if(x)	{			
					System.out.println("i: "+i+"  j: "+j+"  product: "+product);
					if (product>temp)					
						temp = product;
				}
			}
				
		}
		
		 	
		System.out.println(temp);
	}
	
	public boolean isPalindrome(int x){
		
		String reverse = "";
		String numberString = String.valueOf(x);
		for(int i=(numberString.length())-1;i>=0;i--){
			reverse = reverse + numberString.charAt(i);
		}
		
		if(reverse.equals(numberString))
			return true;
		else{
			return false;
		}
			
	}
}
