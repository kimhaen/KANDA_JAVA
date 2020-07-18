package jp.co.f1.method.test;

public class PrintRandomMessage {

	static void printRandomMessage() {

		//ランダム数字処理
		int n = (int)(Math.random()*3);
		//配列にメッセージ代入
		String [] aisatsu = {"こんばんは","こんにちは","おはよう"};
		//出力
		System.out.println(aisatsu[n]);

	}

	public static void main(String[] args) {
		//メソッド呼び出し
		printRandomMessage();

	}

}
