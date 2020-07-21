package jp.co.f1.app.numberhit;

import java.util.Scanner;

public class NumberHitS01 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int answerNum = 5;

		System.out.println("ゲーム開始");
		System.out.println();

		System.out.print("0から9まで予想の数字を入力＞＞");
		int playerNum = scn.nextInt();

		if(playerNum>0) {
			System.out.println("→予想数字は"+playerNum+"です。");
			System.out.println("→正解数字は"+answerNum+"です。");
		}

		System.out.println();
		System.out.println("ゲーム終了");


	}

}
