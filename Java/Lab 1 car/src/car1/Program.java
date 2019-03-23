package car1;

public class Program {

	public static void main(String[] args) {
		
		Car car = new Car("BMW", true,0,100000.99);
		car.printCar();
		System.out.println("===> zmieniam wartosci");
		
		car.setmileage(100);
		
		System.out.println("Nowy przebieg: " + car.getmileage());
		
		
	}

}
