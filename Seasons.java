
public class Seasons {

	public static void main(String[] args) {
		System.out.println("January 14th is in " + season(1, 14));
		System.out.println("October 23rd is in " + season(10, 23));
		System.out.println("June 7th is in " + season(6, 7));
	}
	
	public static String season(int month, int day) {
		if (month == 12 && day >= 16 
				|| month == 1 
				|| month == 2 
				|| month == 3 && day <= 15) {
			 return "Winter";
		} else if (month == 3 && day >= 16
				|| month == 4
				|| month == 5
				|| month == 6 && day <= 15) {
			return "Spring";
		} else if (month == 6 && day >= 16
				|| month == 7
				|| month == 8
				|| month == 9 && day <= 15) {
			return "Summer";
		} else {
			return "Fall";
		}
	}
}
