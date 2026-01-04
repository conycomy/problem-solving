
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    static final String PUSH = "push";
    static final String POP = "pop";
    static final String SIZE = "size";
    static final String EMPTY = "empty";
    static final String FRONT = "front";
    static final String BACK = "back";


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int test = Integer.parseInt(br.readLine());
        MyQueue queue = new MyQueue(test);


        for(int i = 0; i < test; i++) {
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            String command = st.nextToken();

            switch (command) {
                case PUSH:
                    int value = Integer.parseInt(st.nextToken());
                    queue.push(value);
                    break;

                case POP:
                    sb.append(queue.pop()).append('\n');
                    break;

                case SIZE:
                    sb.append(queue.size()).append('\n');
                    break;

                case EMPTY:
                    sb.append(queue.empty()).append('\n');
                    break;

                case FRONT:
                    sb.append(queue.front()).append('\n');
                    break;

                case BACK:
                    sb.append(queue.back()).append('\n');
                    break;
            }
        }

        System.out.print(sb.toString());
    }

}

class MyQueue {

    int[] arr;
    int front, rear;

    public MyQueue(int length) {
        arr = new int[length];
        front = 0;
        rear = 0;
    }

    public void push(int value) {
        arr[rear++] = value;
    }

    public int pop() {
        if (front == rear) {
            return -1;
        }
        return arr[front++];
    }

    public int size() {
        return rear - front;
    }

    public int empty() {
        return front == rear ? 1 : 0;
    }

    public int front() {
        if (front == rear) {
            return -1;
        }
        return arr[front];
    }

    public int back() {
        if (front == rear) {
            return -1;
        }
        return arr[rear - 1];
    }
}


