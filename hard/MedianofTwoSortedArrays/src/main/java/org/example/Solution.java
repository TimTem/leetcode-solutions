package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2)).boxed().collect(Collectors.toList());
        list = list.stream().sorted().toList();
        if(list.size() % 2 == 0){
            double x = (double) ((list.get(list.size() / 2)  + list.get((list.size() / 2) - 1))  / 2.0);
            return x;
        } else {
           return list.get(list.size() / 2);
        }
    }
}