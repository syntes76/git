package serializacjaZadanie;

public class Employee extends Person {

	public double sallary;
	
	
	public double getSallary() {
		return sallary;
	}


	public void setSallary(double sallary) {
		this.sallary = sallary;
	}


	public Employee(String firstName, String lastName, double sallary) {
		super(firstName, lastName);
		setSallary(sallary);
		
	}


}
