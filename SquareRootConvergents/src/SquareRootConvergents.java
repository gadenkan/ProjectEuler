import java.math.BigInteger;

public class SquareRootConvergents{

	public static void main(String[] args){

		SquareRootConvergents s = new SquareRootConvergents();
		long count = 0;
		for(int i=1; i<=1000; i++){
			Fraction f = s.getSqrtFraction(i, 1);
			Fraction result = Fraction.addFraction("1", f);
			if(result.isNumerLarger()){
				System.out.println(result.toString());
				count++;
			}
		}
		System.out.println("Count: "+count);
	}

	public Fraction getSqrtFraction(int to, int i){
		if(to == i){
			return new Fraction ("1", "2");
		}else{
			return new Fraction("1", Fraction.addFraction("2" , getSqrtFraction(to, ++i)));
		}
	}

	private static class Fraction{
		BigInteger numer;
		BigInteger deno;

		Fraction(String n, String d){
			this.numer = new BigInteger(n);
			this.deno = new BigInteger(d);
		}

		Fraction(BigInteger n, BigInteger d){
			this.numer = n;
			this.deno = d;
		}

		Fraction(String n, Fraction d){
			this.numer = (new BigInteger(n)).multiply(d.deno);
			this.deno = d.numer;
		}

		public static Fraction addFraction(String n, Fraction d){
			BigInteger numer = (new BigInteger(n).multiply(d.deno)).add(d.numer);
			return new Fraction(numer.toString(), d.deno.toString());
		}

		public static Fraction addFractions(Fraction n, Fraction d){
			BigInteger numer = (n.numer.multiply(d.deno)).add(d.numer.multiply(n.deno));
			BigInteger deno = n.deno.multiply(d.deno);
			return new Fraction(numer, deno);
		}

		public boolean isNumerLarger(){
			if(this.numer.toString().length() > this.deno.toString().length()){
				return true;
			}
			return false;
		}

		public String toString(){
			return numer.toString()+"/"+deno.toString();
		}
	}
	
}