package com.shihong.test.array;

/**
 * @author shihong on 2019/4/14.
 * 数组比较大小
 */
public class ArrayConparisionSize {

    public static void main(String[] args) {
        int[] arr = {-1, 94, 2, 45, 23, 43, 78, 6, 69};
        //正序遍历 arr.fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        System.out.println("------------华丽的分隔线--------------");
        //逆序遍历 arr.forr
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);

        }

        //遍历获取最值 方法一，利用中间变量比较
        int maxInt = getMaxInt(arr);
        System.out.println("max :" + maxInt);
        //遍历获取最值 方法二，利用数组角标做为中间变量
        int minInt = getMinInt(arr);
        System.out.println("min:" + minInt);
    }

    /**
     * 遍历获取最值 方法一，利用中间变量比较
     *
     * @param arr
     * @return
     */
    public static int getMaxInt(int[] arr) {
        //定义一个中间变量用于比较大小
        int temp = arr[0];
        //这里 i  的值从1开始是因为定义中间变量用于比较时已经用了arr[0]
        //在数组遍历比较的时候没有必要再比较一次自身
        for (int i = 1; i < arr.length; i++) {
            if (temp < arr[i]) {
                temp = arr[i];
            }
        }
        return temp;   
    }

    /**
     * 遍历获取最值 方法二，利用数组角标做为中间变量
     *
     * @param arr
     * @return
     */
    public static int getMinInt(int[] arr) {
        //定义一个中间变量，利用数组角标
        int temp = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[temp] > arr[i]) {
                temp = i;
            }
        }
        return arr[temp];
    }
}
