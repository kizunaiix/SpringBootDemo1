package com.example.demo.games;

import java.util.Scanner;

public class jingziqi {
    public boolean END = false;
    private String first_row;
    private String second_row;
    private String third_row;

    public jingziqi(){
        first_row  = "|   |   |   |";
        second_row = "|   |   |   |";
        third_row  = "|   |   |   |";
        END = false;
    }

    public void show_rule(){
        System.out.println("the rule is:");
        System.out.println("| 6 | 7 | 8 |");
        System.out.println("| 3 | 4 | 5 |");
        System.out.println("| 0 | 1 | 2 |");
        System.out.println("\n\n");
    }

    /**
    *字符串按索引位置替换字符
    */
    public String replace_char(String old_string,String char1,int index){
        String newString;
        newString = old_string.substring(0,index) + char1 + old_string.substring(index+1);
        return newString;
    }

    /**
     * 绘制棋盘
     */
    public void draw_game(){
        System.out.println("-------------");
        System.out.println(first_row);
        System.out.println("-------------");
        System.out.println(second_row);
        System.out.println("-------------");
        System.out.println(third_row);
        System.out.println("-------------");
    }

    public void draw_row(String input_loc){
        switch (input_loc) {
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
     * 询问新步骤下在哪里
     */
    public String ask_new_step(){
        Scanner input = new Scanner(System.in);
        System.out.print("give me a new location: ");
        String myString = input.next();
        System.out.println("you put it at:" + myString);
        return myString;
    }

    /**
     * 判断游戏是否结束
     */
    public void judge_game(){
        if (first_row.equals("| X | X | X |")){
            END = true;
        }
        if (second_row.equals("| X | X | X |")){
            END = true;
        }
        if (third_row.equals("| X | X | X |")){
            END = true;
        }
        if (first_row.equals(second_row) && second_row.equals(third_row)){
            END = true;
        }
        if (first_row.equals("| X |   |   |") && second_row.equals("|   | X |   |") && third_row.equals("|   |   | X |")){
            END = true;
        }
        if (first_row.equals("|   |   | X |") && second_row.equals("|   | X |   |") && third_row.equals("| X |   |   |")){
            END = true;
        }
    }
}
