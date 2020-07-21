/*プログラム名：点数評価プログラム
*プログラムの説明：0から100までの数値を入力してもらって、
*								クラスメソッドを定義して、繰り返し処理で
*								入力した数字の件数、平均、合計を出力します。
*作成者：キムへイン
*作成日：20200317
*/
package jp.co.f1.app.scorejudge;

import java.util.Scanner;

public class ScoreJudgeS08 {

//	クラス内に点数を評価するクラスメソッド定義
	public static char evaluateScore(int inputNum) {

		if (inputNum < 0 || inputNum > 100) {

		} else if (inputNum <= 59) {
			return 'F';
		} else if (inputNum <= 69) {
			return 'D';
		} else if (inputNum <= 79) {
			return 'C';
		} else if (inputNum <= 89) {
			return 'B';
		} else if (inputNum <= 100) {
			return 'A';
		}
		return 'Z';
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("--点数評価プログラム開始--");

		// 必要な変数を宣言
		int count = 0;
		double ave = 0;
		int sum = 0;
		int minscore = 101;
		int maxscore = -1;

		// 入力・計算の繰り返し処理
		while (true) {
			System.out.print(">");
			String strScore = scn.nextLine();

			// 入力した値がqなのかを判断して終了
			if (strScore.equals("q")) {
				System.out.println("qが入力されたため、終了します。");

				System.out.println("\n----------------サマリ-----------------");

				break;
			}
			//qではない場合は数値に変更
			int inputNum = Integer.parseInt(strScore);
			//メソッドに入力した数値代入
			char result = 	ScoreJudgeS08.evaluateScore(inputNum);			//範囲内かを判断
			if (result == 'Z') {
				System.out.println("→範囲外の数字が入力されました。再度、0から100までの数字を入力してください。");
				continue;
			//範囲内なら評価出力や計算を行う
			} else {
				System.out.println("→評価" + result + "です。");
				count++;
				sum += inputNum;
				ave = (double) sum / count;
			}
			//最低点、最高点計算
			if (maxscore < inputNum) {
				maxscore = inputNum;
			}

			if (minscore > inputNum) {
				minscore = inputNum;

			}
		}
		//繰り返し処理を抜け出した後、サマリー出力
		if (count == 0) {
			System.out.println("評価された人数が" + count + "名のためサマリーは表示しません。");

		} else {
			System.out.println("		" + count + "の成績を表示しました。");
			System.out.println("		合計は" + sum + "点です。");
			System.out.println("		平均点は" + ave + "点です。");
			System.out.println("		最低点は" + minscore + "点です。");
			System.out.println("		最高点は" + maxscore + "点です。");
		}
		System.out.println("-----------------------------------------");
		System.out.println("--点数評価プログラム終了--");

	}
}
