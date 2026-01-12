class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 1) return head;

        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp = head;

        while (temp != null) {
            arr.add(temp.val);
            temp = temp.next;
        }

        int size = arr.size();

        // reverse only complete k-groups
        for (int i = 0; i + k <= size; i += k) {
            int left = i;
            int right = i + k - 1;

            while (left < right) {
                int t = arr.get(left);
                arr.set(left, arr.get(right));
                arr.set(right, t);
                left++;
                right--;
            }
        }

        temp = head;
        int idx = 0;
        while (temp != null) {
            temp.val = arr.get(idx++);
            temp = temp.next;
        }

        return head;
    }
}
