package org.example;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        ListNode l1 = new ListNode(0, new ListNode(8,new ListNode(8,new ListNode(8,new ListNode(8,new ListNode(2,new ListNode(9,new ListNode(3,new ListNode(1,new ListNode(1))))))))));
        ListNode l2 = new ListNode(0, new ListNode(9, new ListNode( 1,new ListNode( 5,new ListNode( 5,new ListNode( 5,new ListNode( 1,new ListNode( 1,new ListNode( 6)))))))));
        Solution s = new Solution();
        ListNode l3 = s.addTwoNumbers(l1,l2);
        while(l3 != null) {
            System.out.println(l3.val);
            l3 = l3.next;
        }
        //System.out.println((int) Math.pow(10, (int) Math.log10(2234)));
    }
}
