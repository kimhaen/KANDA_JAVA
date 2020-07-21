package jp.co.f1.app.baseball;

import java.util.Scanner;

public class BaseBallS06 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("--野球ゲームプログラム開始--");
		System.out.println();

		int answer[] = new int[3];
		int[] playerNum = new int[3];
		int strikeCount = 0;
		int tryCount = 0;

		// ランダム数字の出力、ユニーク数字が出るまで重複判断
		while (true) {

			for (int i = 0; i < answer.length; i++) {
				answer[i] = (int) (Math.random() * 10);
			}

			if (answer[0] == answer[1] || answer[1] == answer[2] || answer[0] == answer[2]) {
				continue;
			} else {
				System.out.println("３桁のランダム数字（正解数字）は" + answer[0] + answer[1] + answer[2] + "です。");
				System.out.println("=>ユニークです。");
				System.out.println();
				break;
			}
		}

		// 3桁数字を数字をキーボード入力（ユニーク数字が出るまで、繰り返し処理）
		while (true) {
			System.out.print("3桁の数字を入力してください＞＞");
			String inputNum = scn.nextLine();

			playerNum[0] = Integer.parseInt(inputNum.substring(0, 1));
			playerNum[1] = Integer.parseInt(inputNum.substring(1, 2));
			playerNum[2] = Integer.parseInt(inputNum.substring(2));

			// 入力数字の重複判断（ユニークなら繰り返し処理終了）
			if (playerNum[0] == playerNum[1] || playerNum[1] == playerNum[2] || playerNum[0] == playerNum[2]) {
				System.out.println("=>重複しています");

			} else {
				System.out.println("=>ユニークです。");
			}

			tryCount++;
			strikeCount=0;

			for (int i = 0; i < playerNum.length; i++) {
				if (playerNum[i] == answer[i]) {
					strikeCount++;

				}
			}
			System.out.println("判定：" + strikeCount + "ストライクです。");

				if (strikeCount == 3) {
					System.out.println(tryCount+"回トライして、3桁の数字を当てました。You Win!");
					break;
				}else {
					continue;

			}
			}
/*
			System.out.println("3回トライして、3桁数字を当てました。You Win!");
			System.out.println();
			System.out.println("--野球ゲームプログラム終了--");*/
	}
}