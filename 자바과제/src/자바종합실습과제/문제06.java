package 자바종합실습과제;

import java.security.Principal;

public class 문제06 {

	public static void main(String[] args) {
		long a = 1;
		a = a << 63;
		System.out.print(a + "~" + (a - 1));
	}

}
