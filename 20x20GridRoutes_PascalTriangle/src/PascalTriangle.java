public class PascalTriangle 

{ 
	public static void main(String args[]) 
	{ 
		int x=41; //take x as an input for number of rows; 
		long triangle[][] = new long[x][x]; //a double dim array... 
		

		triangle[0][0]=1 ;
		for(int i=1;i<x;i++) { 
			triangle[i][0]=1 ;
			for(int j=1;j<x;j++) 
				triangle[i][j]=triangle[i-1][j-1]+triangle[i-1][j]; 
		} 


		for(int i=0;i<x;i++) //Display.. 
		{ 
			for(int j=0;j<=i;j++) 
				System.out.print(triangle[i][j]+ " "); 
			System.out.println(); 
		} 


		System.out.println(triangle[40][20]);

	} 
} 

// The value at 'n'th column of (2n+1)th row will give the no of routes for a n x n grid, where n starts with 0