package jp.co.f1.app.scorejudge;

import java.util.Scanner;

public class ScoreJudgeS03 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("--点数評価プログラム開始--");

		while (true) {
			System.out.print(">");
			String strScore = scn.nextLine();

			if (strScore.equals("q")) {
				System.out.println("qが入力されたため、終了します。");
				System.out.println("--点数評価プログラム終了--");
				break;
			}

			int inputNum = Integer.parseInt(strScore);
			if (inputNum < 0 || inputNum > 100) {
				System.out.println("→範囲外の数字が入力されました。再度、0から100までの数字を入力してください。");
				continue;

			} else if (inputNum >= 60 && inputNum <= 69) {
				System.out.println("→評価Dです。");
			} else if (inputNum >= 70 && inputNum <= 79) {
				System.out.println("→評価Cです。");
			} else if (inputNum >= 80 && inputNum <= 89) {
				System.out.println("→評価Bです。");
			} else if (inputNum >= 90 && inputNum <= 100) {
				System.out.println("→評価Aです。");
			} else if (inputNum <= 59) {
				System.out.println("→評価Fです。");
			} else {
				break;
			}


			}
		}
}