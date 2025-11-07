package com.ohgiraffers.section01.sorting;

import java.util.Arrays;

/*
* TimSort 구현하기
*
* 삽입정렬과 병합 정렬의 장점을 결합한 하이브리드 정렬 알고리즘
* 작은 배열(ex: 길이 32이하)은 삽입정렬로 정렬한 후, 병합 정렬 방식으로 전체 배열을 병합한다.
* */
public class Practice1 {

    // Timsort에서 사용할 RUN의 크기(작은 배열은 삽입 정렬로 정렬)
    private static final int RUN = 32;

    public static void timSort(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n; i += RUN){
            insertionSort(arr, i, Math.min((i + RUN - 1), n - 1));
        }

        System.out.println("삽입정렬 수행 수의 arr : " + Arrays.toString(arr));
        /* 병합 과정에서 병합할 두 구간의 크기(size) 를 조정
         * 배열 전체를 다룰 때까지 병합할 구간의 크기를 확장
         * 한 단계마다 두 개의 정렬된 구간을 병합하여 구간 크기를 두 배로 늘림
         * 처음에는 두 개의 RUN 구간을 병합하고, 그 다음에는 두 개의 2×RUN 구간을 병합
         * */
        for(int size = RUN; size < n; size = 2 * size){
            /* 배열 전체를 순회하면서, 현재 size에 해당하는 두 개의 정렬된 구간을 찾아서 병합
             * 한 번에 두 개의 구간(각각의 크기가 size)을 병합하기 때문에
             * 병합이 끝난 후 다음 두 구간으로 건너뛰기 위해 2×size 만큼 증가
             * */
            for(int left = 0; left < n ; left += 2 * size){

            }
        }
    }

    /* 주어진 구간에 대해 삽입 정렬을 수행하는 메소드 */
    private static void insertionSort(int[] arr, int left, int right) {
        for(int i = left + 1; i <= right; i++){
            int key = arr[i];
            int j = i - 1;
            while(j >= left && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

}
