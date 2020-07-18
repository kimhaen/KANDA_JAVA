package jp.co.f1.method.test;

public class GetAverage {

	static double getAverage(int [] array) {

		int sum = 0;
		double ave = 0;

		for(int i=0;i<array.length;i++) {
			sum += array[i];
		}
		ave = (double)sum/array.length;

		return ave;
	}

	public static void main(String[] args) {

		int [] num = {7,8,9,10,11,12};

		double ave = getAverage(num);

		System.out.println("平均値は"+ave+"です。");
	}

}
