package 자바종합실습과제;

public class 문제23 {

	public static void main(String[] args) {
		int su = 0;
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				su++;
				sum += i;
			}
		}
		System.out.println("갯수: " + su);
		System.out.println("합계: " + sum);
	}

}
