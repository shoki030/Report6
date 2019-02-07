package jp.ac.uryukyu.ie.e185711_e185713;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    @Test
    public void kai(){
        int c = 0;
        int rand = 0;
        int num = 3;
        Game game = new Game(c);
        Game.pitcher_pattern(rand);
        Game.player_pattern(num);
        for(int i = 0; i <= 3; i++){
            kai();
        }
        assertEquals(c, );
    }
}
