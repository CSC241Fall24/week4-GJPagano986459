
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
        // If l1 is null, return l2 (which could also be null)
        if (l1 == null) {
            return l2;
        }
        // If l2 is null, return l1 as is
        if (l2 == null) {
            return l1;
        }
    
        // Create a pointer for l1 to traverse to the end
        ListNode current = l1;
    
        // Traverse to the end of l1
        while (current.next != null) {
            current = current.next;
        }
    
        // Append nodes from l2 to l1
        ListNode l2Current = l2;
        while (l2Current != null) {
            ListNode newNode = new ListNode(l2Current.val);
            current.next = newNode; // Link the new node to the end of l1
            current = newNode; // Move current to the new node
            l2Current = l2Current.next; // Move to the next node in l2
        }
    
        return l1; // Return the modified l1
    }
}