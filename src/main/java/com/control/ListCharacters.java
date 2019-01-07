package com.control;

import static com.wsloan.util.Print.print;

public class ListCharacters {
    public static void main(String[] args) {
        for(char c=0;c<128;c++){
           // print("value: "+(int)c+"  character: "+c);
        }

        //逗号操作符
        for (int i = 1,j=i+10; i <5 ; i++,j=i*2) {
            print("i= "+i+" j= "+j);

        }
    }
}
