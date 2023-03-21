import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int H = scan.nextInt();
		int M = scan.nextInt();
		scan.close();
		
		if(M<45) {
			M = M + 60 - 45;
			H = H - 1;
			if(H<0) {
				H = 23;
			}
			System.out.println(H + " " + M);
			
		}else {
			M = M - 45;
			System.out.println(H + " " + M);
		}
	}

}