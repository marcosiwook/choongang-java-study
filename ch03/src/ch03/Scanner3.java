package ch03;

import java.util.Scanner;

public class Scanner3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "";
		int num=0;
		do {
			System.out.println("정수를 입력하세요.");
			num = sc.nextInt(); //정수까지 읽고 enter는 무시
			num = Integer.parseInt(sc.nextLine());
			System.out.println("입력한 정수: "+ num);
			System.out.println("문자열을 입력하세요: "+ num);
			num = sc.nextInt();
			System.out.println("입력한 문자열: "+ str);
			num = sc.nextInt();
			if(str.equals("X")) break;
			
			
		} while(true);
		System.out.println("프로그램 종료");
		sc.close();

	}
}
