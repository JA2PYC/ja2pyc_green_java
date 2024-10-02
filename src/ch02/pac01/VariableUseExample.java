package ch02.pac01;

public class VariableUseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간" + minute + "분");

		int totalMinute = (hour * 60) + minute;
		System.out.println("총" + totalMinute + "분");

		int x = 3;
		int y = 5;
		System.out.println("X : " + x + ", Y : " + y);

		int temp = x;
		x = y;
		y = temp;
		System.out.println("X : " + x + ", Y : " + y);
	}

}
