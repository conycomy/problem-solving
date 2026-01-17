
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  /*  1 X: 정수 X를 덱의 앞에 넣는다. (1 ≤ X ≤ 100,000)
      2 X: 정수 X를 덱의 뒤에 넣는다. (1 ≤ X ≤ 100,000)
      3: 덱에 정수가 있다면 맨 앞의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
      4: 덱에 정수가 있다면 맨 뒤의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
      5: 덱에 들어있는 정수의 개수를 출력한다.
      6: 덱이 비어있으면 1, 아니면 0을 출력한다.
      7: 덱에 정수가 있다면 맨 앞의 정수를 출력한다. 없다면 -1을 대신 출력한다.
      8: 덱에 정수가 있다면 맨 뒤의 정수를 출력한다. 없다면 -1을 대신 출력한다.
    */

    public static final int PUSH_FRONT = 1; // 1 X: 정수 X를 덱의 앞에 넣는다. (1 ≤ X ≤ 100,000)
    public static final int PUSH_BACK = 2;
    public static final int POP_FRONT = 3;
    public static final int POP_BACK = 4;
    public static final int SIZE = 5;
    public static final int EMPTY = 6;
    public static final int FRONT = 7;
    public static final int BACK = 8;


    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Deque deque = new Deque(N);

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken()); // st 사용

            switch (command) {
                case PUSH_FRONT:
                    sb.append(""); // 출력 없음
                    deque.pushfront(Integer.parseInt(st.nextToken()));
                    break;

                case PUSH_BACK:
                    deque.pushback(Integer.parseInt(st.nextToken()));
                    break;

                case POP_FRONT: //출력
                    sb.append(deque.popfront()).append('\n');
                    break;

                case POP_BACK: //출력
                    sb.append(deque.popback()).append('\n');
                    break;

                case SIZE:
                    sb.append(deque.size()).append('\n');
                    break;

                case EMPTY:
                    sb.append(deque.empty()).append('\n');
                    break;

                case FRONT:  // 출력
                    sb.append(deque.front()).append('\n');
                    break;

                case BACK:   // 출력
                    sb.append(deque.back()).append('\n');
                    break;
            }

        }
        System.out.print(sb.toString());

    }
}

class Deque {

    private int[] arr;
    private int front;
    private int rear;
    private int size;


    public Deque(int length) {
        this.arr = new int[length + 1];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    public void pushfront(int value) {
        front = (front - 1 + arr.length) % arr.length;
        arr[front] = value;
        size++;
    }

    public void pushback(int value) {
        arr[rear] = value;
        rear = (rear + 1) % arr.length;
        size++;
    }

    public int popfront() {
        if (size == 0) {
            return -1;
        }
        int value = arr[front];
        front = (front + 1) % arr.length;
        size--;
        return value;
    }

    public int popback() {
        if (size == 0) return -1;
        rear = (rear - 1 + arr.length) % arr.length;
        int value = arr[rear];
        size--;
        return value;
    }

    public int size() {
        return size;
    }

    public int empty() {
        return (size == 0) ? 1 : 0;

    }

    public int front() {
        if (size == 0) {
            return -1;
        }
        return arr[front];

    }

    public int back() {
        if (size == 0) {
            return -1;
        }
        return arr[(rear - 1 + arr.length) % arr.length];
    }

}
