package week2.day3;



public class Browser {
	
	String Browsername;
	String BrowserVersion;
	
/*public void About() {
	System.out.println("Browsername");
	System.out.println("BrowserVersion");*/
	

	
	public void OpenURL() {
		System.out.println("URL is launched");

	}
	public void CloseBrowser() {
		System.out.println("URL is closed");
	}
		
	public static void main(String[] args) {
  
		Browser br= new Browser();
		
		
		br.OpenURL();
		br.CloseBrowser();
		
		
		
		
	}}



		



