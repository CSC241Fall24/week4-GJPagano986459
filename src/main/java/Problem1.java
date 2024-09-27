// Problem1.java
/*3.1 Problem 1: Concatenate Two Linked Lists
Implement a function to concatenate two linked lists.
• Function signature: public static ListNode concatenate(ListNode l1, ListNode l2)
• Input: Two linked lists l1 and l2
• Output: The modified l1 with l2 appended to its end
• Constraints:
– Do not modify l2
– Create new nodes when appending l2 to l1 (do not directly link nodes from l1
to l2)
∗ This means you should create a new ListNode for each node in l2
∗ Copy the value from each l2 node to your new node
∗ Add these new nodes to the end of l1
∗ This approach preserves the original l2 list
∗ Avoid doing current.next = l2; as this would modify l2
∗ Instead, use a loop to create and link new nodes
• Example:
– Input: l1 = (2 -> 3 -> 1), l2 = (4 -> 5)
– Output: (2 -> 3 -> 1 -> 4 -> 5) */
public class Problem1 {
    public static ListNode concatenate(ListNode l1, ListNode l2) {
        // TODO: Implement the concatenate method
        ListNode current = l1;
        // This method should concatenate l2 to l1 and return l1
        while (current.next != null) {
           current = current.next; 
        }
        ListNode l2Current = l2;
        while (l2Current != null){
            ListNode newNode = new ListNode(lsCurrent.val);
            current.next = newNode;
            current = newNode;
            l2Current = l2Current.next;
        }
        // Remember to create new nodes instead of directly linking l1 to l2
        return l1;
    }
}