package com.example.demo.games;
import com.example.demo.games.jingziqi;
import org.testng.annotations.Test;

public class Jingziqi_start {
    public static void main(String[] args) {
        ttt();
    }

    @Test
    private static void ttt() {
        jingziqi j1 = new jingziqi();
        j1.start_game();
    }
}
