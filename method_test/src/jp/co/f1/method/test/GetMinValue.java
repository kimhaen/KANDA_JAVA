package jp.co.f1.method.test;

public class GetMinValue {

	static double getMinValue(double a, double b) {

		double min = 0;

		if(a>b) {
			min = b;
		}else {
			min = a;
		}

		return min;
	}

	public static void main(String[] args) {

		double a = 1.55;
		double b = 2.36;

		double min = getMinValue(a,b);

		if(min == a) {
			System.out.println("変数aと変数bで小さいのは、「変数aの "+min+"」 です。");
		}else {
		System.out.println("変数aと変数bで小さいのは、「変数bの  "+min+"」 です。");
		}
	}
}
