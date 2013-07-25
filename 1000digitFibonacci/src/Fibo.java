import java.math.BigInteger;


public class Fibo {


	public static void main(String[] args) {

		
		BigInteger a = new BigInteger("1");
		BigInteger b = new BigInteger("1");
		BigInteger c = new BigInteger("0");

		int term = 0 ;
		System.out.println("1\t:"+a.toString());
		System.out.println("2\t:"+b.toString());
		for(int i=3;i<=15000;i++){

			c = a.add(b);
			a = b;
			b = c;

			System.out.println(i+"  "+c);
			if(c.toString().length()>= 1000){
				term = i;
				break;
			}
		}
		System.out.println(term);
	}

}
