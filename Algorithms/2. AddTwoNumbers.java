class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // recursive iteration
        LinkedList result = new LinkedList();
        boolean remain = false;
        
        if(l1.val + l2.val >= 10){remain = true;}
        
        if(l1.next == null && l2.next == null){return new ListNode(l1.val+l2.val);}
        
        return remain? result.add(addTwoNumbers(l1.next, l2.next).val + 1):result.add(addTwoNumbers(l1.next, l2.next).val);
        
    
    }
    
}
