package com.javadata;

import static com.wsloan.util.Print.*;

public class MyArray {
    private  long[] arr;
    //表示有限的数据长度
    private  int elements;

    /**
     * 默认长度为50的构造方法
     */
    public MyArray(){
        this.arr=new long[50];
    }

    /**
     * 重载的构造方法  长度有参数提供
     * @param maxsize
     */
    public MyArray(int maxsize){
        arr=new long[maxsize];
    }

    /**
     * 添加数据
     * @param value
     */
    public void insert(long value){
        if(elements<arr.length) {
            arr[elements] = value;
            elements++;
        }else{
            throw new ArrayIndexOutOfBoundsException("添加数据MyArray下标越界异常");
        }
    }

    /**
     * 显示数据
     */
    public void display(){
        printnb("[");
        for (int i = 0; i <elements ; i++) {
            printnb(arr[i]+" ");
        }
        print("]");
    }
    /**
     * 查找数据,依据索引来查
     */
    public long get(int index){
        if(index<0||index>=elements){
            throw new ArrayIndexOutOfBoundsException("查找数据MyArray下标越界异常");
        }else {
            return arr[index];
        }
    }

    /**
     * 查找数据 更具value值返回索引
     * @param value
     * @return
     */
    public int search(long value){
        int i;
        for ( i = 0; i <elements ; i++) {
            if(arr[i]==value){
               break;
            }
        }

        if(i==elements){
            return -1;
        }else {
            return i;
        }
    }
    /**
     * 删除数据
     */
    public void delete(int index){
        if(index<=0||index>=elements){
            throw  new ArrayIndexOutOfBoundsException("删除数据MyArray下标越界异常");
        }else {
            for (int i =index ; i <elements ; i++) {
                arr[index]=arr[index+1];
            }
            elements--;
        }
    }

    /**
     * 更新数据
     */
    public void change(int index,long value){
        if(index<0||index>=elements){
            throw  new ArrayIndexOutOfBoundsException("更新数据MyArray下标越界异常");
        }else{
            arr[index]=value;
        }
    }
}
