package jp.co.f1.method.test01;

import java.util.Scanner;

public class MethodTest01_04 {

	static int pow2(int pow2Num) {

		int pow2Result = pow2Num * pow2Num;
		return pow2Result;
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.print("数値を入力 ＞");
		int num = scn.nextInt();
		pow2(num);
		MethodTest01_04.pow2(num);

		System.out.println(num+"の２乗は"+pow2(num)+"です。");

	}

}
