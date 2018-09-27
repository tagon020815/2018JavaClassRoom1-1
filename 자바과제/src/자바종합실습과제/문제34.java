package 자바종합실습과제;

import java.util.Scanner;

public class 문제34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for(int i = 1;i<=n;i++) {
			sum+=i;
			System.out.printf(sum+" ");
		}
		System.out.println();
		System.out.println(n+"번째수"+sum);
	}

}
