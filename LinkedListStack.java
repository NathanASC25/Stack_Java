public class LinkedListStack {
        private Node top;

        private class Node {
                int value;
                Node next;
        }
        public LinkedListStack() {
                this.top = null;
        }
        public void push(int value) {
                Node newNode = new Node();
                newNode.data = value;
                newNode.next = top;
                top = newNode;
        }
        public int pop() {
                if (top == null) {
                        System.out.print("\nStack is empty!\n");
                        return -1;
                }
                else {
                        int poppedValue = top.data;
                        top = top.next;
                        System.out.printf("Popped element: %d", poppedValue);
                        return poppedValue;
                }
        }
}
