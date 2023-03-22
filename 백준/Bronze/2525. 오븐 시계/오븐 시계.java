import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int hour = in.nextInt();
		int minute = in.nextInt();
		int cookingMinute = in.nextInt();
		
		int increasedHour;
		int increasedMinute;
		int doneHour;
		int doneMinute;
		
		if((minute + cookingMinute) >= 60) {
			increasedHour = (minute + cookingMinute) / 60;
			doneHour = hour + increasedHour;
			
			if(doneHour >= 24) {
				doneHour -= 24;
			}
			
			increasedMinute = cookingMinute - 60 * increasedHour;
			doneMinute = minute + increasedMinute;
			
			System.out.println(doneHour + " " + doneMinute);
		}else {
			System.out.println(hour + " " + (minute + cookingMinute));
		}
		
	}
	
}