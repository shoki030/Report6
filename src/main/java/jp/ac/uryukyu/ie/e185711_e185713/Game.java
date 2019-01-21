package jp.ac.uryukyu.ie.e185711_e185713;
import java.util.Random;
import java.util.Scanner;
public class Game {
    Game() {
        int o = 0;//アウト
        String result = "";
        for (int out = 0; out <= 3; out++) {
            int s = 0;//ストライク
            int b = 0;//ボール
            int h = 0;//ヒット
            int ball_count = 1;//球数
            while (h != 1 && s != 3 && b != 4) {
                Random rand = new Random();
                int rand_num = rand.nextInt(3);
                //System.out.println(rand_num);
                System.out.println("0.ミート\n" + "1.強振\n" + "2.バント\n" + "3.見逃し\n" + "0~3を入力して:");
                Scanner scan = new Scanner(System.in);
                int num = scan.nextInt();
                System.out.println("第" + ball_count + "球目");
                switch (rand_num) {
                    case 0://ストレート
                        if (num <= 2) {
                            result = "ピッチャーはストレートを投げた！hit";
                            System.out.println(result);
                            h = h + 1;
                        } else {
                            result = "ピッチャーはストレートを投げた！strike";
                            System.out.println(result);
                            s = s + 1;
                        }
                        break;
                    case 1://変化球
                        if (num == 0) {
                            result = "ピッチャーは変化球を投げた！hit";
                            System.out.println(result);
                            h = h + 1;
                        } else {
                            result = "ピッチャーは変化球を投げた！strike";
                            System.out.println(result);
                            s = s + 1;
                        }
                        break;
                    case 2://ボール球
                        if (num == 3) {
                            result = "ピッチャーはきわどいボール球を投げた！ball";
                            System.out.println(result);
                            b = b + 1;
                        } else {
                            result = "ピッチャーはきわどいボール球を投げた！strike";
                            System.out.println(result);
                            s = s + 1;
                        }
                        break;
                }
                if (s < 3) { System.out.println("ストライク:" + s); } else {
                    System.out.println("ストライク:" + s + " バッターアウト!");
                    o = o + 1;
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
        }
        System.out.println("3アウト、チェンジ！");
    }
}




