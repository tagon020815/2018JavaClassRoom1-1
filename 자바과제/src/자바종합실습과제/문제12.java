package 자바종합실습과제;

import java.util.Scanner;

public class 문제12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두과목:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.print("결과: ");
		if(((a+b)/2)==60&&a>40&&b>40)
			System.out.println("합격");
		else if ((a+b)/2<60)
			System.out.println("불합격");
		else
			System.out.println("불합격(과락)");

	}

}
