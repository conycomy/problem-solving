
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static final int PUSH = 1; // 스택에 넣기
    static final int POP = 2; // 하나만 꺼내서 출력
    static final int SIZE = 3; // 개수 출력
    static final int EMPTY = 4; // 비었는지
    static final int TOP = 5; // 맨 위 출력

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        ArrayStack arrayStack = new ArrayStack(N);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());

            if (command == PUSH) {
                int x = Integer.parseInt(st.nextToken());
                arrayStack.push(x);
            } else if (command == POP) {
                sb.append(arrayStack.pop()).append("\n");
            } else if (command == SIZE) {
                sb.append(arrayStack.size()).append("\n");
            } else if (command == EMPTY) {
                sb.append(arrayStack.isEmpty()).append("\n");
            } else if (command == TOP) {
                sb.append(arrayStack.top()).append("\n");
            }
        }
        System.out.print(sb);
    }

    public static class ArrayStack {

        private int[] stack;
        private int top;


        public ArrayStack(int size) {
            this.stack = new int[size];
            this.top = -1;
        }

        public void push(int value) {
            stack[++top] = value;
        }

        public int pop() {

            if (top == -1) {
                return -1;
            }
            return stack[top--];
        }

        public int size() {
            return top + 1;
        }

        public int isEmpty() {
            if (top == -1) {
                return 1;
            } else {
                return 0;
            }
        }

        public int top() {
            if (top == -1) {
                return -1;
            } else {
                return stack[top];
            }
        }
    }

}

