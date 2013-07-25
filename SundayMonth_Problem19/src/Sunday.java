//How many Sundays fell on the first of the month during the twentieth century?

public class Sunday {

	public static void main(String[] args){
		
		int sundayCount = 0;
		int count = 2; // Monday -1 ; Tuesday -2 ; Wednesday -3 .....
		for(int i=1901; i<=2000;i++){
			
			for(int j=1; j<=12;j++){
				
				if(j==2){
					if((i%4==0 && i%100!=0) || (i%100==0 && i%400==0)){						
						count += 1;
					}	
					else{
						
					}
				}
				else if(j==1 || j==3 || j==5 || j==7 || j==8 || j==10 || j==12){
					count += 3;					
				}
				else{
					count += 2;
				}
					
				if(count%7 == 0)
					sundayCount++;
			}
		}
		
		System.out.println(sundayCount);
	}
}
