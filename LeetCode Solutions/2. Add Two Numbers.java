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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int carryOverValue = 0;
        int nodeSum = 0;
        ListNode head = null;
        ListNode curr = head;
        ListNode prev = null;
        
        // If both lists have length of 1
        if (l1.next == null && l2.next == null) {
            nodeSum = l1.val + l2.val;
            if (nodeSum >= 10) {
                carryOverValue = (nodeSum % 100) / 10;
                head = new ListNode(nodeSum % 10, new ListNode(carryOverValue, null));
            } else {
                return new ListNode(nodeSum, null);
            }
            
        }
        
        
        for (int i = 0; i < 100; i++) {
            
            // If both ListNodes are null
            if (l1 == null && l2 == null) {
                if (carryOverValue != 0) {
                    ListNode newNode = new ListNode();
                    newNode.next = null;
                    newNode.val = carryOverValue;
                    prev.next = newNode;
                }
                
                break;
            } 
            
            // Create new ListNode for sumList
            //ListNode newNode = new ListNode();
            //newNode.next = head;
            //head = newNode;
            ListNode newNode = new ListNode();
            newNode.next = null;
            
            if (head == null) {
                head = newNode;
            }
            
            
            // If both ListNodes not null
            if (l1 != null && l2 != null) {
                
                nodeSum = l1.val + l2.val + carryOverValue;
                newNode.val = nodeSum % 10;
                
                l1 = l1.next;
                l2 = l2.next;              
                
                    
            }
            
            // If only l1 is not null
            
            else if (l1 != null && l2 == null) {
                nodeSum = l1.val + carryOverValue;
                newNode.val = nodeSum % 10;
                
                l1 = l1.next;
                
                    
            }
            
            // If only l2 is not null
            
            else if (l1 == null && l2 != null) {
                nodeSum = l2.val + carryOverValue;
                newNode.val = nodeSum % 10;
                
                l2 = l2.next;
                    
            }   
            
            if (nodeSum >= 10) carryOverValue = (nodeSum % 100) / 10;
            else carryOverValue = 0;
            
            if (prev == null) prev = newNode;
            prev.next = newNode;
            prev = newNode;
        }
        
        return head;
        
    }
}
