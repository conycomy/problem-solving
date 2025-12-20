
import java.util.Scanner;

public class Main {

    static final int POP = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        BookStack bookStack = new BookStack(K);

        for (int i = 0; i < K; i++) {
            int a = sc.nextInt();

            if (a == POP) {
                bookStack.pop();
            } else {
                bookStack.push(a);

            }
        }
        Sum(bookStack);

    }

    private static void Sum(BookStack bookStack) {
        int sum = 0;
        for(int i = 0; i <= bookStack.top; i++){
            sum += bookStack.stack[i];
        }
        System.out.print(sum);

    }

    static class BookStack {

            private int[] stack;
            private int top;

            public BookStack(int size) {
                this.stack = new int[size];
                this.top = -1;
            }

            public void push(int value) {
                stack[++top] = value;
            }

            public void pop() {
                --top;
            }
        }
}

