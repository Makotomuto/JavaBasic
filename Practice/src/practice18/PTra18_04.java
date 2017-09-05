/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import entity.Player;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> list = new ArrayList<>();
        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] array = line.split(",",0);
                Player player = new Player();

                player.setPosition(array[0]);
                player.setName(array[1]);
                player.setCountry(array[2]);
                player.setTeam(array[3]);

        		list.add(player);

            }
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
		Collections.shuffle(list);
		int i = 0;
		int j = 0;
		int k = 0;
		int l = 0;

		for(Player player : list) {
			if(player.getPosition().equals("GK")) {
				if(i == 0) {
					System.out.println(player.toString());
					i++;
				}
			}else if(player.getPosition().equals("DF")) {
				if(j <= 3) {
					System.out.println(player.toString());
					j++;
				}
			}else if(player.getPosition().equals("MF")) {
				if(k <= 3) {
					System.out.println(player.toString());
					k++;
				}
			}else if(player.getPosition().equals("FW")) {
				if(l <= 1) {
					System.out.println(player.toString());
					l++;
				}
			}
		}

	}
}
