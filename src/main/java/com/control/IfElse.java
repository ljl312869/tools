package com.control;

import static com.wsloan.util.Print.print;

public class IfElse {
    static int result=0;
    /**
     * 比较两个值之间的大小
     * @param testval
     * @param target
     */
    static void test(int testval,int target){
        if(testval>target){
            result=1;
        }else if(testval<target){
            result=-1;
        }else {
            result=0;
        }
    }

    public static void main(String[] args) {
        test(10,5);
        print(result);
        test(5,10);
        print(result);
        test(5,5);
        print(result);
    }
}
