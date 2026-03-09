package org.example;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int x = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (char chr : s.toCharArray()){
            if (stringBuilder.indexOf(String.valueOf(chr)) != -1) {
                stringBuilder.delete(0,stringBuilder.indexOf(String.valueOf(chr))+1);
                stringBuilder.append(chr);
            } else {
                stringBuilder.append(chr);
                x = Math.max(x, stringBuilder.length());
            }
        }
        System.out.println(stringBuilder);
        return x;
    }
}