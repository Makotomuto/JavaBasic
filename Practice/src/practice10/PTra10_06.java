package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ★ carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * ★ 各carインスタンスのrunメソッドを実行して、それぞれかかった時間と残りのガソリンの量を出力してください。
		 */

		Car car1 = new Car();
		car1.serialNo = 10000;
		car1.color = "Red";
		car1.gasoline = 50;

		Car car2 = new Car();
		car2.serialNo = 10000;
		car2.color = "White";
		car2.gasoline = 40;

		Car car3 = new Car();
		car3.serialNo = 10000;
		car3.color = "Black";
		car3.gasoline = 80;

		final int distance = 300;

		int sum1 = 0;
		int time1 = 0;
		while(sum1 < distance) {
			time1++;

			int move = car1.run();

			if(move > 0) {
				sum1 += move;
			} else {
				System.out.println("目的地に到達できませんでした");
				break;
			}
		}

		if(sum1 >= distance) {
			System.out.println("目的地までに"+time1+"時間かかりました。残りのガソリンは、"+car1.gasoline+"リットルです");
		}

		int sum2 = 0;
		int time2 = 0;
		while(sum2 < distance) {
			time2++;

			int move = car2.run();

			if(move > 0) {
				sum2 += move;
			} else {
				System.out.println("目的地に到達できませんでした");
				break;
			}
		}

		if(sum2 >= distance) {
			System.out.println("目的地までに"+time2+"時間かかりました。残りのガソリンは、"+car2.gasoline+"リットルです");
		}

		int sum3 = 0;
		int time3 = 0;
		while(sum3 < distance) {
			time3++;

			int move = car3.run();

			if(move > 0) {
				sum3 += move;
			} else {
				System.out.println("目的地に到達できませんでした");
				break;
			}
		}

		if(sum3 >= distance) {
			System.out.println("目的地までに"+time3+"時間かかりました。残りのガソリンは、"+car3.gasoline+"リットルです");
		}


	}
}
