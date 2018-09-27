package 자바종합실습과제;

import java.util.Scanner;

public class 문제28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				a++;
			break;
		}
		if (a == 0)
			System.out.println("소수");
		else
			System.out.println("합성수");
	}

}
