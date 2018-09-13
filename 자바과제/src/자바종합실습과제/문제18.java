package 자바종합실습과제;

import java.util.Scanner;

public class 문제18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳 한 글자: ");
		String a = sc.next();
		char b = a.charAt(0);
		for (int i = b; i <= 90; i++)
			System.out.printf("%c ", i);
	}

}
