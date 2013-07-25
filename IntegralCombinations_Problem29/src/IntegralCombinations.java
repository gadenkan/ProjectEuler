
import java.util.LinkedHashSet;
import java.util.Set;


public class IntegralCombinations {

	
	public static void main(String[] args) {
		Set<Double> setOfNumbers = new LinkedHashSet<Double>();
		for(int i=2 ; i<=100 ;i++){
			for(int j=2;j<=100;j++){
				setOfNumbers.add(Math.pow(i, j));
			}
		}
		
		System.out.println(setOfNumbers.size());
	}

}
