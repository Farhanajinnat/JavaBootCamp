
public class RemoveallWhitespace {

	public static void main(String[] args) {
		String a;
		String b;
		String c;
		char aChar ;
		int i = 0 ;
		Scanner scan =new Scanner(System.in);
		a = scan.nextLine();
		a = a.trim();
		for ( ; i >= 0 ; i++)
		{
			aChar = a.charAt(i) ;
			if (aChar != 32)
			{
				a = a.substring(0,i+1) ;
			
			}
			else
			{
				b = a . substring(i,160);
				b = b.trim();
				c = c+ a ;
				c = c. trim();
				a = b ;
				i =0;
				
			}
		}

	}

}
