class Solution {
    public ListNode partition(ListNode head, int x) {
        Queue<Integer> left = new LinkedList<>();
        Queue<Integer> right = new LinkedList<>();
        ListNode curr = head;
        while (curr != null){
            if (curr.val < x) {
                left.add(curr.val);
            }
            else {
                right.add(curr.val);
            }
            curr = curr.next;
        }
        
        curr = head;
        while (curr != null) {
            if (!left.isEmpty()) {
                curr.val = left.remove();
            }
            else {
                curr.val = right.remove();
            }
            curr = curr.next;
        }
        
        return head;
    }
}
