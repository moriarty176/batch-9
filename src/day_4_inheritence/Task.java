package day_4_inheritence;

public class Task {
	
	public static void main(String[] args) {
		getDuration(732, 54);
		getDuration(126574);
	}

	public static String getDuration(int minutes, int seconds) {
		if(minutes < 0) {
			return "Invalid Data";
		}
		if(seconds < 0 || seconds > 59) {
			return "Invalid data";
		}
		
		int hours = minutes/60;
		int remainingMins = minutes % 60;
		System.out.println("hours: " + hours);
		System.out.println("Minutes: " + remainingMins);
		System.out.println("Seconds: " + seconds);
		return "";
	}
	
	public static void getDuration(int seconds) {
		if(seconds<0) {
			System.out.println("Invalid data");
		}
		else {
			int minutes = seconds/60;
			int remainingSeconds = seconds % 60;
			int hours  = minutes/60;
			int remMins = minutes % 60;
			System.out.println("Hours: " + hours);
			System.out.println("Minutes: " + remMins);
			System.out.println("Seconds: " + remainingSeconds);
		}
	}
}











