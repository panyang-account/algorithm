package sort;

import java.util.Arrays;

/**
 * @Author: 潘杨
 * @Date: 2022/7/15-23:15
 * @Version 1.0
 * @Description: 插入排序
 */
public class InsertSort {
    /**
     * @param arr 待排序数组
     * @return int[]
     * @Author 潘杨
     * @Description
     * @Date 2022/7/15-23:24
     **/
    public static int[] insertSort(int[] arr) {
        if (arr.length == 0 || arr.length == 1) {
            return arr;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(j, j + 1, arr);
            }
        }
        return arr;
    }

    /**
     * @param j   位置j
     * @param i   位置i
     * @param arr 数组
     * @Author 潘杨
     * @Description 交换数组中两个位置的值，两个位置不能相同
     * @Date 2022/7/15-23:26
     **/
    private static void swap(int j, int i, int[] arr) {
        arr[j] = arr[j] ^ arr[i];
        arr[i] = arr[j] ^ arr[i];
        arr[j] = arr[j] ^ arr[i];
    }

    public static void main(String[] args) {
        int[] ints = {7, 3, 9, 5, 1};
        System.out.println(Arrays.toString(insertSort(ints)));
    }
}

