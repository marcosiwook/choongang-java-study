package ch03;

public class Ex01 {

	public static void main(String[] args) {
		// 1부터 20까지 정수 중에서 2또는 3의 배수가 아닌 수의 합
		int sum = 0;
//		for(int i = 0; i <= 20; i++) {
//			if(i % 2!=0 &&i % 3!=0) {
//				sum +=i;
//			}
//		}
//		System.out.println(sum);
		
		for(int j=0; j<=20; j++) {
			if(j % 3 !=0)
			System.out.println(sum + j);
		}
	}

}
