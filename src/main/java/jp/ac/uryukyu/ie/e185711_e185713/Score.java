package jp.ac.uryukyu.ie.e185711_e185713;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

/**
 * SBOのスコアを表示するクラス
 * ウィンドウとタイトルを表示。
 */
public class Score {
    Score() {
        ScoreWindow sw = new ScoreWindow("SBO", 400, 300);
        sw.add(new DrawScore());
        sw.setVisible(true);
    }
    static class ScoreWindow extends JFrame {
        public ScoreWindow(String title, int width, int height) {
            super(title);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(width, height);
            setLocationRelativeTo(null);
            setResizable(false);
        }
    }

    /**
     * ランプを作るクラス
     */
    static class DrawScore extends JPanel {
        public void paintComponent(Graphics g) {
            int x = 100, x2 = 100, x3 = 100;
            int s_lamp = 0, b_lamp = 0, o_lamp = 0;
            super.paintComponent(g);
            g.drawString("S", 50, 75);
            while (s_lamp < 2) {
                g.setColor(Color.yellow);
                g.fillOval(x, 50, 50, 50);
                x = x + 50;
                s_lamp++;
            }
            g.setColor(Color.black);
            g.drawString("B", 50, 150);
            while (b_lamp < 3) {
                g.setColor(Color.green);
                g.fillOval(x2, 125, 50, 50);
                x2 = x2 + 50;
                b_lamp++;
            }
            g.setColor(Color.black);
            g.drawString("O", 50, 225);
            while (o_lamp < 2) {
                g.setColor(Color.red);
                g.fillOval(x3, 200, 50, 50);
                x3 = x3 + 50;
                o_lamp++;
            }
        }
    }
}

