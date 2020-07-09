package jp.co.f1.basic.test;

public class MakeStudentArray {

	public Student[] makeStudents() {

		Student student1 = new Student("神田");
		Student student2 = new Student("上野");
		Student student3 = new Student("渋谷");

		Student[] studentList = new Student[3];

		studentList[0] = student1;
		studentList[1] = student2;
		studentList[2] = student3;

		return studentList;
	}


	public void renameFinalStudent(Student[] studentList) {
		studentList[studentList.length - 1].setName("大塚");
	}


	public static void main(String[] args) {

		MakeStudentArray make = new MakeStudentArray();
		Student[] studentList = make.makeStudents();

		for (int i = 0; i < studentList.length; i++) {
			System.out.println("学生" + (i + 1) + "の名前は" + studentList[i].getName());
		}

		make.renameFinalStudent(studentList);

		System.out.println();
		System.out.println("最後の人を大塚さんに書き換えました。");
		System.out.println();

		for (int i = 0; i < studentList.length; i++) {
			System.out.println("学生" + (i + 1) + "の名前は" + studentList[i].getName());
		}

	}

}
