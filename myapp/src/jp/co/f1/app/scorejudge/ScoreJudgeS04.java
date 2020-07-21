//点数評価プログラム_20200312_キムへイン
//繰り返し処理で入力した数字の件数、平均、合計を出力します。

package jp.co.f1.app.scorejudge;

import java.util.Scanner;

public class ScoreJudgeS04 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("--点数評価プログラム開始--");

		// 必要な変数を宣言
		int count = 0;
		double ave = 0;
		int sum = 0;

		// 繰り返し処理
		while (true) {
			System.out.print(">");
			String strScore = scn.nextLine();

			// 入力した値がqなのかを判断
			if (strScore.equals("q")) {
				System.out.println("qが入力されたため、終了します。");

				System.out.println("\n----------------サマリ-----------------");
				if (count == 0) {
					System.out.println("評価された人数が" + count + "名のためサマリーは表示しません。");

				} else {
					// ave = (double) sum / count;
					System.out.println("		" + count + "の成績を表示しました。");
					System.out.println("		合計は" + sum + "点です。");
					System.out.println("		平均点は" + Math.round(ave) + "点です。");
				}
				System.out.println("-----------------------------------------");
				System.out.println("--点数評価プログラム終了--");
				break;
			}
			// 数字の場合は計算
			int inputNum = Integer.parseInt(strScore);

			if (inputNum < 0 || inputNum > 100) {
				System.out.println("→範囲外の数字が入力されました。再度、0から100までの数字を入力してください。");
				continue;

			} else if (inputNum >= 60 && inputNum <= 69) {
				System.out.println("→評価Dです。");
				count++;
			} else if (inputNum >= 70 && inputNum <= 79) {
				System.out.println("→評価Cです。");
				count++;
			} else if (inputNum >= 80 && inputNum <= 89) {
				System.out.println("→評価Bです。");
				count++;
			} else if (inputNum >= 90 && inputNum <= 100) {
				System.out.println("→評価Aです。");
				count++;
			} else if (inputNum <= 59) {
				System.out.println("→評価Fです。");
				count++;
			} else {
				continue;
			}
			// 数字でsum,ave,countなので計算
			sum += inputNum;
			ave = (double) sum / count;

			// System.out.println(count);
			// System.out.println(sum);
			// System.out.println(ave);

		}
	}
}
