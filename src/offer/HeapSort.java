package offer;

import java.util.Arrays;

public class HeapSort {
    private static int[] array = new int[] {
            8, 1, 9, 3, 7, 5, 6, 2, 0, 10, 11
    };

    private static int heapSize = array.length;

    public static void buildHeap() {
        int size = array.length - 1;
        for (int i = (size - 1) / 2; i >= 0; i--) {
            adjustHeap(i);
        }
    }

    public static void adjustHeap(int n) {
        int leftChild = 2 * n + 1;
        int rightChild = 2 * n + 2;
        if (leftChild >= heapSize && rightChild >= heapSize) {
            return;
        }
        int leftValue = array[leftChild];
        int rightValue = rightChild >= heapSize ? Integer.MIN_VALUE : array[rightChild];
        int curValue = array[n];
        if (Math.max(leftValue, rightValue) <= curValue) {
            return;
        }
        if (leftValue < rightValue) {
            int temp = array[n];
            array[n] = array[rightChild];
            array[rightChild] = temp;
            adjustHeap(rightChild);
        } else {
            int temp = array[n];
            array[n] = array[leftChild];
            array[leftChild] = temp;
            adjustHeap(leftChild);
        }
    }

    public static void sort() {
        while (heapSize > 0) {
            int temp = array[0];
            array[0] = array[heapSize - 1];
            array[heapSize - 1] = temp;
            heapSize --;
            adjustHeap(0);
        }
    }

    public static void main(String[] args) {
        buildHeap();
        System.out.println(Arrays.toString(array));
        sort();
        System.out.println(Arrays.toString(array));
    }
}
