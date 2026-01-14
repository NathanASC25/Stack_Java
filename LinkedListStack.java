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
}
