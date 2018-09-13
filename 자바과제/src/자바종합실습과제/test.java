package 자바종합실습과제;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("자연수: ");
        System.out.println("변환결과: "+Integer.toString(sc.nextInt(), sc.nextInt())
                .toUpperCase());
    }
}
