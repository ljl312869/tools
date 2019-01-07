/***************************************************
 *   Copyright (C), 2018-2018, 李山聚财科技有限公司
 ***************************************************/
package com.wsloan.util;

import java.io.*;

/**
 * Description
 *
 * @author lijunlei
 * @version 1.0.0
 * @CreateDate 2018/11/12 10:09
 */
public class Print {
    /**
     * Print with a newline:
     * @param obj
     */
     public static void print(Object obj) {
        System.out.println(obj);
    }


    /**
     *  Print a newline by itself:
     */
    public static void print() {
        System.out.println();
    }

    /**
     * Print with no line break:
      * @param obj
     */
    public static void printnb(Object obj) {
        System.out.print(obj);
    }

    /**
     * The new Java SE5 printf() (from C):
     * @param format
     * @param args
     * @return
     */
    public static PrintStream printf(String format, Object... args) {
        return System.out.printf(format, args);
    }
}
