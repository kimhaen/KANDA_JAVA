package jp.co.f1.array.test01;

public class ArrayTest01_03 {

	public static void main(String[] args) {

		//int型の配列変数arrayを宣言して、代入
		int[] array = { 10, 20, 30, 40, 50 };
		//for文を使って文字列で出力
		for(int i = 0; i<array.length;i++) {
			System.out.println("インデックス「"+i+"」の値は「"+array[i]+"」です。");
		}

	}

}
