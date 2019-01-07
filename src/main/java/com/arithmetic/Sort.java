package com.arithmetic;


import static com.wsloan.util.Print.print;
import static com.wsloan.util.Print.printf;

public class Sort {

    public static void main(String[] args) {
        int[] numbers={78,56,45,34,23,12,1,13};
        buubbleSort(numbers);

    }
    /**
     * 冒泡排序
     * 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
     * 对每一对相邻元素做同样的工作，从开始第一对到结尾最后一对。在这一点，最后的元素应该会是最大的数。
     * 针对所有的元素重复以上步骤，直到没有任何一对数字需要比较。
     * 时间复杂度: O(n^2)
     * 实质:把小（大）的元素往前（后）调
     * @param numbers 需要排序的整数数组
     * @return 排完序之后的整数数组
     */
    public static  int[] buubbleSort(int[] numbers){
        int temp=0;
        int size=numbers.length;
        for (int i = 0; i <size-1 ; i++) {
            for (int j = 0; j <size-1-i ; j++) {
                printf("下标 "+j+" 和下标 "+(j+1)+" 进行比较");
                if(numbers[j+1]<numbers[j]){
                    temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                    print(numbers[j+1]+" 大于 "+numbers[j]+" 所以交换位置");
                }else{
                    print(numbers[j+1]+" 不大于 "+numbers[j]+" 所以不交换位置");
                }
                for (int k = 0; k <size ; k++) {
                    printf(numbers[k]+" ");
                }
                print();
            }
            printf("外循环"+i+"  ");
            for (int k = 0; k <size ; k++) {
               printf(+numbers[k]+" ");
            }
            print();
        }

        return numbers;
    }
}
