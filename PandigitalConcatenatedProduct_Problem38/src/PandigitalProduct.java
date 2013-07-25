import java.util.HashSet;
import java.util.Set;


public class PandigitalProduct {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int maxPandigital=0;
		for(int i=9999;i>1;i--){
			String s = "";
			for(int j=1;j<=5;j++){
				
				s=s+(i*j);
				if(s.length() == 9 && isPandigital(s)){
					if(Integer.parseInt(s) > maxPandigital){
						maxPandigital = Integer.parseInt(s);
						System.out.println("i: "+i+". product: "+s);						
					}
					break;
				}
				if(s.length() > 9){
					break;
				}
			}
		}

	}
	
	static boolean isPandigital(String s){
		
		Set<Character> set = new HashSet<Character>();
		for(int i=0;i<s.length();i++){
			Character c = s.charAt(i);
			if(c=='0'){
				return false;
			}
			set.add(c);
		}
		if(set.size() != 9){
			return false;
		}
		return true;
	}

}
