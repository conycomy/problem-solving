
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line);
        int num = Integer.parseInt(st.nextToken());

        MyDeque mydeque = new MyDeque(num*2);

        for(int i = 1; i <= num; i++) {
            mydeque.pushBack(i);
        }

        while(mydeque.size() > 1){
            mydeque.popFront();
            int temp = mydeque.popFront();
            mydeque.pushBack(temp);
        }

        System.out.print(mydeque.peek());

    }
}


class MyDeque {
    int[] arr;
    private int front;
    private int rear;

    public MyDeque(int value) {
        this.arr = new int[value];
        this.front = 0;
        this.rear = 0;
    }

    public void pushBack(int num) {
        arr[rear++] = num;
    }

    public int popFront() {
        if(front == rear) {
            return -1;
        } return arr[front++];

    }

    public int size(){
        return rear - front;
    }

    public boolean isEmpty(){
        return front == rear;
    }

    public int peek() {
        if(isEmpty()) {
            return -1;
        }
        return arr[front];
    }


}
