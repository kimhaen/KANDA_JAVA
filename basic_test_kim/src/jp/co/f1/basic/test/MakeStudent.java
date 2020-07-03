package jp.co.f1.basic.test;

public class MakeStudent {

	public static void main(String[] args) {

		Student s10bj = new Student("田中");
		s10bj.plusCount();
		System.out.println("名前：" + s10bj.getName());
		Student.showCount();

		Student s20bj = s10bj;
		s20bj.plusCount();
		s10bj.setName("山田");
		System.out.println("名前：" + s20bj.getName());
		Student.showCount();

	}

}
