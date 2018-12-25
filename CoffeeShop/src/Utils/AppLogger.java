package Utils;

public class AppLogger {
	
	private static final boolean active = true;
	
	public static void setLog(String message) {
		if(active) System.out.println(message);
	}

}
