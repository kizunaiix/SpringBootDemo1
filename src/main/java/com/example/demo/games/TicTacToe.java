package com.example.demo.games;


import java.util.ArrayList;
import java.util.Scanner;

public class TicTacToe {
    private boolean END;
    private String first_row;
    private String second_row;
    private String third_row;
    private String new_step;
    private ArrayList<Piece> gameProcedure = new ArrayList<>();

    private class Piece {
        int row;
        int column;
//      String putter;

        public Piece(String input) {
            switch (input) {
                case "0" -> {
                    this.row = 0;
                    this.column = 0;
                }
                case "1" -> {
                    this.row = 0;
                    this.column = 1;
                }
                case "2" -> {
                    this.row = 0;
                    this.column = 2;
                }
                case "3" -> {
                    this.row = 1;
                    this.column = 0;
                }
                case "4" -> {
                    this.row = 1;
                    this.column = 1;
                }
                case "5" -> {
                    this.row = 1;
                    this.column = 2;
                }
                case "6" -> {
                    this.row = 2;
                    this.column = 0;
                }
                case "7" -> {
                    this.row = 2;
                    this.column = 1;
                }
                case "8" -> {
                    this.row = 2;
                    this.column = 2;
                }
            }
        }

        @Override
        public boolean equals(Object Obj){
            if (!(Obj instanceof Piece)){
                return false;
            } else return this.row == ((Piece) Obj).row && this.column == ((Piece) Obj).column;
        }
    }

    public TicTacToe() {
        first_row = "|   |   |   |";
        second_row = "|   |   |   |";
        third_row = "|   |   |   |";
        END = false;
        new_step = "";

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
        gameProcedure.add(newPiece);
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
        if (gameProcedure.contains(new Piece("0"))&&gameProcedure.contains(new Piece("1"))&&gameProcedure.contains(new Piece("2"))) {
            END = true;
        } else if (gameProcedure.contains(new Piece("3"))&&gameProcedure.contains(new Piece("4"))&&gameProcedure.contains(new Piece("5"))) {
            END = true;
        } else if (gameProcedure.contains(new Piece("6"))&&gameProcedure.contains(new Piece("7"))&&gameProcedure.contains(new Piece("8"))) {
            END = true;
        } else if (gameProcedure.contains(new Piece("0"))&&gameProcedure.contains(new Piece("3"))&&gameProcedure.contains(new Piece("6"))) {
            END = true;
        } else if (gameProcedure.contains(new Piece("1"))&&gameProcedure.contains(new Piece("4"))&&gameProcedure.contains(new Piece("7"))) {
            END = true;
        } else if (gameProcedure.contains(new Piece("2"))&&gameProcedure.contains(new Piece("5"))&&gameProcedure.contains(new Piece("8"))) {
            END = true;
        } else if (gameProcedure.contains(new Piece("0"))&&gameProcedure.contains(new Piece("4"))&&gameProcedure.contains(new Piece("8"))) {
            END = true;
        } else if (gameProcedure.contains(new Piece("2"))&&gameProcedure.contains(new Piece("4"))&&gameProcedure.contains(new Piece("6"))) {
            END = true;
        }
    }
}
