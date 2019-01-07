/***************************************************
 *   Copyright (C), 2018-2018, 李山聚财科技有限公司
 ***************************************************/
package com.operators;
import static com.wsloan.util.Print.print;
/**
 * Description
 *
 * @author lijunlei
 * @version 1.0
 * @CreateDate 2018/11/12 14:29
 */
class Letter{
    char c;
}
public class PassObject {
    static void f(Letter y){
        y.c='z';
    }
    public static void main(String[] args) {
        Letter x=new Letter();
        x.c='a';
        print("1. x.c: "+x.c);
        f(x);
        print("2. x.c: "+x.c);
    }
}
