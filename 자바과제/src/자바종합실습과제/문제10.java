package 자바종합실습과제;

import java.util.Scanner;

public class 문제10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호:");
		String a = sc.nextLine();
		if (a.charAt(7) == '3')
			System.out.println("남자");
		else
			System.out.println("여자");
	}

}
