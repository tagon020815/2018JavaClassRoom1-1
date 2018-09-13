package 자바종합실습과제;

import java.util.Scanner;

public class 문제05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("시간(초)");
		int a = sc.nextInt();
		System.out.printf("%02d시간" + "%02d분" + "%02d초", a / 3600, a % 3600 / 60, a % 3600 % 60);
	}

}
