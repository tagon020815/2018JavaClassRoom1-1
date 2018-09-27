package 자바종합실습과제;

import java.util.Scanner;

public class 문제20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호 12자리: ");
		String a = sc.next();
		char b[] = a.toCharArray();
		int s = 0;
		for (int i = 0; i <= 11; i++) {
			s = s + (b[i] - '0') * (2 + i % 8);
		}
		int t = s % 11;
		int th = (11 - t) % 10;
		System.out.println("13번째수:" + th);

	}

}
