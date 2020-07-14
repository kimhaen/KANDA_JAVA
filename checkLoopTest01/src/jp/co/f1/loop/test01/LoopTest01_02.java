package jp.co.f1.loop.test01;

import java.util.Scanner;

public class LoopTest01_02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scn = new Scanner(System.in);
		System.out.print("キーボードから数値を入力して下さい。＞");
		int num = scn.nextInt();

		while(num>0) {
			if(num>0) {
				System.out.print("■");
				num--;
			}

		}

	}

}
