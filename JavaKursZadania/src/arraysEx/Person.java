package arraysEx;

public class Person {

	private String firstName;
	private String lastName;
	private String personalNo;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPersonalNo() {
		return personalNo;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setPersonalNo(String personalNo) {
		this.personalNo = personalNo;
	}

	public Person(String firstName, String lastName, String personalNo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.personalNo = personalNo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((personalNo == null) ? 0 : personalNo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (personalNo == null) {
			if (other.personalNo != null)
				return false;
		} else if (!personalNo.equals(other.personalNo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", personalNo=" + personalNo + "]";
	}
	
	
	

}
