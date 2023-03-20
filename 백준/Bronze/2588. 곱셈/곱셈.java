import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int bFirstNum = b % 10;
		int bSecondNum = (b / 10) % 10;
		int bThirdNum = ((b / 10) / 10) % 10;
		
		int first = a * bFirstNum;
		int second = a * bSecondNum;
		int third = a * bThirdNum;
		
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		
		System.out.println(first + second*10 + third*100);
	}

}