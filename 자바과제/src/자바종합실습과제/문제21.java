package 자바종합실습과제;

import java.util.Scanner;

public class 문제21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++)
			sum += i * i;
		System.out.printf("결과: " + sum);
	}

}
