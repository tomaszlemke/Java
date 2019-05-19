public class CakeFactory {
	
	public Cake createCake(int id, int size) {
		Cake cake = null;
		
		//do {
		
		switch (id) {
		case 1:
			cake = new ChocolateCake();
			break;
		case 2:
			cake = new LemonCake();
			break;
		case 3:
			cake = new StrawberryCake();
			break;
		default: System.out.println("Not on the menu");
			break;
		}
		//}while(id > 0 && id < 4 );
		
		cake.setSize(size);
		return cake;
	}
}