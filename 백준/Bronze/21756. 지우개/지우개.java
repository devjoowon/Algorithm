import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i = 1; i <= n; i++) {
			arr.add(i);
		}
		
		while(arr.size() != 1) {
			for(int i = 0; i < arr.size(); i++) {
				arr.remove(i);
			}
		}
		System.out.println(arr.get(0));
	}

}
