package ch08;

public class Employee {
	public final static double INCENTIVE_RATE = 0.1; // 인센티브 10%고정
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	Employee() {}
	Employee(String name) {
		this.name = name;
	}
	int computePay() { // 재정의하여 사용할 예정
		return 0;
	}
	final int computeIncentive() { // 재정의(overriding) 금지
		int result = 0;
		int pay = computePay();
		if(pay >= 10000) result = (int) (pay * INCENTIVE_RATE);
		return 0;
	}
}
