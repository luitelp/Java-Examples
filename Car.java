import java.text.DecimalFormat;
//creating subclass Car
class Car extends Vehicle {
    
	//instance variable
	private double GasGallon;
    
	//constructor
	public Car(double gallons) {
        this.GasGallon = gallons;
    }
    public void GetCarbonFootprint() {
    	DecimalFormat formatter = new DecimalFormat("##.00");
        System.out.println("Car that has used " + formatter.format(GasGallon) + " gallons of gas: " + formatter.format((GasGallon*20)));
    }
}//end class