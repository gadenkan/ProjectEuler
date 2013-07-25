
public class FifthPower {

	public static void main(String[] args) {

		long totalSum = 0;
		for(int i = 2; i<999999;i++){
			long sum = 0;
			String s = ((Integer)i).toString();
			char[] c = s.toCharArray();
			for(int y=0; y<c.length;y++){
				sum += Math.pow((c[y] - 48), 5);
			}
			if(sum == i){
				totalSum += sum;
				System.out.println(i+"  "+sum);
			}
				
		}
		System.out.println(totalSum);
	}

}
