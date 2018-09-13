package 자바종합실습과제;

import java.util.Scanner;

public class 문제11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\r|\n|,| ");
		int x1, x2, y1, y2, r1, r2;
		System.out.print("원(x1,y1,r1):");
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		r1 = sc.nextInt();
		sc.nextLine();
		System.out.print("원(x2,y2,r2):");
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		r2 = sc.nextInt();
		System.out.print("판정:");

		int q = (int) Math.pow(x2 - x1, 2) + (int) Math.pow(y2 - y1, 2);
		int d = (int) Math.pow(q, 0.5);
		if (d > (r1 + r2))
			System.out.println("곂침");
		else if (d == (r1 + r2))
			System.out.println("접함");
		else
			System.out.println("곂치지 않음");
	}

}
