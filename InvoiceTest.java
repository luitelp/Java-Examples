//testing invoice class

public class InvoiceTest {
	public static void main (String [] args) {
		Invoice myinvoice1= new Invoice ("1234", "hammer", 10, 5);
		Invoice myinvoice2= new Invoice ("4567", "brush", 15, -5);
		
		//display initial values of myinvoice1
		
		System.out.printf("Part number of myinvoice1 is: %s%n",
		myinvoice1.getPartNumber());
		System.out.printf ("Part description of myinvoice1 is: %s%n",
		myinvoice1.getPartDescription());
		System.out.printf ("The quantity of myinvoice1 is: %d%n",
		myinvoice1.getQuantity());
		System.out.printf ("The price per item of myinvoice1 is: %f%n",
		myinvoice1.getpricePerItem());
		System.out.printf("The invoice amount of myinvoice1 is: %f%n",
		myinvoice1.getInvoiceAmount ());

	//display initial values of myinvoice2
	System.out.printf ("The quantity of myinvoice2 is: %d%n",
	
	