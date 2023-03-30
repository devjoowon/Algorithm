import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strArr = br.readLine().split(" ");
		
		String a = strArr[0];
		String b = strArr[1];
		String c = strArr[2];
		String d = strArr[3];
		
		String ab = a + b;
		String cd = c + d;
		
		long longAb = Long.parseLong(ab);
		long longCd = Long.parseLong(cd);
		
		System.out.println(longAb + longCd);
	}

}