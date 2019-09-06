//creating an invoice class

public class Invoice {
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem; //instance variables
	
	//constructor
	public Invoice (String partNumber, String partDescription,
int quantity, double pricePerItem) {
	
	this.partNumber=partNumber;
	this.partDescription=partDescription;
	
	//validate quantity
	if (quantity > 0) {
		this.quantity=quantity;
	}//end if
	
	//validate pricePerItem
	if (pricePerItem>0.0) {
		this.pricePerItem=pricePerItem;
	}//endif
}//end constructor

//set and get methods for partNumber
public void setPartNumber (String partNumber) {
	this.partNumber=partNumber;
}//end set method

public String getPartNumber () {
	return partNumber;
}//end get method

//set and get methods for partDescription
public void setPartDescription (String partDescription) {
	this.partDescription=partDescription;
}//end set method

public String getPartDescription () {
	return partDescription;
}//end get method

//set and get methods for quantity
public void setQuantity (int quantity) {
	//validate quantity
	if (quantity >0) {
		this.quantity=quantity;
	}//end if
	if (quantity <0) {
		this.quantity= 0;
	}//end if
}//end of set method

public int getQuantity () {
	return quantity;
}//end get method

//set and get methods for pricePerItem
public void setPricePerItem (double pricePerItem) {
	//validate pricePerItem
	if (pricePerItem > 0.0) {
		this.pricePerItem=pricePerItem;
	}//end if
	if (pricePerItem < 0.0) {
		pricePerItem=0;
	}//end if
}//end set method

public double getpricePerItem() {
	return pricePerItem;
}//end get method

//calculate and return invoice amount
public double getInvoiceAmount () {
	return getpricePerItem() * getQuantity();
}//end method

}//end class