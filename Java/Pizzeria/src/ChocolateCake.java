public class ChocolateCake extends Cake {
	public ChocolateCake() {
		setId(1);
		setName("Chocolate Cake");
		addIngredient("Sponge cake base");
		addIngredient("Chocolate Bits");
		addIngredient("Chocolate Glaze");
		addIngredient("Chocolate Cream");
		setSweetness(5);
		setPrice(18, 25, 32);
	}
}