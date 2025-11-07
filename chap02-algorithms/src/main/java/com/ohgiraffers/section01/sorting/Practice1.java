package com.ohgiraffers.section01.sorting;

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
