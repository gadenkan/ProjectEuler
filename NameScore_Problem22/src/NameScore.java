import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;


public class NameScore {

	public static void main(String[] args) {

		long totalNameScore = 0;
		String[] namesArray = new String[6000];
		SortedSet<String> namesSet =  new TreeSet<String>();
		try{
			FileInputStream fstream = new FileInputStream("names.txt");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			//Read File Line By Line
			int i=0;
			while ((strLine = br.readLine()) != null){
				namesArray = strLine.split(",");
				for(int x=0;x<namesArray.length;x++){
					int len = namesArray[x].length();
					namesArray[x] = namesArray[x].substring(1,len-1);
					namesSet.add(namesArray[x]);
				}
				i++;
			}
			in.close();
		}catch (Exception e){
			System.err.println("Error: " + e.getMessage());
		}
		
		Iterator<String> list = namesSet.iterator();
		int count = 0;
		while(list.hasNext()){
			count++;
			String name = list.next();
			System.out.println(name);
			int worth = nameWorth(name);
			int nameScore = worth * count;
			totalNameScore += nameScore;
		}
		
		System.out.println(totalNameScore);
	}

	private static int nameWorth(String name) {

		int worth = 0;
		char[] nameChar = name.toCharArray();
		for(int i=0;i<nameChar.length;i++){
			worth += nameChar[i]-64;
		}
			
		return worth;
	}

}
