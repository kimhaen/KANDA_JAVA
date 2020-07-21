/*プログラム名：数字当てプログラムS
*プログラムの説明：0から9までの数値を入力してもらって、
*								予想数字と入力数字を比較するプログラムです。
*作成者：キムへイン
*作成日：20200317
*/
package jp.co.f1.app.numberhit;

import java.util.*;

public class NumberHitS06 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int answerNum = 5;

		System.out.println("ゲーム開始(正解数字：" + answerNum + ")");
		System.out.println();
		while (true) {
			try {
				System.out.print("0から9まで予想の数字を入力＞＞");
				int playerNum = scn.nextInt();

				if (playerNum == 999) {
					System.out.println(playerNum + "が入力されたためゲームを終了します。");
					break;
				}

				if (playerNum <= 0 || playerNum > 9) {
					System.out.println("エラー！！0から9までの数字ではありません。");
					continue;
				}

				if (playerNum > answerNum) {
					System.out.println("　　→正解数字は" + playerNum + "より小さいです。");
				} else if (playerNum < answerNum) {
					System.out.println("　　→正解数字は" + playerNum + "より大きいです。");
				} else {
					System.out.println("　　→！！大当たり！！");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("　　→エラー！！文字が入力されました。");
				scn.next();
			}
		}
		System.out.println();
		System.out.println("ゲーム終了");
	}
}
