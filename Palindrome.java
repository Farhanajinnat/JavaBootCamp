import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String current , reverse="";
				int length;
	 Scanner in =new Scanner(System.in);
		System.out.println("pass the string");
		current = in.nextLine();
		length= current.length();
		for (int i=length -1; i>= 0; i--) { 
			reverse =reverse+current.charAt(i);
			}
		System.out.println("reverse string is" + reverse);
		if (current.contentEquals(reverse))
			System.out.println("it is palindrome");
		else
			System.out.println("it is not a palindrome");

	}

}
