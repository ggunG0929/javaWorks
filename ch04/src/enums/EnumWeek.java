package enums;

import java.util.Calendar;

public class EnumWeek {		// '혼자 공부하는 자바' 페이지

	public static void main(String[] args) {
		Week today = null;	// 객체 자료형은 null로 초기화
		
		Calendar cal = Calendar.getInstance();
		
//		System.out.println(cal.get(Calendar.YEAR));
		int day = cal.get(Calendar.DAY_OF_WEEK);
		// 1-일 2-월 3-화 4-수 5-목 6-금 7-토
//		System.out.println(day-1);
		
		
//		switch(day) {
//		case 1:
//			today = Week.SUNDAY; break;
//		case 2:
//			today = Week.MONDAY; break;
//		case 3:
//			today = Week.TUESDAY; break;
//		case 4:
//			today = Week.WEDNESDAY; break;
//		case 5:
//			today = Week.THURSDAY; break;
//		case 6:
//			today = Week.FRIDAY; break;
//		case 7:
//			today = Week.SATURDAY; break;
//		}
//		System.out.println("Today is " + today);
		
		switch(day) {
		case 1:
			today = Week.일; break;
		case 2:
			today = Week.월; break;
		case 3:
			today = Week.화; break;
		case 4:
			today = Week.수; break;
		case 5:
			today = Week.목; break;
		case 6:
			today = Week.금; break;
		case 7:
			today = Week.토; break;
		}
		System.out.println("오늘은 " + today + "요일입니다.");
	}

}
