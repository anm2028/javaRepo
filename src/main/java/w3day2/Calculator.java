package w3day2;


public class Calculator {

	private double result = 0;

	public double getResult() {
		return this.result;
	}

	public void add(double x) {
		this.result += x;
	}

	public void subtract(double x) {
		this.result -= x;
	}

	public void multiply(double x) {
		this.result *= x;
	}

	public void divide(double x) {
		this.result /= x;
	}

	public void clear() {
		this.result = 0;
	}

}
