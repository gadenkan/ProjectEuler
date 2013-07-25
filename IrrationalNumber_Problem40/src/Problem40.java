import java.util.ArrayList;
import java.util.List;


public class Problem40 {

	public static void main(String[] args){
		
		List<Character> list = new ArrayList<Character>();
		for(int i=1;i<1000000;i++){
			String s = String.valueOf(i);
			char[] c = s.toCharArray();
			for(int j=0;j<c.length;j++){
				list.add(c[j]);
			}			
		}
		

		System.out.println(list.get(0)+"*"+list.get(9)+"*"+list.get(99)+"*"+list.get(999)+"*"+list.get(9999)+"*"+list.get(99999)+"*"+list.get(999999));
				
	}
}
