import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dan = sc.nextInt();
		

		for(int mul = 1; mul <= 9; mul++) {
			System.out.println(dan + " * " + mul + " = " + dan * mul);
		}

	}

}