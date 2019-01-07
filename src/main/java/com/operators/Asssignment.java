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
 * @CreateDate 2018/11/12 13:07
 */
class Tank{
    int level;
}
public class Asssignment {
    public static void main(String[] args) {
        Tank t1=new Tank();
        Tank t2=new Tank();
        t1.level=9;
        t2.level=47;
        print("1: t1.level: "+t1.level+". t2.level: "+t2.level);
        t1=t2;
        print("2: t1.level: "+t1.level+". t2.level: "+t2.level);
        t1.level=27;
        print("3: t1.level: "+t1.level+". t2.level: "+t2.level);
    }
}
