class Algo1_day_10_2 {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode rest_head=reverseList(head.next);
        ListNode rest_tail=head.next;
        rest_tail.next=head;
        head.next=null;
        return rest_head;
        
    }
}
