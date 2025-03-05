package week2.day4;

public class JavaConnection extends SqlConnection{

	public static void main(String[] args) {
		JavaConnection jc = new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeupdate();
	}

	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("DB disconnected");
		
	}

	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("DB connection is secure");
		
	}

	public void executeupdate() {

		System.out.println("COncrete class");
	}

}
