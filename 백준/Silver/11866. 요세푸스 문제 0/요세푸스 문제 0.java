
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int count = 0;

        SquareQueue q = new SquareQueue(N);

        for(int i = 1; i <= N; i++){
            q.push(i);
        }

        System.out.print("<");
        while (count < N) {
            for(int i = 0; i < K -1; i++){
                q.push(q.pop());
            }

            int dead = q.pop();
            System.out.print(dead);

            count++;
            if(count < N) {
                System.out.print(", ");
            }
        }

        System.out.print(">");




    }
}


class SquareQueue {

    int[] arr;
    private int front;
    private int rear;
    private int size;


    public SquareQueue(int N) {
        this.arr = new int[N];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }


    public void push(int value) {
        arr[rear] = value;
        rear = ( rear + 1 ) % arr.length;
        size++;

    }

    public int pop(){
        int value = arr[front];
        front = (front + 1) % arr.length;
        size--;
        return value;

    }




}