package ch06;

public class Teacher {
	private String name;
	private int age;
	private String subject;
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
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	void printAll() {
		System.out.println("===============");
		System.out.println("name: " +name);
		System.out.println("age: " +age);
		System.out.println("subject: " +subject);
	}
}
