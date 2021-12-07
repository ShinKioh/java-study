package example;

public class GravityCalculator {

	public static void main(String[] args) {
		
		double time = 5.0;
		double gravity = -9.81;
		double initialVelocity = 0.0;
		double initialPosition = 1000.0;
		
		double finalPosition = 0.0;
		
		finalPosition = (gravity*time*time)/2 + initialVelocity*time + initialPosition;
		
		System.out.printf("%.2f초 후 위치 : %.2fm\n", time, finalPosition);

	}

}
