import java.math.BigInteger;


public class NonMersennePrime {

	public static void main(String[] args) {

		BigInteger x = new BigInteger("1");

		for(int i=1;i<=10000;i++){
			x = x.multiply(new BigInteger("2"));			
		}
		
		System.out.println(x);
		String string = x.toString();
		String lastTwelve = string.substring(string.length()-12, string.length());
		System.out.println(lastTwelve);
		BigInteger new1 = new BigInteger(lastTwelve);
		x  = new BigInteger(lastTwelve);
		System.out.println(new1+" new");
		
		
		for(int i=1;i<=782;i++){
			x = x.multiply(new1);
			String string2 = x.toString();
			String lastTwelve2 = string2.substring(string2.length()-12, string2.length()); 
			x = new BigInteger(lastTwelve2);
		}
		System.out.println(x);
		for(int i=1;i<=457;i++){
			x = x.multiply(new BigInteger("2"));
			String string3 = x.toString();
			if(string3.length()>13){
				
				String lastTwelve3 = string3.substring(string3.length()-12, string3.length()); 
				x = new BigInteger(lastTwelve3);
			}
		}
		
		x = x.multiply(new BigInteger("28433"));
		x = x.add(new BigInteger("1"));
		System.out.println(x);
	}

}
