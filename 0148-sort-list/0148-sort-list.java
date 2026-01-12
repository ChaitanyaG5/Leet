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
    public ListNode sortList(ListNode head) {
        ListNode traverse = head;
        ListNode temp = head;
        ArrayList<Integer>arr = new ArrayList<>();
        while(traverse!=null)
        {
            arr.add(traverse.val);
            traverse = traverse.next;
        }
        Collections.sort(arr);
        int i = 0;
        while(temp!=null && i<arr.size())
        {
            temp.val = arr.get(i);
            temp = temp.next;
            i++;
        }
        return head;
        }
}