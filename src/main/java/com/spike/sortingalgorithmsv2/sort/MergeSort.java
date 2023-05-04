package com.spike.sortingalgorithmsv2.sort;

import java.util.ArrayList;
import java.util.List;

public class MergeSort implements Sort {

    public void sort(List<Integer> salaries){
        int start=0;
        int end = salaries.size()-1;
        mergeSort(salaries,start,end);
    }

    private void mergeSort(List<Integer> salaries, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(salaries, start, mid);
            mergeSort(salaries, mid + 1, end);
            merge(salaries, start, mid, end);
        }
    }

    private void merge(List<Integer> salaries, int start, int mid, int end) {
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i = start; i <= mid; i++) {
            left.add(salaries.get(i));
        }
        for (int j = mid + 1; j <= end; j++) {
            right.add(salaries.get(j));
        }
        int i = 0, j = 0, k = start;
        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
                salaries.set(k, left.get(i));
                i++;
            } else {
                salaries.set(k, right.get(j));
                j++;
            }
            k++;
        }
        while (j < right.size()) {
            salaries.set(k, right.get(j));
            j++;
            k++;
        }
        while (i < left.size()) {
            salaries.set(k, left.get(i));
            i++;
            k++;
        }
    }
}
