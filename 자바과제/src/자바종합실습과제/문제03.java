package 자바종합실습과제;

import java.util.Scanner;

public class 문제03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("섭씨온도(C):");
		int a = sc.nextInt();
		System.out.printf("화씨온도(F):%.2f도",a * 1.8 + 32);
	}

}
