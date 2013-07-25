// How many different ways can £2 be made using any number of coins from 1p, 2p, 5p, 10p, 20p, 50p, £1 (100p) and £2 (200p).

public class TwoPounds {

	static int[] denominations = {1,2,5,10,20,50,100,200};

	public static void main(String[] args) {
		
		int target  = 200;		
		int total = partition(0,target);		
		System.out.println(total);				
	}

	private static int partition(int i, int j) {		
		int index = i;
		if(denominations[index]>j)
			return 0;
		else if(denominations[index]==j)
			return 1;
		else
			return (partition(index+1, j) + partition(index, j-denominations[index]));
	}

}

// Courtesy : http://en.wikipedia.org/wiki/Integer_partition#Intermediate_function
// This problem shows HOW MUCH Mathematics can help in solving programming problems.