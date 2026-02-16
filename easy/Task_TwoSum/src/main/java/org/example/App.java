package org.example;
public class App
{
    public static void main( String[] args )
    {
        int[] x = {2,5,5,11};
        int[] y;
        int targer = 10;
        Solution scr = new Solution();
        y = scr.twoSum(x, targer);
        for(int i = 0 ; i < y.length; i++){
            System.out.println(y[i]);
        }
    }
}

