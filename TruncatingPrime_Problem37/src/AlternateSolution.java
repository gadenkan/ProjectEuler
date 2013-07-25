
public class AlternateSolution {

	public static boolean isPrime( int number )
	{
		if( number < 2 )
		{
			return false;
		}
		else if ( number == 2 )
		{
			return true;
		}
		else
		{
			for( long i=2; i<=Math.sqrt(number); i++ )
			{
				if( number%i == 0 )
				{
					return false;
				}
			}
		}
 
		return true;
	}
 
	public static boolean isTruncatable ( int number )
	{
		String s = String.valueOf( number );
		String sub;
 
		for( int i=0; i<s.length(); i++ )
		{
			sub = s.substring( i );
 
			if( !isPrime(Integer.valueOf(sub)) )
			{
				return false;
			}
		}
 
		for( int i=s.length(); i>0; i-- )
		{
			sub = s.substring( 0, i );
 
			if( !isPrime(Integer.valueOf(sub)) )
			{
				return false;
			}
		}
 
		return true;
	}
 
	public static void main(String[] args) 
	{
		int result = 0;
		int counter = 0;
		int i = 8;
 
		while( true )
		{
			if( isTruncatable(i) )
			{
				System.out.println(i);
				result += i;
				counter++;
			}
 
			if( counter == 11 )
			{
				break;
			}
 
			i++;
		}
 
		System.out.println( result );
	}
}
