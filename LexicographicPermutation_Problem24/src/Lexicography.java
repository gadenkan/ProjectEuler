// I guess there is a smart way.. i'm using Brute-Force. Shame on me, i know.


public class Lexicography {

	public static void main(String[] args) {

		String number1;
		String number2;
		String number3;
		String number4;
		String number5;
		String number6;
		String number7;
		String number8;
		String number9="";
		long count = 0;

		for(Integer a=0;a<=9;a++){
			String number0 = "";
			number0=((Integer)a).toString();
			for(Integer b=0;b<=9;b++){
				if(a==b)
					continue;
				number1 = number0 + b.toString();

				for(Integer c=0;c<=9;c++){
					if(c==b || c==a)
						continue;
					number2 = number1 + c.toString();
					for(Integer d=0;d<=9;d++){
						if(d==b || d==a || d==c)
							continue;
						number3 = number2 + d.toString();
						for(Integer e=0;e<=9;e++){
							if(e==b || e==a || e==c || e==d)
								continue;
							number4 =number3+ e.toString();
							for(Integer f=0;f<=9;f++){
								if(f==b || f==a || f==c || f==d || f==e)
									continue;
								number5 = number4+f.toString();
								for(Integer g=0;g<=9;g++){
									if(g==b || g==a || g==c || g==d || g==e || g==f)
										continue;
									number6 = number5+g.toString();
									for(Integer h=0;h<=9;h++){
										if(h==b || h==a || h==c || h==d || h==e || h==f || h==g)
											continue;
										number7 = number6+h.toString();
										for(Integer i=0;i<=9;i++){
											if(i==b || i==a || i==c || i==d || i==e || i==f || i==g || i==h)
												continue;
											number8 = number7+i.toString();
											for(Integer j=0;j<=9;j++){
												if(j==b || j==a || j==c || j==d || j==e || j==f || j==g || j==h || j==i)
													continue;

												number9 = number8+j.toString();
												count++;
												if(count == 1000000)
													System.out.println(count + "  " +number9+" here");
											}
										}
									}
								}
							}
						}
					}
				}
			}


		}

	}

}
