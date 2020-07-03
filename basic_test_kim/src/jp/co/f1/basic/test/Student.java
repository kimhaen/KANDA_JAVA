package jp.co.f1.basic.test;

public class Student {

	public static int count;
	private String name;


	public Student(String name) {
		this.name = name;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void plusCount() {
		count++;
	}

	public static void showCount() {
		System.out.println("生徒数は " + count + " 名です。");
	}


}
