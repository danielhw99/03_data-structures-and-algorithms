package com.lhw.section01.timecomplexity;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {

        int [] arr = {3,1,2,15,4,9,10,7};
        System.out.println(getFirst(arr));
        System.out.println(binarySearch(arr,9));
        System.out.println(Arrays.toString(reverse(arr)));
        System.out.println(Fibonacci(10));
    }

    public static int getFirst(int[] nums) {
        return nums[0];
    }
    public static int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2; //while문을 돌 때마다 범위가 ½씩 줄어 듦!
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    /*선형시간 O(n)*/
    public static int[] reverse(int[] nums) {
        int[] reversed = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            reversed[nums.length - i - 1] = nums[i];
        }
        return reversed;
    }

    /*피보나치 수열*/
    public static int Fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return Fibonacci (n - 1) + Fibonacci (n - 2);
    }



}
