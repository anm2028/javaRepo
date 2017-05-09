

import java.time.LocalDate;
import java.util.Scanner;

public class PersonMain {
	
	public static void printPeople(Person... p) {
		for (Person person : p) {
			System.out.println("in printPerson: " + person);
		}
	}

	public static void main(String[] args) {
		//LocalDate.now(); 
		Person person = new Person("Andreas", "Munz", "32");
		Person person2 = new Person("Mutschli", "Pferd", "12");
		//MathUtils mu = new MathUtils(); 
		printPeople(person, person2);
		
		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("firstName = " + person.getFirstName());
//		System.out.println("lastName = " + person.getLastName());
//		System.out.println("age = " + person.getAge());

		System.out.println(person);
		System.out.println(person.getFullName());
		System.out.println("squared: " + MathUtils.squared(8));
		
		System.out.println("PI = " + MathUtils.PI);
		// person2.print();
		// System.out.println(person2.toString());

	}


}
