package ch05.pac03;

import java.util.Calendar;

public class EnumerationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumWeek today = null;
		System.out.println("today : " + today);

		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("week : " + week);

		switch (week) {
		case 1:
			today = EnumWeek.SUNDAY;
			break;
		case 2:
			today = EnumWeek.MONDAY;
			break;
		case 3:
			today = EnumWeek.TUESDAY;
			break;
		case 4:
			today = EnumWeek.WEDNESDAY;
			break;
		case 5:
			today = EnumWeek.THURSDAY;
			break;
		case 6:
			today = EnumWeek.FRIDAY;
			break;
		case 7:
			today = EnumWeek.SATURDAY;
			break;
		}
		System.out.println("Today : " + today);
		
		if (today == EnumWeek.SUNDAY) {
			System.out.println("오늘은 쉽니다.");
		} else {
			System.out.println("오늘은 자바 공부를 합니다.");
		}

		
	}

}
