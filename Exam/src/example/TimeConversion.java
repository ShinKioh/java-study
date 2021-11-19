package example;

public class TimeConversion {

	public static void main(String[] args) {
		
		int totalSec = 7582;
		int hour = totalSec / (60*60) ; 
		int min = totalSec/60 -  (hour*60) ;
		int sec = totalSec % 60 ;
		
		System.out.printf("7582초는 " + hour + "시간 " + min + "분 " + sec + "초");

	}

}
