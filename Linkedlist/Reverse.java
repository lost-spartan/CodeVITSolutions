class Solution{
  public static ListNode Reverse(ListNode node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
}

// By using Java Collection Class in java.util.LinkedLinst
LinkedList<Integer> list = new LinkedList<Integer>();
Collections.reverse(list)
