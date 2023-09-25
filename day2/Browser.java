package week1.day2;


public class Browser {
	
	public String launchBrowser(String name ) {
		// Method1
		String message = "Browser:" +name+ " launched successfully";
		System.out.println( message);
		return message;

	}
	public void loadUrl() {
		// Method2
		System.out.println("Application url loaded successfully");

	}

	public static void main(String[] args) {
		//launch is the object
		Browser launch =new Browser();
		launch.launchBrowser("MainBrowser");
		launch.loadUrl();
		
	}

}

