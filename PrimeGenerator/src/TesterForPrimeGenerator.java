
public class TesterForPrimeGenerator {

	public static void main(String[] args){
		PrimeGenerator p = new PrimeGenerator();
		int [] i = p.getPrimes(5000);
		for(int x=0;x<i.length;x++){
			System.out.println(i[x]);
		}
	}
}
