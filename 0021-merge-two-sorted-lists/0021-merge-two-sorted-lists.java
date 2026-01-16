class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode temp = list1;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = list2;

        ArrayList<Integer> list = new ArrayList<>();
        ListNode traverse = list1;

        while (traverse != null) {
            list.add(traverse.val);
            traverse = traverse.next;
        }

        Collections.sort(list);

        traverse = list1;
        int i = 0;
        while (traverse != null) {
            traverse.val = list.get(i++);
            traverse = traverse.next;
        }

        return list1;
    }
}
