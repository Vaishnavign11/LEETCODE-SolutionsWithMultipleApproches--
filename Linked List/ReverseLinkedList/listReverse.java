// Definition for singly-linked list node
class ListNode {
    int val;
    ListNode next;

    // Constructor
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class listReverse {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
        }

        return prev;
    }

    // Helper function to print linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5 -> null
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        printList(head);

        // Reverse the linked list
        listReverse sol = new listReverse();
        ListNode reversedHead = sol.reverseList(head);

        System.out.println("Reversed List:");
        printList(reversedHead);
    }
}
