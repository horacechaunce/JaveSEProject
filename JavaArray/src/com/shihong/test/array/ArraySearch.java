package com.shihong.test.array;

import java.util.Arrays;

/**
 * @author shihong on 2019/4/20.
 *         数组查找
 */
public class ArraySearch {

    /**
     * 数组的中数组的查询
     *
     * @param args
     */
    public static void main(String[] args) {
        //无序的数组进行数据的查询
        int[] arr = new int[]{1, 2, 32, 45, 85, 98, 74, 4, 65, 11, 4};
        int i = searchIndex(arr, 20);
        System.out.println("i = " + i);

        //二分查询一，数组要有序才可以使用二分查询
        int[] arr1 = new int[]{1, 3, 5, 9, 10, 13, 14, 16, 18, 20, 25, 28, 36};
        int i1 = binarySearch(arr1, 0);
        System.out.println("i1 = " + i1);

        // 二分查询二。数组要有序才可以使用二分查询
        int i2 = binarySearch_2(arr1, 200);
        System.out.println("i2 = " + i2);

        int i3 = Arrays.binarySearch(arr1, 200);
        System.out.println("i3 = " + i3);

    }


    /**
     * 无序的数组进行数据的查询
     *
     * @param arr
     */
    public static int searchIndex(int[] arr, int key) {

        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 二分查询一，
     *  找不到时返回 -1 - min 是查找不到时返回找不到的这个数的插入点再 -1；
     * @param arr1
     * @param key
     * @return
     */
    public static int binarySearch(int[] arr1, int key) {
        int min = 0;
        int max = arr1.length - 1;
        int mid = (min + max) / 2;

        while (arr1[mid] != key) {
            if (key > arr1[mid]) {
                min = mid + 1;
            } else if (key < arr1[min]) {
                max = mid - 1;
            }
            //min > max 说明不在查询范围内
            if (min > max) {
                return -1 - min;
            }
            mid = (min + max) / 2;
        }
        return mid;
    }

    /**
     * 二分查询二，
     * 找不到时返回 -1 - min 是查找不到时返回找不到的这个数的插入点再 -1；
     * @param arr
     * @param key
     * @return
     */
    public static int binarySearch_2(int[] arr, int key) {
        int min = 0;
        int max = arr.length - 1;
        //min < max 说明还在查找范围内
        while (min <= max) {
            int mid = (max + min) / 2;
            if (key > arr[mid])
                min = mid + 1;
            else if (key < arr[mid])
                max = mid - 1;
            else
                return mid;
        }

        return -1 - min;
    }
}
