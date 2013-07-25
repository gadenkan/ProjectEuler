import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CrackingPasscode_79 {

	/**
	 * @param args
	 */
	static Set[] numberSets = new HashSet[10];

	public static void main(String[] args) {

		// Reading keylog.txt file
		try {
			FileInputStream fstream = new FileInputStream("keylog.txt");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			// Read File Line By Line
			int i = 0;
			while ((strLine = br.readLine()) != null) {
				System.out.println(strLine);
				countNumbers(strLine);
				i++;
			}

			displayNumbers();

			in.close();
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}

		calculateSeq();

	}

	private static void calculateSeq() {


		List seq = new ArrayList();

		boolean allDone = false;
		while (!allDone) {
			int minSetSize = 11;
			int minSet = 9;
			allDone = true;
			for (int i = 0; i < 10; i++) {

				if (numberSets[i] != null) {
					allDone = false;
					if (numberSets[i].size() < minSetSize) {
						minSetSize = numberSets[i].size();
						minSet = i;
					} else if (numberSets[i].size() == minSetSize) {

						System.out.println("equal");
						if (numberSets[minSet].contains(i)) {
							System.out.println("yes it contains");
							minSetSize = numberSets[i].size();
							minSet = i;
						}
					}
				}
			}
			if (!allDone) {
				System.out.println(minSet);
				seq.add(minSet);
				numberSets[minSet] = null;
			}
		}
		System.out.println(seq);

	}

	private static void displayNumbers() {

		for (int i = 0; i < numberSets.length; i++) {
			System.out.println(numberSets[i]);
		}
	}

	private static void countNumbers(String s) {

		for (int i = 0; i < 2; i++) {
			int currentNumber = Integer.parseInt(String.valueOf(s.charAt(i)));
			int nextNumber = Integer.parseInt(String.valueOf(s.charAt(i + 1)));
			if (numberSets[nextNumber] == null) {
				numberSets[nextNumber] = new HashSet();
			}
			if (numberSets[currentNumber] == null) {
				numberSets[currentNumber] = new HashSet();
			}

			numberSets[nextNumber].add(String.valueOf(s.charAt(i)));
			Iterator z = numberSets[currentNumber].iterator();
			while (z.hasNext()) {
				numberSets[nextNumber].add(z.next());
			}
		}

	}

}
