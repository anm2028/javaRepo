package w3day2;

public class BmiService {
	
	public double calculate(double weight, double height) {
		System.out.println(weight / (height * height));
		return weight / (height * height);
	}

}
