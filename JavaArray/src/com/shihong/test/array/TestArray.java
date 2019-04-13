package com.shihong.test.array;

/**
 * @author shihong on 2019/4/13.
 */
public class TestArray {

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

        //选择排序
        outPut(arr);//排序前
        selectSort(arr);
        outPut(arr);//排序后

        //冒泡排序一
        outPut(arr);
        maoPaoSort_1(arr);
        outPut(arr);
        //冒泡排序二
        outPut(arr);
        maoPaoSort_2(arr);
        outPut(arr);


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
    public static void maoPaoSort_1(int[] arr) {
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
    public static void maoPaoSort_2(int[] arr) {

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
