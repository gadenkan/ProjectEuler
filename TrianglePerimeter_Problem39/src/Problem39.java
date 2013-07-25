public class Problem39 
{ 

	private static int [] perimeter = new int [1000]; 

	public static void main (String args []) 
	{ 

		int a, b, c; 
		int total; 

		for (int m = 2; m < 22; m++) 
			for (int n = m % 2 + 1; n < m; n += 2) 
				if (gcd (m, n) == 1) 
				{

					a = m * m - n * n; 
					b = 2 * m * n; 
					c = m * m + n * n; 

					total = a + b + c; 

					for (int loop = total; loop < 1000; loop += total) 
						perimeter [loop]++; 

				} 

		int max = -1; 
		int maxIndex = -1; 

		for (int loop = 0; loop < 1000; loop++) 
			if (perimeter [loop] > max) 
			{ 

				max = perimeter [loop]; 
				maxIndex = loop; 

			} 

		System.out.println ("Maximum perimeter: " + maxIndex); 

	}

	private static int gcd (int a, int b) 
	{ 

		if (a == 1 || b == 1) 
			return 1; 
		else if (a % b == 0) 
			return b; 
		else if (b % a == 0) 
			return a; 
		else if (a > b) 
			return gcd (a - (a / b) * b, b); 
		else 
			return gcd (a, b - (b / a) * a); 

	} 

}