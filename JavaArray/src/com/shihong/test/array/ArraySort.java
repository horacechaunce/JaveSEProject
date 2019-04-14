package com.shihong.test.array;


/**
 * @author shihong on 2019/4/13.
 */
public class ArraySort {

    /**
     * 输出排序使用方法
     *
     * @param arr
     */
    public static void outPut(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + ",");
            } else {
                System.out.println(arr[i]);
            }
        }
    }

    /**
     * 数组的正向、逆向遍历
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {-1, 94, 2, 45, 23, 43, 78, 6, 69};


        //选择排序
        outPut(arr);//排序前
        selectSort(arr);
        outPut(arr);//排序后

        //冒泡排序一
        outPut(arr);
        bubbleSort_1(arr);
        outPut(arr);
        //冒泡排序二
        outPut(arr);
        bubbleSort_2(arr);
        outPut(arr);


    }



    /**
     * 选择排序
     * 外循环的一个位置的元素与内循环的所有元素比较大小
     *
     * @param arr
     */
    public static void selectSort(int[] arr) {

        //长度-1因为最后一个数组元素没有必要跟自身比较
        for (int i = 0; i < arr.length - 1; i++) {
            // j从i+1开始，因为没有必要跟自身比较
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    /**
     * 冒泡排序一
     * 内循环的元素依次两两比较大小
     *
     * @param arr
     */
    public static void bubbleSort_1(int[] arr) {
        //长度-1因为最后一个数组元素没有必要跟自身比较
        for (int i = 0; i < arr.length - 1; i++) {
            // 内循环长度-1是为了防止下标越界，
            // -i是为了使外循环一次后内循环参与比较元素递减
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /**
     * 冒泡排序二
     *
     * @param arr
     */
    public static void bubbleSort_2(int[] arr) {

        //i>0因为倒序循环时最后一个数组元素没有必要跟自身比较即arr[0]
        for (int i = arr.length - 1; i > 0; i--) {
            // j < i 原理同冒泡排序一是一样的因为i自减
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

}
