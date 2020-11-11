package com.jeng.design.pattern.behavioral.strategy;


/**
 * 排序器（非单例，每种需要排序的类型都有一个对应的sort对象，所以可以使用泛型）
 */
public class Sort<T> {

    public void sort(T[] arr, Comparator<T> comparator) {
        for (int i = 0; i < arr.length-1; i++) {
            int minPos = i;

            for (int j = i + 1; j < arr.length; j++) {
                minPos = comparator.compare(arr[j], arr[minPos]) > 0 ? minPos : j;
            }
            swap(arr, i, minPos);
        }
    }

    private void swap(T[] arr, int i, int minPos) {
        T temp = arr[i];
        arr[i] = arr[minPos];
        arr[minPos] = temp;
    }
}
