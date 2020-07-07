package step3;

public class DebugSample1 {

	public static int methodTest() {

				int methodNum = (int)(Math.random()*100);

				return methodNum;
	}

	public static void main(String[] args) {

		int localNum = 10;
		System.out.println("loclaNum = "+localNum);
		System.out.println();

		String localStr = "こんにちは！";
		System.out.println("localStr="+localStr);
		System.out.println();

		int[] localArray = new int[3];
		for(int i = 0; i<localArray.length;i++) {
				localArray[i] = 100*(i+1);
				System.out.println("localArray["+i+"]="+localArray[i]);
		}
		System.out.println();


		int returnNum = methodTest();
		System.out.println("returnNum="+returnNum);
		System.out.println();

	}

}
