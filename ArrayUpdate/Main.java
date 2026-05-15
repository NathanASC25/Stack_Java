class Main {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack();
        stack.push(9);
        System.out.printf("\n%s\n", stack);
        System.out.printf("\nIndex Of 9: %d\n", stack.search(9));
        stack.pop();
        stack.pop();
        stack.push(1);
        stack.push(2);
        System.out.printf("\n%s\n", stack);
        System.out.printf("\nIndex Of 1: %d\n", stack.search(1));
        stack.pop();
        System.out.printf("\n%s\n", stack);
        System.out.printf("\nIndex Of 1: %d\n", stack.search(1));
        System.out.printf("\nIndex Of -1: %d\n", stack.search(-1));
        System.out.print("\n-- End Of ArrayStack Program --\n");
    }
}
