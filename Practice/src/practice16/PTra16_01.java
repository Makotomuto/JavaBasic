package practice16;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 */
public class PTra16_01 {
    public static void main(String[] args) throws ParseException{

        /*
        * ★ java.util.Dateクラスを使って、自分の生年月日を「YYYY年MM月DD日」形式で出力してください
        *  ※　他の標準クラスも使って良いです
        */

		SimpleDateFormat f = new SimpleDateFormat("yyyy年MM月dd日");
		Date birthDay = f.parse("1994年07月24日");
		String dateStr = f.format(birthDay);
		System.out.println(dateStr);


    }

}