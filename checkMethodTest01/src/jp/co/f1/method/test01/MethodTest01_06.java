package jp.co.f1.method.test01;

public class MethodTest01_06 {

	static int arrayTotal(int[] pointArray) {

		int total = 0;

		for(int i = 0; i<pointArray.length;i++) {
			total += pointArray[i];
		}
		return total;
	}

	public static void main(String[] args) {

		int [] pointArray = {10,20,30};

		System.out.println("合計値は"+arrayTotal(pointArray)+"です。");
	}

}
