
public class NumberOfLetters {
	public static void main(String[] args) {

		long length = 0;
		long totalLength =0 ;
		for(int i=1;i<=999;i++){
			int tempNumber = i;
			
			
				int units = tempNumber%10;
				int tens = (tempNumber/10)%10;
				int hundreds = (tempNumber/100)%10;
				length = 0;
				
							
				if(tens != 1){
					
					
					if(units== 2 || units==6 || units == 1)
						length += 3;
					if(units== 4 || units==5 || units==9)
						length += 4;
					if(units == 3 || units == 7 || units == 8)
						length += 5;
					
					
					if(tens == 2 || tens == 3 || tens == 8 || tens == 9 )
						length += 6;
					if(tens == 4 || tens == 5 || tens ==6)
						length += 5;
					if(tens == 7 )
						length += 7;
					
					
				}
				else{
					
					if(units== 2 || units==1)
						length += 6;
					if(units== 4 || units==8 || units==9 || units==3)
						length += 8;
					if(units == 5 || units == 6)
						length += 7;
					if(units == 7)
						length += 9;
					if(units == 0)
						length += 3;
					
				}
					
				if((hundreds== 2 || hundreds==6 || hundreds == 1) && (units != 0 || tens != 0))
					length += 13;
				else if((hundreds== 2 || hundreds==6 || hundreds == 1) && (units == 0 && tens == 0))
					length +=10;
				if((hundreds== 4 || hundreds==5 || hundreds==9)  && (units != 0 || tens != 0))
					length += 14;
				else if((hundreds== 4 || hundreds==5 || hundreds == 9) && (units == 0 && tens == 0))
					length +=11;
				if((hundreds == 3 || hundreds == 7 || hundreds == 8) && (units != 0 || tens != 0))
					length += 15;
				else if((hundreds== 3 || hundreds==7 || hundreds == 8) && (units == 0 && tens == 0))
					length += 12;
					
				
				totalLength += length;
				
				System.out.println(i+"  length:"+length);			
		}
		
		System.out.println("1000 length:11");
		totalLength +=11;
		System.out.println("Total Length: "+totalLength);
	}

}
