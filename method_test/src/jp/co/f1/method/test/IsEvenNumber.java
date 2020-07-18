package jp.co.f1.method.test;

import java.util.Scanner;

public class IsEvenNumber {

	public static boolean isEvenNumber(int value) {

		boolean ans;

		if(value%2==0) {
			ans = true;
		}else {
			ans = false;
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("キーボードから数値を入力してください：");
		int value = scn.nextInt();

		boolean result = isEvenNumber(value);

		if(result) {
			System.out.println(value+"は偶数です。");
		}else {
			System.out.println(value+"は奇数です。");
		}


	}

}
