package discounts;

import shopcart.Cart;
import shopcart.CartItem;
import shopcart.Product;

public class  FreeCupDiscount implements ICanApplyDiscount {

	public boolean canApplyDiscount(Cart cart) {
		return cart.totalPriceofProducts()>200;
	}
	
	public void applyDiscount(Cart cart) {
		Product cup = new Product();
		cup.setName("Extra Cup");
		cup.setPrice(0);
		
		cart.getItems().add(new CartItem(cup));				
	}
}
