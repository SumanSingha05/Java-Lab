public class StackMain {

    static class Stack {
        private int[] stack;
        private int top;
        private int size;

        public Stack(int size) {
            this.size = size;
            stack = new int[size];
            top = -1;
        }

        public void push(int value) {
            if (top == size - 1) {
                System.out.println("Stack Overflow! Cannot push " + value);
            } else {
                stack[++top] = value;
                System.out.println(value + " pushed to stack.");
            }
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow! Cannot pop.");
                return -1;
            } else {
                int poppedValue = stack[top--];
                System.out.println("Popped: " + poppedValue);
                return poppedValue;
            }
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty. Nothing to peek.");
                return -1;
            } else {
                return stack[top];
            }
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public void display() {
            if (isEmpty()) {
                System.out.println("Stack is empty.");
            } else {
                System.out.print("Stack elements: ");
                for (int i = top; i >= 0; i--) {
                    System.out.print(stack[i] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Stack myStack = new Stack(5);

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        myStack.display();

        System.out.println("Top element is: " + myStack.peek());

        myStack.pop();
        myStack.pop();

        myStack.display();

    }
}
