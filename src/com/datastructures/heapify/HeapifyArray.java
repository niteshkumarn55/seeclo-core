package com.datastructures.heapify;

public class HeapifyArray {

    public static void main(String[] args) {
        int[] arr = {1,2,5,2,7,2,89,3,6,31,0,2};
        HeapifyArray heapifyArray = new HeapifyArray();
        heapifyArray.buildHeapify(arr);
        heapifyArray.prinfHeap(arr);
    }

    static void heapify(int[] arr, int n, int i){
        int largest = i;
        int leftNode = i*2+1;
        int rightNode = i*2+2;

        if(leftNode<n && arr[leftNode]>arr[largest]){
            largest = leftNode;
        }
        if(rightNode<n && arr[rightNode]> arr[largest]){
            largest = rightNode;
        }

        if(largest != i){
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;

            heapify(arr,n,largest);

        }

    }

    static void prinfHeap(int[] arr){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }

    }

    static void buildHeapify(int[] arr){
        int n = arr.length;
        int startIdx = (n/2) - 1;
        for (int i = startIdx; i>=0 ; i--){
            heapify(arr, n, i);
        }
    }
}
