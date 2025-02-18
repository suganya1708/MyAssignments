package week1.day2;

public class Browser {
	
	public void launchBrowser() {
		
		System.out.println("Browser Launched Successfully");
	}

public void loadUrl() {
		
		System.out.println("Application URL loaded Successfully");
	}

	public static void main(String[] args) {
		
		Browser br = new Browser();
		
		br.launchBrowser();
		br.loadUrl();
		
		
		

	}

}
