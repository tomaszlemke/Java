
public class Program {


	public static void main(String[] args) {
		
		System.out.println("Welcome to the best Cake Factory in Gdynia");
		System.out.println("Can I take your order? ");
		Client client = new Client();
		Order order = new Order();
		CakeFactory factory = new CakeFactory();
		CakeStore store = new CakeStore(factory, client, order);
		
		store.showMenu();
		store.makeOrder();
	}
}