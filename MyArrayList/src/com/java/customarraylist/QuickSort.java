package com.java.customarraylist; 

public class QuickSort {
    
    private QuickSort() {}

    public static <T extends Comparable<? super T>> void quicksort(MyList<T> list) {

        if (list.isEmpty() || list.size() == 1) {
            return;
        } else if (list.size() == 2) {
            if (list.get(0).compareTo(list.get(1)) > 0) {
                swap(list, 0, 1);
            }
            return;
        } else {
            quicksort(list, 0, list.size() - 1);
        }
    }

    private static <T extends Comparable<? super T>> void quicksort(MyList<T> list, int from, int to) {

        int left = from;
        int right = to;

        T pivot = list.get(pivotSelect(list, from, to));

        while (left <= right) {
            while (list.get(left).compareTo(pivot) < 0) {
                left++;
            }
            while (list.get(right).compareTo(pivot) > 0) {
                right--;
            }
            if (left <= right) {
                swap(list, left, right);
                left++;
                right--;
            }
        }
        if (from < right) {
            quicksort(list, from, right);
        }
        if (left < to) {
            quicksort(list, left, to);
        }
    }

    private static <T extends Comparable<? super T>> int pivotSelect(MyList<T> list, int from, int to) {

        int pivot = -1;

        int middle = (from + to) / 2;

        if (list.get(middle).compareTo(list.get(from)) > 0 && list.get(middle).compareTo(list.get(to)) > 0) {

            if (list.get(from).compareTo(list.get(to)) > 0) {
                pivot = from;
            } else {
                pivot = to;
            }
        } else if (list.get(from).compareTo(list.get(middle)) > 0 && list.get(from).compareTo(list.get(to)) > 0) {
            if (list.get(middle).compareTo(list.get(to)) > 0) {
                pivot = middle;
            } else {
                pivot = to;
            }
        } else {
            if (list.get(from).compareTo(list.get(middle)) > 0) {
                pivot = from;
            } else {
                pivot = middle;
            }
        }

        return pivot;
    }

    private static <T> void swap(MyList<T> list, int from, int to) {
        T temp = list.get(from);
        list.set(from, list.get(to));
        list.set(to, temp);
    }

}
