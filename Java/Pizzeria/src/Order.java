import java.util.ArrayList;
import java.util.List;

public class Order {
	
	private List<Cake> orderList = new ArrayList<>();
	private double totalCost = 0;
	private boolean takeaway = false;
	
	public void setDelivery() {
		takeaway = true;
	}
	
	public void addCakeToCart(Cake cake) {
		orderList.add(cake);
		totalCost += cake.getPrice();
	}
	
	public void Checkout() {
		System.out.println();
		System.out.println("Your order:");
		for (Cake cake : orderList) {
			System.out.println(cake.getName() + ", " + cake.getSize() + ", " + cake.getPrice() + " PLN");
		}
		if (takeaway) {
			System.out.println("+ cost of delivery 15 PLN");
			totalCost += 15;
		}
		System.out.println("Total cost: " + totalCost + " PLN");
	}
}
