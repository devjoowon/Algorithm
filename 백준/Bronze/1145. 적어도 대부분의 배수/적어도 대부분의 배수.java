
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		int cnt = 0;
		int ret = 1;
		
		for(int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		while(true) {
			cnt = 0;
			
			for(int i = 0; i < 5; i++) {
				if( ret % arr[i] == 0 ) cnt++;
			}
			
			if(cnt >= 3) {break;}
			
			ret++;		
		}

		System.out.println(ret);
		}
	}


