package Backjoon;

import java.util.Calendar;

public class day28 {

	public static void main(String[] args) {
		// 요일은 1부터 시작하기 때문에, DAY_OF_WEEK[0]은 비워둔다.
		final String[] DAY_OF_WEEK = {"", "일","월","화","수","목","금","토"};
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		

		// month의 경우 0부터 시작하기 때문에 8월인 경우, 7로 지정해야 한다.
		date1.set(2015, 7, 15);
		System.out.println("date1은 " + toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "요일이고,");
		System.out.println("오늘(date2)는 " + toString(date2) + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "요일입니다.");
	}

	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1) + "월 " + date.get(Calendar.DATE) + "일 ";
	}
	
}
