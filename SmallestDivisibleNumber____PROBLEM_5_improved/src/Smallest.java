
public class Smallest {

	public static void main(String[] args){
		
		int number = 2327;
		while (true){
			int count = 0;
			for(int i=11;i<=20;i++){
				if(number%i == 0)
					count++;
				else
					break;				
			}
			if(count == 10)
				break;
			number++;
		}
		System.out.println(number);
	}
}


