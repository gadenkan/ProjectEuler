import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;


public class Sum {

	public static void main(String[] args) {
		
		String[] numbersString = new String[100];
		int[] sum = new int[51];

		// Reading the hundred 50-digit numbers from the file and storing them in numberString Array
		try{
			FileInputStream fstream = new FileInputStream("numbers.txt");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			//Read File Line By Line
			int i=0;
			while ((strLine = br.readLine()) != null){
				numbersString[i] = strLine;
				i++;
			}
			in.close();
		}catch (Exception e){
			System.err.println("Error: " + e.getMessage());
		}
		
		
		int carry  =0;
		
		for(int x=49;x>=0;x--){	
			int tempSum = 0;
			for(int y=0;y<100;y++){			
				tempSum = (Character.valueOf(numbersString[y].charAt(x)) - 48) + tempSum;
			}	
			
			tempSum = tempSum + carry;
			carry  = tempSum / 10;
			sum[x+1] = tempSum%10;
		}
		sum[0] = carry;
		
		//Printing the sum
		for(int x=0;x<51;x++){
			System.out.print(sum[x]);			
		}
		
	}

}
