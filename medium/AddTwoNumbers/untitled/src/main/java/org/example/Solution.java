package org.example;

import java.math.BigInteger;

class Solution {
    public ListNode res;
    public String str3;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {


        if(l1.val == 0 && l2.val == 0 && l1.next == null && l2.next == null){
            return new ListNode(0);
        }


        Long z;
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        while(l1 != null){
            str1.append(l1.val);
            l1 = l1.next;
        }
        while(l2 != null){
            str2.append(l2.val);
            l2 = l2.next;
        }
        BigInteger x = new BigInteger(str1.reverse().toString());
        BigInteger y = new BigInteger(str2.reverse().toString());
        x = x.add(y);
        String reversedStr = new StringBuilder(String.valueOf(x))
                .reverse()
                .toString();
        res = new ListNode(Integer.parseInt(String.valueOf(reversedStr.charAt(0))));
        ListNode current = res;
        for(int i = 1; i < reversedStr.length(); i++){
            current.next = new ListNode(Integer.parseInt(String.valueOf(reversedStr.charAt(i))));
            current = current.next;
        }
        return res;
    }
}
