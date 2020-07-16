package jp.co.f1.method.test01;

import java.util.Scanner;

public class MethodTest01_02 {

	static void printAge(int age) {
			if(age>=20) {
				System.out.println(age+"才は成人です。");
			}else {
				System.out.println(age+"才は未成年です。");
			}

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.print("年齢を入力してください。＞");
		int age = scn.nextInt();
		printAge(age);


	}

}
