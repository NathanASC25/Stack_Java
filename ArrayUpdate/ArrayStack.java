class ArrayStack {
    private int[] arr;
    private int[] newArr;
    public ArrayStack() { arr = new int[0]; }
    public void pop() {
        if (arr.length == 0) {
            System.out.print("\nStack is empty. Cannot remove elements.\n");
            return;
        }
        if (arr.length == 1) {
            arr = new int[0];
            System.out.print("\nLast element removed. Stack is now empty\n");
            return;
        }
        newArr = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i += 1) {
            newArr[i - 1] = arr[i];
        }
        arr = newArr;
    }
    public void push(int val) {
        newArr = new int[arr.length + 1];
	newArr[0] = val;
        for (int i = 1; i < newArr.length; i += 1) {
            newArr[i] = arr[i - 1];
        }
        arr = newArr;
    }
    public int search(int val) {
        for (int i = 0; i < arr.length; i += 1) {
            if (arr[i] == val) return i;
        }
        return -1;
    }
    @Override
    public String toString() {
        return java.util.Arrays.toString(arr);
    }
}
