
public class AlternateSolution {

	final static int TOTAL = 200;
	 
	public static void main(String[] args) {
		int[] coins = {1, 2, 5, 10, 20, 50, 100, 200};
		int[] ways = new int[TOTAL + 1];
		ways[0] = 1;
 
		for(int coin: coins){
			for(int j = coin; j <= TOTAL; j++){
				System.out.println(j+": ways["+j+"] = "+ ways[j]+" + "+ways[j-coin]+" : "+ (ways[j]+ways[j-coin]));
				ways[j] += ways[j - coin];				
			}
			System.out.println();
		}
		
 
		System.out.println("Result: " + ways[TOTAL]);
	}
}