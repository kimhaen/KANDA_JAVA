package step2;

class Class1 {
	int instanceNum;

	public void setInstanceNum() {
		this.instanceNum = (int) (Math.random() * 100);
	}

}

public class DebugSample2 {

	public static void main(String[] args) {
		Class1 classVariable = new Class1();
		classVariable.setInstanceNum();
		System.out.println("classVariale.instanceNum=" + classVariable.instanceNum);
		System.out.println();

	}

}
