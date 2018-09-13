package 자바종합실습과제;

import java.util.Scanner;

public class 문제08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수:");
		int a = sc.nextInt();
		System.out.printf("절댓값:" + (a > 0 ? a : -a));
	}

}
