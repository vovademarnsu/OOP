package ru.nsu.medvedev.v;

public class HeapSort {
    public void sort(int arr[]) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        for (int i = n - 1; i > 0; i--) {
            int a = arr[0];
            arr[0] = arr[i];
            arr[i] = a;
            heapify(arr, i, 0);
        }
    }

    public void heapify(int arr[], int n, int i) {
        int max = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && arr[l] > arr[max]) {
            max = l;
        }
        if (r < n && arr[r] > arr[max]) {
            max = r;
        }
        if (max != i) {
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
            heapify(arr, n, max);
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 1, 2, 2, 2, 123};
        HeapSort hp = new HeapSort();
        hp.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

