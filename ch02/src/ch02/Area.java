package ch02;

public class Area {

	public static void main(String[] args) {
		double pi = 3.141592;
		int r1 = 5;
//		실수와 정수를 연산한 결과는 실수, 연산 결과는 범위가 큰 쪽
		double area = pi * r1 * r1;
		System.out.println("원의 면적: " + area);
	}

}
