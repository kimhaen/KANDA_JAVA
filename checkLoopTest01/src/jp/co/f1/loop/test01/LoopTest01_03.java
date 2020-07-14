package jp.co.f1.loop.test01;

import java.util.Scanner;

public class LoopTest01_03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int num = 15;
		System.out.println("数値「num」の数値は「"+num+"」");
		for(int i=1;i<=num;i++) {
					if(i%5==0) {
						System.out.println(i);
					}
		}


	}

}
