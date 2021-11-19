package example;

public class SpeedConversion {

	public static void main(String[] args) {
		
		double meter = 100;
		double sec = 18;
		
		double ms = meter/sec;
		
		double sisok = ms*3600;
		
		System.out.println(sisok/1000 + " km/h");

	}

}
