public class TestLinearFunction {

	public static void main(String[] args) {
		LinearFunction f1 = new LinearFunction(1, 0);
		LinearFunction f2 = new LinearFunction(2, 1);
		LinearFunction f3 = new LinearFunction(2, 3);
		LinearFunction f4 = new LinearFunction(0, 4);

		double fx1 = 0;
		double fx2 = 0;
		double fx3 = 0;
		double fx4 = 0;

		// Test for ContainsPoint
		System.out.println("Does f1 contain (4|4)? --> " + f1.containsPoint(4, 4)); // true
		System.out.println("Does f2 contain (4|4)? --> " + f2.containsPoint(4, 4)); // false
		System.out.println("Does f3 contain (4|4)? --> " + f3.containsPoint(4, 4)); // false
		System.out.println("Does f4 contain (4|4)? --> " + f4.containsPoint(4, 4)); // true
		System.out.println();

		// Test for isParallelToAxis
		System.out.println("Is f1 parallel to the x axis? --> " + f1.isParallelToAxis()); // false
		System.out.println("Is f2 parallel to the x axis? --> " + f2.isParallelToAxis()); // false
		System.out.println("Is f3 parallel to the x axis? --> " + f3.isParallelToAxis()); // false
		System.out.println("Is f4 parallel to the x axis? --> " + f4.isParallelToAxis()); // true
		System.out.println();

		// Test for isParallelTo
		System.out.println("Is f1 parallel to f3? --> " + f1.isParallelTo(f3)); // false
		System.out.println("Is f2 parallel to f3? --> " + f2.isParallelTo(f3)); // true
		System.out.println("Is f3 parallel to f3? --> " + f3.isParallelTo(f3)); // true
		System.out.println("Is f4 parallel to f3? --> " + f4.isParallelTo(f3)); // false
		System.out.println();

		// Calculate fx from 0 to 9 and print results
		for(int i = 0; i < 10; i++) {
			fx1 = f1.getFxtoX(i);
			fx2 = f2.getFxtoX(i);
			fx3 = f3.getFxtoX(i);
			fx4 = f4.getFxtoX(i);

			System.out.println("------------");
			System.out.println(fx1);
			System.out.println(fx2);
			System.out.println(fx3);
			System.out.println(fx4);
			System.out.println("------------");
		}
	}
}

class LinearFunction {

	public double a;
	public double b;

	public LinearFunction() {
		a = 0;
		b = 0;
	}

	public LinearFunction(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public double getA() { return a; }
	public double getB() { return b; }

	public double getFxtoX(double x) {
		return a*x + b;
	}

	public double getXtoFx(double fx) {
		return (fx - b) / a;
	}

	public boolean containsPoint(double x, double fx) {
		double calculatedFx = getFxtoX(x);
		return calculatedFx == fx;
	}

	public boolean isParallelToAxis() {
		return a == 0;
	}

	public boolean isParallelTo(LinearFunction otherLinearFunction) {
		return a == otherLinearFunction.getA();
	}
}