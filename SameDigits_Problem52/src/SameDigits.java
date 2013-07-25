import java.util.ArrayList;
import java.util.List;


public class SameDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int number = 1;
		boolean flag = true;
		while(flag){
			String s1 = String.valueOf(number);
			char[] c1 = s1.toCharArray();
			List<Character> list1 = new ArrayList<Character>();
			for(int i=0;i<c1.length;i++){
				list1.add(c1[i]);
			}

			int count=1;
			for(int i=2;i<=6;i++){
				int tempNumber = i*number;
				boolean innerFlag = false;
				String s = String.valueOf(tempNumber);
				char[] c = s.toCharArray();
				for(int j=0;j<c.length;j++){
					if(!list1.contains(c[j])){
						innerFlag = true;
						break;
					}
				}
				if(innerFlag)
					break;

				count++;
			}
			if(count == 6)
				flag = false;
			else
				number++;
		}

		System.out.println(number);
	}

}
