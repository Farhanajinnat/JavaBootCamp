import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		int x, y;
		System.out.println("Enter two numbers for x and y");
		Scanner in= new Scanner (System.in);
		x=in.nextInt();
		y=in.nextInt();
		
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println(x+ y);

	}

}
