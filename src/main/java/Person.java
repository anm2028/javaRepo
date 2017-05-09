

public class Person {
	
	final String firstName; 
	final String lastName; 
	final String age; 


	public Person(String firstName, String lastName, String age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public void print () {
		
		System.out.println("firstName = " + firstName);
		System.out.println("lastName = " + lastName);
		System.out.println("age = " + age);
	}
	
	
	public String getFirstName() {
		return firstName;
	}
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
	public String getLastName() {
		return lastName;
	}
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
	public String getAge() {
		return age;
	}
//	public void setAge(String age) {
//		this.age = age;
//	}
	
	public String getFullName () {
		return this.firstName + " " + this.getLastName(); 
	}

	//@Override
	public String toString() {
		
		return new StringBuffer()
		.append("firstName = ")
		.append(this.firstName)
		.append("lastName = ")
		.append("age = ")
		.toString(); 
		//return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}
	
	

} // end class Person :)
