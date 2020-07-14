package jp.co.f1.loop.test01;

import java.util.Scanner;

public class LoopTest01_05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		while (true) {
			int num = (int) (Math.random() * 6 + 1);

			if (num != 6) {
				System.out.println("サイコロの目「" + num + "」");
				continue;
			}
			System.out.println("サイコロの目「" + num + "」");


			break;
		}
			System.out.println("６が出たので終わりです。");
	}
}
