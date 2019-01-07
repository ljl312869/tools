package com.javadata;

import static com.wsloan.util.Print.print;

public class TestMyArray {
    public static void main(String[] args) {
        MyArray arr=new MyArray(3);
        arr.insert(100);
        arr.display();
        arr.insert(3);
        arr.display();
        arr.insert(5);
        arr.display();
     //!   arr.insert(89);
        print(arr.search(4));
        print(arr.get(0));
        arr.delete(2);
        arr.display();
    }
}
