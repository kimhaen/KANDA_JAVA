package jp.co.f1.app.scorejudge;

import java.util.Scanner;

public class ScoreJudgeS01 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("--点数評価プログラム開始--");

		System.out.print(">");
		int inputNum = scn.nextInt();

		if(inputNum>=0 && inputNum<=59) {
			System.out.println("→評価Fです。");
		}else if(inputNum>=60 && inputNum<=69) {
			System.out.println("→評価Dです。");
		}else if(inputNum>=70 && inputNum<=79) {
			System.out.println("→評価Cです。");
		}else if(inputNum>=80 && inputNum<=89) {
			System.out.println("→評価Bです。");
		}else if(inputNum>=90 && inputNum<=100) {
			System.out.println("→評価Aです。");
		}

		System.out.println();
		System.out.println("--点数評価プログラム終了--");

	}

}
