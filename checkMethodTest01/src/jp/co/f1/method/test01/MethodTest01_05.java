package jp.co.f1.method.test01;

import java.util.Scanner;

public class MethodTest01_05 {

	static void arrayTotal(int [] pointArray) {

		int sum = 0;
		for(int i=0;i<pointArray.length;i++) {
			sum += pointArray[i];

		}
		System.out.println("合計は"+sum+"です。");
	}

	public static void main(String[] args) {

		int[]pointArray = {10,20,30};

		arrayTotal(pointArray);


	}

}
