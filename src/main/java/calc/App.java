package calc;

public class App {

	public App() {
	}

	public int add(int a, int b) {
		/*
		 * System.out.println("In Add method of app"); return a+b;
		 */
		return 0;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public int mul(int a, int b) {
		return a * b;
	}

	public int div(int a, int b) {
		if (b == 0) {
			return 0;
		} else {
			return a / b;
		}
	}

	public Object Square(int a) {
		return a * a;
	}

	public Object fact(int a) {
		return a * (a - 1);
	}

	public int sqrt(int a) {
		int b = (int) Math.sqrt(a);
		System.out.println("sqrt is" + b);
		return (int) Math.sqrt(a);
	}

	public int remaind(int a, int b) {
		return a%b;
	}
}
