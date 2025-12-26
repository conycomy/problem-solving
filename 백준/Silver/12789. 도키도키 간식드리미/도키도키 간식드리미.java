
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);

        int n = sc.nextInt();
        SnackLine snackLine = new SnackLine(n);
        int min = 1;



       for(int i = 0; i < n; i++){
           int student = sc.nextInt();

           if(min == student){
               min++;
           } else {
               snackLine.push(student);
           }


              while(!snackLine.isEmpty() && snackLine.peek() == min) {
                  snackLine.pop();
                  min++;
              }
              
           }

       if(snackLine.isEmpty()){
           System.out.print("Nice");
       } else {
           System.out.print("Sad");
       }

       }
    }



class SnackLine {

    private int top;
    private int[] Students;


    public SnackLine(int n){
        this.top = -1;
        Students = new int[n];
    }

    public void push(int student){
       Students[++top] = student;
    }

    public int pop() {
        if(top == -1) {
            return -1;

        }
        return Students[top--];

    }

    public boolean isEmpty() {
        return top == -1;

    }

    public int peek() {
        if(top == -1){
            return -1;
        }
        return Students[top];
    }

}
