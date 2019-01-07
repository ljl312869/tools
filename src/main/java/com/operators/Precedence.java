/***************************************************
 *   Copyright (C), 2018-2018, 李山聚财科技有限公司
 ***************************************************/
package com.operators;

import static com.wsloan.util.Print.*;

/**
 * Description
 *
 * @author lijunlei
 * @version 1.0
 * @CreateDate 2018/11/12 12:05
 */
public class Precedence {
    public static void main(String[] args) {
        int x=1,y=2,z=3;
        int a=x+y-2/2+z;
        int b=x+(y-2)/(2+z);
        print("a = "+a+" b = "+b );
    }
}
