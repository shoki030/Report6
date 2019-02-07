package jp.ac.uryukyu.ie.e185711_e185713;
import java.util.Scanner;
import java.util.Random;

/**
 * Gameクラス
 * ピッチャーとバッターの勝負をする。
 *
 * ピッチャー
 * 0.ストレート
 * 1.変化球
 * 2.ボール球
 *
 * バッター
 * 0.ミート
 * 1.強打
 * 2.バント
 * 3.見逃し
 *
 */
public class Game {
    public Game(int count) {
        int o = 0;//アウト
        String result = "";
        int c = count;
        kai(c);
        while(o <= 2) {
            int s = 0;//ストライク
            int b = 0;//ボール
            int h = 0;//ヒット
            int ball_count = 1;//球数
            while (h != 1 && s != 3 && b != 4) {
                Random randm = new Random();
                int rand = randm.nextInt(3);
                System.out.println("0.ミート\n" + "1.強振\n" + "2.バント\n" + "3.見逃し\n" + "0~3を入力して:");
                Scanner scan = new Scanner(System.in);
                int num = scan.nextInt();
                String temp = ("第" + ball_count + "球目\n");
                switch (pitcher_pattern(rand)) {
                    case 0://ストレート
                        if (player_pattern(num) <= 2) {
                            result = "ピッチャーはストレートを投げた！hit";
                            System.out.println(temp + result);
                            h = h + 1;
                        } else {
                            result = "ピッチャーはストレートを投げた！strike";
                            System.out.println(temp + result);
                            s = s + 1;
                        }
                        break;
                    case 1://変化球
                        if (player_pattern(num) == 0) {
                            result = "ピッチャーは変化球を投げた！hit";
                            System.out.println(temp + result);
                            h = h + 1;
                        } else {
                            result = "ピッチャーは変化球を投げた！strike";
                            System.out.println(temp + result);
                            s = s + 1;
                        }
                        break;
                    case 2://ボール球
                        if (player_pattern(num) == 3) {
                            result = "ピッチャーはきわどいボール球を投げた！ball";
                            System.out.println(temp + result);
                            b = b + 1;
                        } else {
                            result = "ピッチャーはきわどいボール球を投げた！strike";
                            System.out.println(temp + result);
                            s = s + 1;
                        }
                        break;
                }
                if (s < 3) { System.out.println("ストライク:" + s); } else {
                    System.out.println("ストライク:" + s + " バッターアウト!");
                    o = o +1;
                }
                if (b < 4) {
                    System.out.println("ボール:" + b);
                } else {
                    System.out.println("ボール:" + b + "フォアボール、ランナー進塁");
                }
                System.out.println("アウト:" + o + "\n");
                ball_count = ball_count + 1;
                Score sc = new Score();
            }
            //System.out.print(out + "\n");
        }
        System.out.println("3アウト、チェンジ！");

    }
    static int pitcher_pattern(int rand){
        return rand;
    }
    static int player_pattern(int num){
        return num;
    }
    public void kai(int c){
        System.out.println(c + "回の攻撃");
        c = c - 1;

    }


}









