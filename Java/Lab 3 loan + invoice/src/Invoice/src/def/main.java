package Invoice.src.def;

import Invoice.src.model.*;


public class main {

	public static void main(String[] args) {
	
		/*
		 * Product product = new Product("ABC123", "TV", 1000);
		 * 
		 * InvoicePosition position = new InvoicePosition(product); Invoice invoice =
		 * new Invoice(); invoice.addPosition(position); printoutInvoice(invoice);
		 * position.getNettoPrice();
		 */
		
		/*System.out.println("Stawka VAT: " + InvoicePosition.TAX_5);
		System.out.println("Stawka VAT: " + InvoicePosition.TAX_8);
		System.out.println("Stawka VAT: " + InvoicePosition.TAX_23);*/
		
		/*System.out.println("Code: " + product.getCode());
		System.out.println("Name: " + product.getName());
		System.out.println("Price: " + product.getPrice());*/
	
		Invoice invoice = new Invoice();
		invoice.addPosition(new Product("ABC123", "TV",1000));
		invoice.addPosition(new Product("ABC123", "TV",1000));
		invoice.addPosition(new Product("CBA321", "Radio",500));
		invoice.addPosition(new Product("ABC123", "TV",1000));
		invoice.addPosition(new Product("CBA321", "Radio",500));
		printoutInvoice(invoice);
	
	
	}
	
	
	private static void printoutInvoice(Invoice invoice){
		System.out.println("|NAZWA\t|ILOSC\t|CENA NETTO\t|CENA BRUTTO\t|STAWKA VAT\t|PODATEK");
		System.out.println("******************************************************************");
		for (InvoicePosition p: invoice.getPosition()){
			System.out.print("|" + p.getProduct().getName()+ "\t|");
			System.out.print(p.getCount() + "\t|");
			System.out.print(p.getNettoPrice() + "\t\t|");
			System.out.print(p.getGrossPrice() + "\t\t|");
			System.out.print(p.getTax() + "\t\t|");
			System.out.println(p.getTaxValue());
			System.out.println("-------------------------------------------------------------------");
		}
	}
	
}
