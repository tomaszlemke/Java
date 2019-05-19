import java.util.Scanner;

public class CakeStore {
	
	private CakeFactory factory;
	private Client client;
	private Order order;
	
	Scanner scan = new Scanner(System.in);
	
	public CakeStore(CakeFactory factory, Client client, Order order) {
		this.factory = factory;
		this.client  = client;
		this.order   = order;
	}
	
	public void showMenu() {
		System.out.println("Menu: ");
		System.out.println(factory.createCake(1, 0));
		System.out.println(factory.createCake(2, 0));
		System.out.println(factory.createCake(3, 0));
	}
	
	public void makeOrder() {
		int cake_id;
		int cake_size;
		boolean order_complete;
		
		if (client.isDelivery()) order.setDelivery();
		System.out.println();
		
		do {
			System.out.print("What would you like to order? Type cake id: ");
			while (!scan.hasNextInt() || scan.nextInt()<0 || scan.nextInt()>3) {
				System.out.print("Not on the menu! Type cake id: ");
				scan.next();
			}
			cake_id = scan.nextInt();
//			
			System.out.print("Which size (1. small(0.5 kg), 2. medium(1 kg), 3. big(1.5 kg))? ");
			while (!scan.hasNextInt()|| scan.nextInt()<0 || scan.nextInt()>3) {
				System.out.print("Not on the menu! Type cake size: ");
				scan.next();
			}
			cake_size = scan.nextInt();
			
			orderCake(cake_id, cake_size);
			
			System.out.print("Do you want anything else (Y/N)? ");
			order_complete = (scan.next().toUpperCase().equals("Y")) ? false : true;
		} while (!order_complete);
		order.Checkout();
	}
	
	private void orderCake(int id, int size) {
		Cake cake;
		cake = factory.createCake(id, size);
		order.addCakeToCart(cake);
	}
}
