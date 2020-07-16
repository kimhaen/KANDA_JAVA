package jp.co.f1.method.test01;

import java.util.Scanner;

public class MethodTest01_03 {

	static int inputAge() {

		Scanner scn = new Scanner(System.in);
		System.out.print("年齢を入力してください。＞");
		int age = scn.nextInt();
		return age;

	}


	public static void main(String[] args) {

		if (inputAge()>= 20) {
			System.out.println(inputAge() + "才は成人です。");
		} else {
			System.out.println(inputAge() + "才は未成年です。");
		}

	}

}
