package 자바종합실습과제;

import java.util.Scanner;

public class 문제31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] pn = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			System.out.printf("%c",pn[i]-3);
			
		}

	}

}
