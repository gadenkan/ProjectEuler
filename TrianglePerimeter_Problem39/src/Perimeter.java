

public class Perimeter  {
	public static void main(String [] args) {

		int[] count = new int[1001];
		int largestCount = 0;
		int largetstIndex = 0;
		for(int i=1;i<=1000;i++){

			
			for(int a=1;a<=i/3;a++){

				for(int b=a;b<=2*i/3;b++){
					for(int c=b;c<=i;c++){
						
						if(a+b+c == i && (a*a) + (b*b) == (c*c)){
							
								count[i]++;								
							
						}
						else{
							continue;
						}

					}
				}
			}
			
			if(largestCount<count[i]){
				largestCount = count[i];
				largetstIndex = i;
			}
		}
		System.out.println(largetstIndex+" "+largestCount);
	}
}
