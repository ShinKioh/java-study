package throwing_runtime_exception;

public class Thermostat {
	// runtime 예외는 예외처리를 하지 않아도 된다.
	public void setTemperature(double temperature) throws Exception {
		
		if (temperature < 0 || temperature > 35) {
			throw new RuntimeException("온도가 비정상 입니다."); // 새 예외를 생성
		}
		
		System.out.println("온도 세팅 :" + temperature);
	}

}
