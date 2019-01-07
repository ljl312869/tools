package com.control;

import static com.wsloan.util.Print.print;

public class CommaaOperator {
    public static void main(String[] args) {
        for (int i = 1,j=i+10; i <5 ; i++,j=i*2) {
            print("i= "+i+" j= "+j);
        }
    }
}
