package ch06;

public class Manager {
	private String name;
	private int age;
	private String part;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}

	void printAll() {
		System.out.println("===============");
		System.out.println("name: " +name);
		System.out.println("age: " +age);
		System.out.println("part: " +part);
	}
}
