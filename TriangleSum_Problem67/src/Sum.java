import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;


public class Sum {
	public static void main(String[] args) {
		int[][] triangleArray = new int[100][100];
		int[][] sumArray = new int[100][100];
		try{
			FileInputStream fstream = new FileInputStream("Triangle.txt");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			//Read File Line By Line
			int i=0;
			while ((strLine = br.readLine()) != null){
				String[] tempArray = strLine.split(" ");
				for(int x = 0;x<tempArray.length;x++){
					triangleArray[i][x] = Integer.parseInt(tempArray[x]);
					System.out.print(triangleArray[i][x]+" ");
				}
				System.out.println("");
				i++;
			}
			in.close();
		}catch (Exception e){
			System.err.println("Error: " + e.getMessage());
		}


		sumArray[0][0] = triangleArray[0][0];
		for(int i=1;i<triangleArray.length;i++){
			for(int j=0;j<=i;j++){

				if(j==0)
					sumArray[i][0] = triangleArray[i][0] + sumArray[i-1][0];
				else{
					if((triangleArray[i][j]+sumArray[i-1][j-1]) > (triangleArray[i][j]+sumArray[i-1][j]))
						sumArray[i][j] = triangleArray[i][j]+sumArray[i-1][j-1];
					else
						sumArray[i][j] = triangleArray[i][j]+sumArray[i-1][j];					
				}
			}
		}

		int biggestSum = sumArray[99][0];
		for(int i=1;i<sumArray[99].length;i++){
			if(sumArray[99][i]>biggestSum)
				biggestSum = sumArray[99][i];				
		}		
		System.out.println("Biggest Sum: "+biggestSum);
	}
}
