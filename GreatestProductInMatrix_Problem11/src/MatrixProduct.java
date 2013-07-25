import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;


public class MatrixProduct{

	public static void main(String[] args){

		String[][] matrixArray = new String[20][20];
		long greatestProduct = 1;
		long tempProduct = 1;
		try{
			FileInputStream fstream = new FileInputStream("matrix.txt");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			//Read File Line By Line
			int i=0;
			while ((strLine = br.readLine()) != null){
				matrixArray[i] = strLine.split(" ");
				i++;
			}
			in.close();
		}catch (Exception e){
			System.err.println("Error: " + e.getMessage());
		}
		
		
		// Display the read data from the file
		/*for(int x=0;x<20;x++){
			for(int y=0;y<20;y++)
				System.out.print(matrixArray[x][y] + " ");
			System.out.println("");
		}*/
		
		
		// Row-wise product
		for(int x=0;x<20;x++){
			for(int y=0;y<17;y++){
				int a = Integer.parseInt(matrixArray[x][y]);
				int b = Integer.parseInt(matrixArray[x][y+1]);
				int c = Integer.parseInt(matrixArray[x][y+2]);
				int d = Integer.parseInt(matrixArray[x][y+3]);
				tempProduct =  a*b*c*d;
				if(tempProduct>greatestProduct)
					greatestProduct = tempProduct;
			}
		}
		
		
		//Column-wise product
		for(int y=0;y<20;y++){
			for(int x=0;x<17;x++){
				int a = Integer.parseInt(matrixArray[x][y]);
				int b = Integer.parseInt(matrixArray[x+1][y]);
				int c = Integer.parseInt(matrixArray[x+2][y]);
				int d = Integer.parseInt(matrixArray[x+3][y]);
				tempProduct =  a*b*c*d;
				if(tempProduct>greatestProduct)
					greatestProduct = tempProduct;
			}
		}
		
		
		// Diagonal (left-top to bottom-right)
		for(int x=0;x<17;x++){
			for(int y=0;y<17;y++){
				int a = Integer.parseInt(matrixArray[x][y]);
				int b = Integer.parseInt(matrixArray[x+1][y+1]);
				int c = Integer.parseInt(matrixArray[x+2][y+2]);
				int d = Integer.parseInt(matrixArray[x+3][y+3]);
				tempProduct =  a*b*c*d;
				//System.out.println(a+" "+b+" "+c+" "+d);
				if(tempProduct>greatestProduct)
					greatestProduct = tempProduct;
			}
		}
		
		// Diagonal (right-top to bottom-left)
		for(int x=3;x<20;x++){
			for(int y=3;y<20;y++){
				int a = Integer.parseInt(matrixArray[x][y-3]);
				int b = Integer.parseInt(matrixArray[x-1][y-2]);
				int c = Integer.parseInt(matrixArray[x-2][y-1]);
				int d = Integer.parseInt(matrixArray[x-3][y]);
				tempProduct =  a*b*c*d;
				//System.out.println(a+" "+b+" "+c+" "+d);
				if(tempProduct>greatestProduct)
					greatestProduct = tempProduct;
			}
		}
		System.out.println(greatestProduct);
		
		
		
	}
}
