package com.control;

import static com.wsloan.util.Print.print;

public class WhileTest {
    static boolean condition(){
        boolean result=Math.random()<0.99;
        print(result+",");
        return result;
    }

    public static void main(String[] args) {
        //只要while()中的条件为true 就重复执行循环体中的语句。
        while(condition()) {
            print("Inside 'while'");
        }

        print("Exited 'while'");
    }
}
