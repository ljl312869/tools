package com.control;

import java.util.Random;

import static com.wsloan.util.Print.print;

public class ForEachFloat {
    public static void main(String[] args) {
        Random random=new Random(47);
        float f[]=new float[10];
        for (int i = 0; i <f.length ; i++) {
            f[i]=random.nextFloat();
        }
        for (float x:f) {
           print(x);
        }


    }
}
