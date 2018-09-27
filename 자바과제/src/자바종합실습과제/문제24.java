package 자바종합실습과제;

public class 문제24 {

	public static void main(String[] args) {
		for(int i=32;i<=127;i++) {
			for(int j = 1;j<=10;j++) {
				System.out.printf(i+" %c  ",i);
				i++;
				}
			System.out.println();
		}
		
	}

}
