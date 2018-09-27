package 자바종합실습과제;

import java.util.Scanner;

public class 문제45 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		int i, j;

		for (i = 0; i < arr.length; i++)
			for (j = 0; j < arr[i].length; j++)
				arr[i][j] = 0;

		for (i = 0; i < arr.length; i++)
			for (j = 0; j < arr[i].length; j++)
				if (j == 0 || i == j)
					arr[i][j] = 1;
				else if (i > j)
					arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];

		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr[i].length; j++)
				if (arr[i][j] > 0)
					System.out.printf("%3d ", arr[i][j]);
			System.out.println();
		}

	}

}
