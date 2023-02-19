package com.example.demo.games;


import java.util.ArrayList;
import java.util.Scanner;

public class TicTacToe {
    private boolean END;
    private String first_row;
    private String second_row;
    private String third_row;
    private String new_step;
    private ArrayList<int[]> gameProcedure = new ArrayList<>();

    private class Piece {
        public int row;
        public int column;
//        private String putter;

        public Piece(String input) {
            switch (input) {
                case "0" -> {
                    row = 0;
                    column = 0;
                }
                case "1" -> {
                    row = 0;
                    column = 1;
                }
                case "2" -> {
                    row = 0;
                    column = 2;
                }
                case "3" -> {
                    row = 1;
                    column = 0;
                }
                case "4" -> {
                    row = 1;
                    column = 1;
                }
                case "5" -> {
                    row = 1;
                    column = 2;
                }
                case "6" -> {
                    row = 2;
                    column = 0;
                }
                case "7" -> {
                    row = 2;
                    column = 1;
                }
                case "8" -> {
                    row = 2;
                    column = 2;
                }
            }
        }
    }

    public TicTacToe() {
        first_row = "|   |   |   |";
        second_row = "|   |   |   |";
        third_row = "|   |   |   |";
        END = false;
        new_step = "";
        gameProcedure = null;
    }

    public void start_game() {
        /*下面开始游戏*/
        show_rule();
        draw_game();

        while (!END) {
            ask_new_step();
            refresh_row();
            refresh_gameProcedure();
            draw_game();
            judge_game();//同样要改
        }
        System.out.println("bang!");
    }

    private void show_rule() {
        System.out.println("the rule is:");
        System.out.println("| 6 | 7 | 8 |");
        System.out.println("| 3 | 4 | 5 |");
        System.out.println("| 0 | 1 | 2 |");
        System.out.println("\n\n");
    }

    /**
     * 字符串按索引位置替换字符
     */
    private String replace_char(String old_string, String char1, int index) {
        String newString;
        newString = old_string.substring(0, index) + char1 + old_string.substring(index + 1);
        return newString;
    }

    /**
     * 绘制棋盘
     */
    private void draw_game() {
        System.out.println("-------------");
        System.out.println(first_row);
        System.out.println("-------------");
        System.out.println(second_row);
        System.out.println("-------------");
        System.out.println(third_row);
        System.out.println("-------------");
    }

    private void refresh_row() {
        switch (new_step) {
            case "0" -> third_row = replace_char(third_row, "X", 2);
            case "1" -> third_row = replace_char(third_row, "X", 6);
            case "2" -> third_row = replace_char(third_row, "X", 10);
            case "3" -> second_row = replace_char(second_row, "X", 2);
            case "4" -> second_row = replace_char(second_row, "X", 6);
            case "5" -> second_row = replace_char(second_row, "X", 10);
            case "6" -> first_row = replace_char(first_row, "X", 2);
            case "7" -> first_row = replace_char(first_row, "X", 6);
            case "8" -> first_row = replace_char(first_row, "X", 10);
            default -> System.out.println("wrong input!!!");
        }
    }

    /**
     * 更新游戏历史记录
     */
    private void refresh_gameProcedure() {
        Piece newPiece = new Piece(new_step);
        gameProcedure.add(new int[]{newPiece.row, newPiece.column});
    }

    /**
     * 询问新步骤下在哪里
     */
    private void ask_new_step() {
        Scanner input = new Scanner(System.in);
        System.out.print("give me a new location: ");
        String myString = input.next();
        System.out.println("you put it at:" + myString);
        new_step = myString;
    }

    /**
     * 判断游戏是否结束
     */
    private void judge_game() {
        int[] a1 = {0, 0};
        if (gameProcedure.contains(a1)) {
            END = true;
        }
    }
}
