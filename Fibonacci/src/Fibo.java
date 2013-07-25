
public class Fibo {
	
	public static void main(String[] args){
		
		int a = 1;
		int b = 2;
		int fibo =0;
		int sum =2 ;
		
		for (;fibo<4000000;){
			fibo = a + b;
			a=b;
			b=fibo;
			
			if(fibo%2 == 0)
				sum = sum +fibo;
			System.out.println(fibo);
		}
		System.out.println(sum);
	}

}
