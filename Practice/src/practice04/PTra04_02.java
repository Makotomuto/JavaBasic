package practice04;
/*
 * PTra04_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra04_02 {
	public static void main(String[] args) {
		// 通称「FizzBuzz問題」です
		// ★ int型の変数indexを定義し、1で初期化してください
		int index = 1;

		// ★ 変数indexが100以下である場合繰り返す条件式を記述してください
		while (index <= 100) {

			// ★ 変数indexの値が3でも5でも割り切れる数の場合は、「FizzBuzz」と出力
			if(index % 3 == 0 && index % 5 == 0) {
				System.out.println("FizzBuzz");
			}

			// ★ 変数indexの値が3で割り切れ、5で割り切れない場合は、「Fizz」と出力
			else if(index % 3 == 0 && index % 5 != 0) {
				System.out.println("Fizz");
			}

			// ★ 変数indexの値が5で割り切れ、3で割り切れない場合は、「Buzz」と出力
			else if(index % 3 != 0 && index % 5 == 0) {
				System.out.println("Buzz");
			}

			// ★ 変数indexの値が3でも5でも割り切れない場合は、変数indexの値を出力
			else {
				System.out.println(index);
			}

			// ★ 変数indexに1を加算した数を、変数indexに代入する
			index++;

		}

		/*
		 * ---------出力結果例---------
		 * 1
		 * 2
		 * Fizz
		 * 4
		 * Buzz
		 * Fizz
		 * 7
		 * 8
		 * Fizz
		 * Buzz
		 * 11
		 * Fizz
		 * 13
		 * 14
		 * FizzBuzz
		 * 16
		 * ：
		 * ：
		 */

	}
}
