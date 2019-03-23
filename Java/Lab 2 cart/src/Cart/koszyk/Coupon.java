package Cart.koszyk;

public class Coupon implements IPromotion{

	@Override
	public boolean CanCalculate(Cart cart) {
		double koszykBrutto = cart.totalPriceOfProducts();
		if (koszykBrutto >= 100)
			return true;
		else
			return false;
	}

	boolean couponAdded(Cart cart) {
		boolean itIs = false;
		for(CartItem it : cart.getItems()) {
			if (it.getProduct().getName().equals("Kupon zniżkowy 50%")) {
				itIs = true;
			}
		}
		return itIs;
	}
	
	@Override
	public void CalculateOffer(Cart cart) {
		if (this.CanCalculate(cart) && !this.couponAdded(cart))
			cart.addProduct(new Product("Kupon zniżkowy 50%",0));
		
	}

	@Override
	public String toString() {
		return "Coupon [Kupon zniżkowy 50%]";
	}
	
}
