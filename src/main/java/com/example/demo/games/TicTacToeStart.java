package com.example.demo.games;
import org.testng.annotations.Test;

public class TicTacToeStart {
    public static void main(String[] args) {
        ttt();
    }

    /*TODO:不理解这个Test的问题在哪，Test应该怎么用呢？*/
    @Test
    private static void ttt() {
        TicTacToe j1 = new TicTacToe();
        j1.start_game();
    }
}
