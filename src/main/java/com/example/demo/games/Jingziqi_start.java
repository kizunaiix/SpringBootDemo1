package com.example.demo.games;
import com.example.demo.games.jingziqi;

public class Jingziqi_start {
    public static void main(String[] args) {
        jingziqi j1 = new jingziqi();
        /*下面开始游戏*/
        j1.show_rule();
        j1.draw_game();

        while (!j1.END){
            j1.draw_row(j1.ask_new_step());
            j1.draw_game();
            j1.judge_game();
        }
        System.out.println("bang!");
    }
}
