package jp.co.f1.loop.test01;

import java.util.Scanner;

public class LoopTest01_04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int num = 10;
		int cnt = 1;
		System.out.println("数値「num」の数値は「"+num+"」");

		while(num>=cnt) {
			if(cnt<=5) {
				System.out.println(cnt+"★");
				cnt++;
			}else {
				System.out.println(cnt);
				cnt++;
			}

		}


	}

}
