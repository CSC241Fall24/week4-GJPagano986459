/*
Greg Pagano Jr.

 * 3.2 Problem 2: Insert a Node into a Linked List
Implement a function to insert a new node with a given value at a specified position in a
linked list.
• Function signature: public static ListNode insert(ListNode head, int val, int
position)
• Input:
– head: The head of the linked list
– val: The value to be inserted
– position: The position at which to insert the new node (1-indexed)
• Output: The head of the modified linked list
• Constraints:
– If the position is out of bounds, insert the node at the end of the list
CSC 241 Homework 3 - Page 3 of 2 09/19/2024
– If the position is 1 or the list is empty, insert at the beginning
• Example:
– Input: head = (1 -> 2 -> 3), val = 4, position = 2
– Output: (1 -> 4 -> 2 -> 3)
 */
public class Problem2 {
    public static ListNode insert(ListNode head, int val, int position) {
        ListNode newNode = new ListNode(val);
        // TODO: Implement the insert method
        if (position == 1 || head == null) {
            newNode.next = head;
            return newNode;
        }
        ListNode current = head;
        int currentPosition = 1;

        while (currentPosition < position - 1 && current.next != null) {
            current = current.next;
            currentPosition++;
        }
        // This method should insert a new node with the given value at the specified position
        // If the position is out of bounds, insert the node at the end of the list
        if (currentPosition < position -1){
            current.next = newNode;
        }else {
            newNode.next = current.next;
            current.next = newNode;
        }
        return head;
    }
}
