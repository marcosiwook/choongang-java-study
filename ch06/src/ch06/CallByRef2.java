package ch06;
class C2 {
	int x, y;
	public void m1(C2 c) {
//		x와 y를 교환하고 c.x, c.y를 출력
		int temp = c.x; c.x = c.y; c.y = temp;
		System.out.println("main x = "+c.x);
		System.out.println("main y = "+c.y);
}
}
public class CallByRef2 {
	public static void main(String[] args) {
//		C2 c를 생성하여 c.x=10, c.y=20d를 대입하고 m1() 메서드에 c를 전달
//		c.x	와 c.y를 출력

		C2 c = new C2(); c.x = 10; c.y = 20; // 객체도 참조변수이므로 주소를 전달
		c.m1(c);
		System.out.println("main x = "+c.x);
		System.out.println("main y = "+c.y);
	}
}
