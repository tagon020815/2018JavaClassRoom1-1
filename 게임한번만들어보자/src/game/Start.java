package game;

import java.util.Random;
import java.util.Scanner;

public class Start {
	static Random ran = new Random();
	static Scanner sc = new Scanner(System.in);
	static int time = 0;
	public static void main(String[] args) {
		System.out.println("start를 입력하여 게임시작");
		String sta=sc.next();
		if (sta=="start")
			menu();
		


}}
