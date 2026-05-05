//Split a Linked List into two halves
 /*Given a Circular linked list. The task is split into two Circular Linked lists. If there are an odd number of nodes in the given circular linked list then out of the resulting two halved lists, the first list should have one node more than the second list.

Examples :

Input: LinkedList : 10->4->9
Output: 10->4 , 9

Explanation: After dividing linked list into 2 parts , the first part contains 10, 4 and second part contain only 9.*/

/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    public Pair<Node, Node> splitList(Node head) {
        // Code here
        
        Node slow = head;
        Node fast = head.next;
        
        while(fast != head && fast.next != head)
        {
            slow = slow.next;
            fast = fast.next;
            
            if (fast.next != head){
                fast= fast.next;
            }
        }
        
        fast.next = slow.next;
        slow.next = head;
        
        return new Pair<Node,Node> (head,fast.next);
        
        
    }
}
