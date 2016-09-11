import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class PentagonNumbers {
	
	
	public static void main (String[] args){
		long diffNo = -1L;
		List<Long> pNumbers = new ArrayList<>();
		pNumbers.add(1l);
		boolean found = false;
		long i = 1;
		while(!found){
			//System.out.println(pNumbers.get(i-1) + ". i:"+i);
			long x = getPentagonNumber(++i);
			pNumbers.add(x);
			for(int m = 0; m < pNumbers.size(); m++){
				long temp = pNumbers.get(m);
				if(pNumbers.contains(x-temp)){
					if(isPentagonNumber(x+temp)){
						System.out.println("x "+x);
						System.out.println("temp "+temp);
						System.out.println("x - temp "+(x-temp));
						System.out.println("x + temp "+(x+temp));
						found = true;
						diffNo = x - temp;
						break;
					}
				}
			}
		}
		System.out.println(diffNo);
	}

	public static boolean isPentagonNumber(long n){
		double pentNo = (Math.sqrt((n * 24) + 1) + 1) / 6;
		if(pentNo == (int) pentNo){
			return true;
		}else{
			return false;
		}
	}

	public static long getPentagonNumber(long n){
		return (n * (3*n - 1)) / 2;
	}
}