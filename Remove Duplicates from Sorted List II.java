class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        
        ListNode list=new ListNode(0);
        list.next=head;
        ListNode pre=list;
        ListNode cur=head;
        
        while(cur!=null){
            while(cur.next!=null&&cur.val==cur.next.val){
                cur=cur.next;
            }
            if(pre.next==cur){
                pre=pre.next;
            }
            else{
                pre.next=cur.next;
            }
            cur=cur.next;
        }
        return list.next;
    }
}
