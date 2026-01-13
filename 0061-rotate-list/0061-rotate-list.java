/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp = head;
        ListNode result = head;
        if(head==null || head.next==null)
        {
            return head;
        }
        int size = 0;
        int store_temp = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        while(temp!=null)
        {
            arr.add(temp.val);
            temp = temp.next;
            size++;
        }
        int count = size;
        k = k % size;

        while (k != 0) {
             store_temp = arr.get(size -1); 
            arr.add(0, store_temp);             
            arr.remove(size);                   
            k--;
        }
        int i = 0;
        while(result!=null && i<count)
        {
            result.val = arr.get(i);
            result = result.next;
            i++;
        }
        return head;
    }
}