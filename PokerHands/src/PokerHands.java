import java.util.Iterator;
import java.util.Map.Entry;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.Comparable;

public class PokerHands{

	public static void main(String[] args) throws IOException{
		PokerHands p = new PokerHands();
		int won = p.solve("p054_poker.txt");
		System.out.println("Won: "+won);
	}
	public int solve(String fileName) throws IOException{
		int won = 0;
		int count = 0;
		BufferedReader in = new BufferedReader(new FileReader(fileName));
		String line = in.readLine();
		while(line != null){
			System.out.println(line);
			String[] allCards = line.split(" ");
			String[] c1 = new String[5];
			String[] c2 = new String[5];
			System.arraycopy(allCards, 0, c1, 0, 5);
			System.arraycopy(allCards, 5, c2, 0, 5);
			Hands h1 = new Hands(c1);
			System.out.println("h1: "+h1.toString());
			Hands h2 = new Hands(c2);
			System.out.println("h1: "+h2.toString());
			int v = h1.compareTo(h2);
			if(v == 1){
				won++;
				System.out.println("h1 wins. win count: "+won);
			}

			line = in.readLine();
			System.out.println("count : "+count++);
			//break;
		}
		return won;
	}

	public enum HandEnum{
		ROYAL_FLUSH(10),
		STRAIGHT_FLUSH(9),
		FOUR_OF_A_KIND(8),
		FULL_HOUSE(7),
		FLUSH(6),
		STRAIGHT(5),
		THREE_OF_A_KIND(4),
		TWO_PAIRS(3),
		PAIR(2),
		HIGH_CARD(1);

		private int value;

		HandEnum(int value){
			this.value = value;
		}

		public int value(){
			return this.value;
		}

	}

	private class Hands implements Comparable<Hands>{

		List<Integer> nums = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		boolean flush = true;
		boolean straight = true;
		boolean fourOfAKind = false;
		boolean threeOfAKind = false;
		boolean pair1 = false;
		boolean pair2 = false;
		HandEnum hand;
		int highHand;
		int kicker = 0;

		public Hands(String[] cards){
			collectValues(cards);
			calculatePairs();
			calculateHand();
		}

		public void collectValues(String[] cards){
			char suite = cards[0].charAt(1);
			for(int i=0; i<cards.length; i++){
				String value = String.valueOf(cards[i].charAt(0));
				int intVal;
				if (value.equals("A")){
					intVal = 14;
				}else if(value.equals("K")){
					intVal = 13;
				}else if(value.equals("Q")){
					intVal = 12;
				}else if(value.equals("J")){
					intVal = 11;
				}else if(value.equals("T")){
					intVal = 10;
				}else{
					intVal = Integer.parseInt(value);
				}
				nums.add(intVal);
				if(map.containsKey(intVal)){
					map.put(intVal, map.get(intVal)+1);
				}else{
					map.put(intVal, 1);
				}
				if(suite != cards[i].charAt(1)){
					flush = false;
				}
			}
			Collections.sort(nums);
			//System.out.println("Cards "+nums);
		}

		public boolean isStraigth(){
			int a = nums.get(0);
			if(nums.get(1) == 2){
				a = a % 13;
			}
			for(int i=1; i<nums.size(); i++){
				if(a != (nums.get(i) - 1)){
					return false;
				}
				a = nums.get(i);
			}
			highHand = a;
			return true;
		}

		public void calculatePairs(){

			Iterator<Entry<Integer,Integer>> iterator = map.entrySet().iterator();
			int size = map.size();
			while (iterator.hasNext()) {
				Map.Entry<Integer,Integer> entry = (Map.Entry<Integer,Integer>) iterator.next();
				if(entry.getValue() == 4){
					fourOfAKind = true;
					highHand = entry.getKey();
				}else if(entry.getValue() == 3){
					threeOfAKind = true;
					highHand = entry.getKey();
				}else if(entry.getValue() == 2 && !pair1){
					pair1 = true;
					if(size != 2){
						highHand = entry.getKey();
					}
				}else if(entry.getValue() == 2 && pair1){
					pair2 = true;
					if(entry.getKey() > highHand){
						highHand = entry.getKey();
					}
				}else if(entry.getValue() == 1){
					if(entry.getKey() > kicker){
						kicker = entry.getKey();
					}
				}
			}
		}

		public void calculateHand(){
			straight = isStraigth();

			if(straight && flush && nums.get(0) == 10){
				hand = HandEnum.ROYAL_FLUSH;
			}else if(straight && flush){
				hand = HandEnum.STRAIGHT_FLUSH;
			}else if(fourOfAKind){
				hand = HandEnum.FOUR_OF_A_KIND;
			}else if(threeOfAKind && pair1){
				hand = HandEnum.FULL_HOUSE;
			}else if(flush){
				hand = HandEnum.FLUSH;
				highHand = 0; // compare nums
			}else if(straight){
				hand = HandEnum.STRAIGHT;
				highHand = nums.get(4);
			}else if(threeOfAKind){
				hand = HandEnum.THREE_OF_A_KIND;
				highHand = 0; // compare nums
			}else if(pair1 && pair2){
				hand = HandEnum.TWO_PAIRS;
			}else if(pair1){
				hand = HandEnum.PAIR;
			}else{
				hand = HandEnum.HIGH_CARD;
				highHand = 0; // compare nums
			}
		}

		public int compareTo(Hands h){
			//System.out.println("h2: "+h.hand.value());
			//System.out.println("h1: "+this.hand.value());
			if(this.hand.value() > h.hand.value()){
				return 1;
			}else if(this.hand.value() < h.hand.value()){
				return -1;
			}else{
				if(highHand ==0){
					for(int i=nums.size()-1; i>=0; i--){
						if(nums.get(i) > h.nums.get(i)){
							return 1;
						}else if(nums.get(i) < h.nums.get(i)){
							return -1;
						}
					}
					return -1;
				}else{
					if(this.highHand > h.highHand){
						return 1;
					}else if (this.highHand < h.highHand){
						return -1;
					}else{
						if(this.kicker > h.kicker){
							return 1;
						}else{
							return -1;
						}
					}
				}
			}
		}

		public String toString(){
			return "Hand: "+hand+"(value:"+hand.value()+"). High Hand: "+highHand+". Kicker:"+kicker;
		}
	}
}