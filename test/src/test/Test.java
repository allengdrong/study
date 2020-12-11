package test;

public class Test {
	public static void main(String[] args) {
		double a = 10.32567823;
		float b = 656.123472358F;
			
		System.out.println(add(a, b));						
	}
	
	static double add(double a, float b) {
		return a % b; // rest
	}
	
}
