//creating Employee
public class Employee {
     
    private String firstName; //first name
    private String lastName; //last name
    private double monthlySalary;//salary
 
    //constructor
    public Employee(String name, String name2, double salary) {
        firstName = name;
        lastName = name2;
        monthlySalary = salary;
    }//end constructor
	
	//method to set first name
    public void setFirstName(String name) {
        firstName = name;
    }
	//method to get last name
    public String getFirstName() {
        return firstName;
    }
	//method to set last name
    public void setLastName(String name) {
        lastName = name;
    }
	//method to get last name
    public String getLastName() {
        return lastName;
    }
	//method to set monthly salary
    public void setmonthlySalary(double salary) {
        monthlySalary = salary;
    }
	//method to get monthly salary
    public double getmonthlySalary() {
        return monthlySalary;
    }
	//set yearly salary
    public double yearlySalary() {
        double yearlySalary;
        yearlySalary = (monthlySalary * 12);
        return yearlySalary;
    }
	//set increase in salary
    public double yearlySalaryIncrease() {
        double yearlySalaryIncrease;
        yearlySalaryIncrease = (((yearlySalary() * (0.1)) + yearlySalary()));
        return yearlySalaryIncrease;
    }
	//method to display employee information to the user
    public void displayYearlySalary() {
        System.out.printf("%s %s's Yearly Salary is $%.2f\n", firstName, lastName,
           yearlySalary());
    }
 
    public void displayYearlySalaryIncrease() {
        System.out.printf("%s %s = $%.2f\n", firstName, lastName, yearlySalaryIncrease());
    }//end main
 
}//end class