
public class LinearEquation {
	
	private double a = 0;
	private double b = 0;
	private double c = 0;
	private double d = 0;
	private double e = 0;
	private double f = 0; 
	
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
	public double getD() {
		return d;
	}
	public double getE() {
		return e;
	}
	public double getF() {
		return f;
	}
	
	public LinearEquation() {}
	
	public LinearEquation(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}
	
	public boolean isSolvable() {
		return (a * d) - (b * c) != 0;
	}
	
	public double getX() {
		return ((e * d) - (b * f)) / ((a * d) - (b * c));
	}
	
	public double getY() {
		return ((a * f) - (e * c)) / ((a * d) - (b * c));
	}

}
