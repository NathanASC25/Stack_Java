class LinkedListStack {
    private ListNode top;
    private ListNode current;
    private ListNode newNode;
    private int nodeIndex;
    public LinkedListStack() {}
    // Inner Class for Node Creation
    private class ListNode {
        int val;
        ListNode next;
        public ListNode() {}
        public ListNode(int val) {
            this.val = val;
        }
    }
    public void pop() {
        if (isEmpty()) {
            System.out.print("\nStack is empty. Cannot remove elements.\n");
            return;
        }
        if (top.next == null) {
            top = null;
            System.out.print("\nLast element removed. Stack is now empty.\n");
            return;
        }
        top = top.next;
    }
    // Assign next node to top before setting top as new node
    public void push(int val) {
        newNode = new ListNode(val);
        newNode.next = top;
        top = newNode;
    }
    public boolean isEmpty() {
        return top == null;
    }
    // Start searching by resetting current node to point to top
    public int search(int val) {
        current = top;
        nodeIndex = 0;
        while (current != null) {
            if (current.val == val) return nodeIndex;
            nodeIndex += 1;
            current = current.next;
        }
        return -1;
    }
    @Override
    public String toString() {
        if (top == null) return "[]";
        current = top;
        String sequence = "";
        sequence += "\n[" +  current.val;
        current = current.next;
        while (current != null) {
            sequence += "," + current.val;
            current = current.next;
        }
        sequence += "]\n";
        return sequence;
    }
}
