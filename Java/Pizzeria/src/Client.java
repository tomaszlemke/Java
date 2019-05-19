	import java.util.Scanner;

	public class Client {
		
		private String name;
		private String surname;
		private String phone;
		private boolean delivery;
		private String address;
		private boolean isValidPhoneNumber;
		Scanner scan = new Scanner(System.in);
		
		public boolean isDelivery() {
			return delivery;
		}
		
		public Client() {
			System.out.print("Name: ");
			name = scan.nextLine();
			System.out.print("Surname: ");
			surname = scan.nextLine();
			
			do {
			System.out.print("Phone number: ");
			phone = scan.nextLine();
			
			} while ( isValidPhoneNumber(phone)== false);
			
			 
			System.out.print("Delivery (+15 ZL): (Y/N)? ");
			delivery = (scan.nextLine().toUpperCase().equals("Y")) ? true : false;
			if (delivery) {
				System.out.print("Address: ");
				address = scan.nextLine();
			}
			
			System.out.println();
		}
		
		public boolean isValidPhoneNumber(String phone) {
		     
	        if (null == phone || phone.length() != 9) {
	        	System.out.println("Incorrect phone. Please try again");
	        	return false;
	        }
	           
	        for (char c : phone.toCharArray()) {
	            if (!Character.isDigit(c)) {
	            	System.out.println("Incorrect phone. Please try again");
	                return false;
	            }
	        }
	        return true;
	    }
		
	}
	
