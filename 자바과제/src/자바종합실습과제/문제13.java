package 자바종합실습과제;

import java.util.Scanner;

public class 문제13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("직원코드: ");
		String a = sc.nextLine();
		char b = a.charAt(3);
		System.out.print("부서: ");
		if (b == '3')
			System.out.println("영업부");
		else if (b == '2')
			System.out.println("인사부");
		else
			System.out.println("총무부");
	}

}
