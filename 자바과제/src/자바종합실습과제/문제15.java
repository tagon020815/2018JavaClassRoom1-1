package 자바종합실습과제;

import java.util.Scanner;

public class 문제15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("프로점수: ");
		int a = sc.nextInt();
		int b = a / 10;
		System.out.print("등급: ");
		switch (b) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("E");
			break;
		}

	}

}
