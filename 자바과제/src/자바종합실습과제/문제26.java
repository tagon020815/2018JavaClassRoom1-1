package 자바종합실습과제;

import java.util.Scanner;

public class 문제26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int su = 1;
		for (int i = 1; i <= n; i++) {
			su *= i;
			System.out.print(su + "  ");
			sum += su;
		}
		System.out.println();
		System.out.println(sum);
	}

}
