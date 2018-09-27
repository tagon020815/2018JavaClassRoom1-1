package 자바종합실습과제;

public class 문제27 {

	public static void main(String[] args) {
		for (int i = 1; i <= 30; i++) {
			if(Integer.toString(i).contains("3")||Integer.toString(i).contains("6")||Integer.toString(i).contains("9")) {
				System.out.println(i+"짝");continue;}
			System.out.println(i);
		}
	}

}
