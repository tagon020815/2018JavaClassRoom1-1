package 자바종합실습과제;

import java.util.Scanner;

public class 문제32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		while (true) {
			sum += n % 10;
			n = n / 10;
			if (n < 10) {
				sum = sum + n;
				break;
		}
			
	}
		System.out.println("결과:" + sum);
	}
}
