package day11;

public class CheckoutTest {

	public static void main(String[] args) {
		Checkout checkout = new Checkout();
		int cash = 100;
		checkout.submit(cash);
		
		checkout.submit(cash, "1111-2222-3333-4444");
		
		checkout.submit(cash, 123456789);
		
		checkout.submit();

	}

}
