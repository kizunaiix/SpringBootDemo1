package com.example.demo.games;
import com.example.demo.games.jingziqi;
import org.testng.annotations.Test;

public class Jingziqi_start {
    public static void main(String[] args) {
        ttt();
    }

    /*TODO:不理解这个Test的问题在哪，Test应该怎么用呢？*/
    @Test
    private static void ttt() {
        jingziqi j1 = new jingziqi();
        j1.start_game();
    }
}
