import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;


public class TriangleWord {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String[] wordsArray = new String[6000];
		SortedSet<String> namesSet =  new TreeSet<String>();
		try{
			FileInputStream fstream = new FileInputStream("words.txt");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			//Read File Line By Line
			int i=0;
			while ((strLine = br.readLine()) != null){
				wordsArray = strLine.split(",");
				for(int x=0;x<wordsArray.length;x++){
					int len = wordsArray[x].length();
					wordsArray[x] = wordsArray[x].substring(1,len-1);
					namesSet.add(wordsArray[x]);
				}
				i++;
			}
			in.close();
		}catch (Exception e){
			System.err.println("Error: " + e.getMessage());
		}
		
		
		List<Integer> triangleNumbers = new ArrayList<Integer>();
		for(int i=1;i<300;i++){
			triangleNumbers.add((i*(i+1))/2);
		}
		
		Iterator<String> list = namesSet.iterator();
		int totalWords = 0 ;
		while(list.hasNext()){			
			String name = list.next();
			System.out.println(name);
			int worth = wordWorth(name);
			if(triangleNumbers.contains(worth))
				totalWords++;			
		}
		
		System.out.println(totalWords);
		
	}
	
	
	private static int wordWorth(String word) {

		int worth = 0;
		char[] wordChar = word.toCharArray();
		for(int i=0;i<wordChar.length;i++){
			worth += wordChar[i]-64;
		}
			
		return worth;
	}

}
