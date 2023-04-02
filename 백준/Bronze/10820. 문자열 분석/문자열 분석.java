import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input ="";
		
		while((input = br.readLine()) != null) {
			int lower = 0;
			int upper = 0;
			int num = 0;
			int space = 0;
			for(int i = 0; i < input.length(); i++) {
				char c = input.charAt(i);
				if(Character.isLowerCase(c)) lower++;
				else if(Character.isUpperCase(c)) upper++;
				else if(Character.isDigit(c)) num++;
				else if(Character.isSpaceChar(c)) space++;
			}
			System.out.println(lower + " " + upper + " " + num + " " + space);
		}
	}

}
