package 자바종합실습과제;

import java.util.Scanner;

public class 문제14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("월 : ");
		int a = sc.nextInt();
		int d;
		switch (a) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			d = 31;

			break;
		case 4:
		case 6:
		case 9:
		case 11:
			d = 30;

			break;

		default:
			d = 29;
			break;
		}
		System.out.print(a + "월의 마지막 날은" + d + "일 입니다.");
	}

}
