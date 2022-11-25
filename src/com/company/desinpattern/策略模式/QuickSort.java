package com.company.desinpattern.策略模式;

import java.util.Arrays;
import java.util.Random;

/**
 * @author ：sjq
 * @date ：Created in 2022/7/3 21:06
 * @description：
 * @modified By：
 * @version: $
 */
public class QuickSort implements SortStrategy {
    @Override
    public void sort(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }


    private void quickSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        // 计算Partition
        int partition = partition(nums, left, right);
        quickSort(nums, left, partition - 1);
        quickSort(nums, partition + 1, right);
    }

    private int partition(int[] nums, int left, int right) {
        int temp = nums[left];

        int l = left + 1;
        int r = right;

        while (l <= r) {
            while (l <= r && nums[l] <= temp) {
                l++;
            }
            while (l <= r && nums[r] > temp) {
                r--;
            }
            if (l > r) {
                break;
            }
            swap(nums, l, r);
            l++;
            r--;
        }
        swap(nums, left, r);
        return r;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] nums = new int[]{5, 2, 3, 1};
        quickSort.sort(nums);
    }
}
