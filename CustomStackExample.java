class StackArray {
    private int[] stack;
    private int top;
    private int capacity;

    // Constructor
    StackArray(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    // 1️⃣ Push
    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = item;
        System.out.println("Pushed " + item);
    }

    // 2️⃣ Pop
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    // 3️⃣ Peek
    public int peek() {
        if (!isEmpty())
            return stack[top];
        System.out.println("Stack is empty");
        return -1;
    }

    // 4️⃣ isEmpty
    public boolean isEmpty() {
        return top == -1;
    }

    // 5️⃣ isFull
    public boolean isFull() {
        return top == capacity - 1;
    }

    // 6️⃣ size
    public int size() {
        return top + 1;
    }

    // 7️⃣ display
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}

// Test class
public class CustomStackExample {
    public static void main(String[] args) {
        StackArray stack = new StackArray(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        System.out.println("Popped: " + stack.pop());
        System.out.println("Top element: " + stack.peek());
        System.out.println("Stack size: " + stack.size());
    }
}
