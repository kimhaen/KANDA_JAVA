package jp.co.f1.array.test01;

public class ArrayTest01_05 {

	public static void main(String[] args) {

		// int型の配列変数arrayを宣言して、代入
		int[] array = { 10, 20, 30, 40, 50 };
		// for文を使って文字列で出力
		for (int i = 0; i < array.length; i++) {
			System.out.println("array「"+i+"」の値は「"+array[i]+"」です。");
			}
		//合計を出力する変数を宣言し、偶数を読み取り
		int sum = 0;
		for(int i =0; i<array.length;i++) {
			if(i%2==0) {
				sum += array[i];

			}

		}
		//合計を出力
		System.out.println();
		System.out.println("インデックスが偶数番目の要素の合計は「"+sum+"」です。");
		}

	}
