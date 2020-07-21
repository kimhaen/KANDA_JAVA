package jp.co.f1.app.baseball;

public class BaseBallS02 {

	public static void main(String[] args) {

		System.out.println("--野球ゲームプログラム開始--");
		System.out.println();
		int answer [] = new int[3];
		answer[0] = (int)(Math.random()*10);
		answer[1] = (int)(Math.random()*10);
		answer[2] = (int)(Math.random()*10);

		System.out.println("３桁のランダム数字（正解数字）は"+answer[0]+answer[1]+answer[2]+"です。");

		if(answer[0]==answer[1] || answer[1]==answer[2] || answer[0]==answer[2]) {
			System.out.println("=>重複しています");
		}else {
			System.out.println("=>ユニークです。");
		}

		System.out.println();
		System.out.println("--野球ゲームプログラム終了--");

	}

}
