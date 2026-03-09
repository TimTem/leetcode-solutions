package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class App
{
    public static void main( String[] args )
    {
        Solution solution = new Solution();
        System.out.println(solution.findMedianSortedArrays(new int[]{1,2} , new int[]{3,4} ));
    }

}

