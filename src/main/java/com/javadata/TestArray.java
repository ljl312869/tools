package com.javadata;

import static com.wsloan.util.Print.print;

public class TestArray {
    public static void main(String[] args) {
        long[] arr=new long[10];
        long[] arr1=new long[]{2,3,4};
        arr[0]=1;
        print(arr1[0]);
        print(arr1[1]);
        print(arr1[2]);
        print(arr1[3]);//java.lang.ArrayIndexOutOdBoundsException:3
    }
}
