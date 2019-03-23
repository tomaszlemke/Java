package car1;

public class Car {
	String brand;
	boolean isNew;
	int mileage;
	double price;
	
	void printCar() {
		System.out.println("Marka: "+ brand);
		System.out.println("Nowy: "+ isNew);
		System.out.println("Przebieg: "+ mileage);
		System.out.println("Cena: "+ price);
	}
	
	Car(){
		System.out.println("Inicjacja z nowego konstruktora");
	}
	
	Car (String brand){
		this();
		this.brand=brand;
	}
	
	Car(String brand, boolean isNew, int milage, double price){
		this(brand);
		this.isNew = isNew;
		this.mileage = milage;
		this.price = price;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public boolean isNew() {
		return isNew;
		
	}
	
	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}
	
	public int getmileage() {
		return mileage;
	}
	
	public void setmileage(int mileage) {
		this.mileage = mileage;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price ) {
		this.price = price;
	}
	
}

