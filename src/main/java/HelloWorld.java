

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println(args.length);
		for (String arg : args) {
			System.out.println(arg);
		}
		LocalDate date = LocalDate.now(); 
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
		String text = date.format(formatter);
		LocalDate parsedDate = LocalDate.parse(text, formatter);
		System.out.println(parsedDate); 
		
		double pi = Math.PI;
	    System.out.format("%f%n", pi);
	    System.out.format("%.8f%n", pi);
	    System.out.format("%10.3f%n", pi);
	    System.out.format("%-10.3f%n", pi);
	    System.out.format(Locale.GERMAN, "%-10.4f%n%n", pi);
	    
	    Calendar c = Calendar.getInstance();
	    System.out.format("%tB %te, %tY%n", c, c, c);
	    System.out.format("%tl:%tM %tp%n", c, c, c);
	    System.out.format("%tD%n", c);
	    
	    long n = 461012;
	    System.out.format("\n%d%n", n);
	    System.out.format("%08d%n", n);
	    System.out.format("%+8d%n", n);
	    System.out.format("%,8d%n", n);
	    System.out.format("%+,8d%n%n", n);
		
		
		
//		System.out.println("test");
//		test();
		
		String name = " Andreas    "; 
		System.out.println(name.trim() + "___");

	}

	private static void test() {
		System.out.println("testx");
	}

}
