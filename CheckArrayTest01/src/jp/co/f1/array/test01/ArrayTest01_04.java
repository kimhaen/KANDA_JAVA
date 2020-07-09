package jp.co.f1.array.test01;

public class ArrayTest01_04 {

	public static void main(String[] args) {

		// int型の配列変数arrayを宣言して、代入
		int[] array = { 22, 15, 38, 41, 55 };
		// for文を使って文字列で出力
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				System.out.println(array[i]);
			}

		}

	}

}
