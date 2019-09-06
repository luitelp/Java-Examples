//creating AutoPolicy
public class AutoPolicy{
	
	private int accountNumber; //policy number
	private String makeAndModel;
	private String state;//three instance variables
	
	//constructor
	
	public AutoPolicy (int accountNumber, String makeAndModel,
	String state){
		
		this.accountNumber=accountNumber;
		this.makeAndModel=makeAndModel;
		this.state=state;
	}//end constructor
	
	//set and get methods for accountNumber
	
	public void setAccountNumber (int accountNumber) {
	this.accountNumber=accountNumber; }
	
	public int getAccountNumber () {
		return accountNumber;
	}
	//set and get methods for makeAndModel
	
	public void setMakeAndModel (String makeAndModel) {
		this.makeAndModel=makeAndModel;
	}
	public String getMakeAndModel () {
		return makeAndModel;
	}
	//set and get methodsfor state
	
	public void setState (String state) {
		this.state=state;
	}
	public String getState () {
	return state; }
	
	//determine whether state has no-fault insurance
	
	public boolean isNoFaultState() {
		boolean noFaultState;
		
		//determine
		switch (getState()) {
			case "MA":
			case "NJ":
			case "PA":
			noFaultState=true;
			break;
			
			default:
			noFaultState=false;
		break; }
		
		return noFaultState;
	}//end method
}//end class
			
		