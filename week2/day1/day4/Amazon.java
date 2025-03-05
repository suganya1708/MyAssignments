package week2.day4;

public class Amazon extends CanaraBank {

	



	@Override
	public void CashonDelivery() {

		System.out.println("COD acccepted");
	}

	@Override
	public void upiPayments() {
		// TODO Auto-generated method stub
		System.out.println("UPI acccepted");
	}

	@Override
	public void cardPayments() {
		// TODO Auto-generated method stub
		System.out.println("UPI acccepted");
		
	}

	@Override
	public void internetBanking() {
		// TODO Auto-generated method stub
		System.out.println("IB acccepted");
		
	}

	@Override
	public void recordPyamentDetails() {
		// TODO Auto-generated method stub
		System.out.println("record listed");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amazon a = new Amazon();
		a.cardPayments();
		a.CashonDelivery();
		a.upiPayments();
		a.internetBanking();
		a.recordPyamentDetails();

}
}
