package jp.co.f1.method.test;

public class printMessageValues {

	public static void printMessageValues(String message, int count) {

		for(int i = 0; i<count; i++) {
			System.out.println(message);
		}
	}


	public static void main(String[] args) {

		printMessageValues("Hello",5);

	}

}
