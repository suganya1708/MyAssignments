package week2.day3;

public class Chrome extends Browser{
	
	public void openincognito() {
		
		System.out.println("incognito is opened");
		
	}
	
public void Clearcache() {
	
	System.out.println("cache is cleared");
	
}

	public static void main(String[] args) {

		Chrome ch = new Chrome();
		ch.Browsername="Chrome";
		System.out.println(ch.Browsername);
		ch.BrowserVersion="133.0.6943.127";
		System.out.println(ch.BrowserVersion);
		ch.OpenURL();
		ch.CloseBrowser();
		ch.Clearcache();
		ch.openincognito();
		
		
	}

}
