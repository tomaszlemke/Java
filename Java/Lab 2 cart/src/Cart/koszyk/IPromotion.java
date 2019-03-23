package Cart.koszyk;

public interface IPromotion {
	boolean CanCalculate(Cart cart);
	void CalculateOffer(Cart cart);
}
