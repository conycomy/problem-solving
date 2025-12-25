import java.util.Scanner;

public class Main {

    static final char LEFT_PAREN = '(';
    static final char RIGHT_PAREN = ')';

    static final char LEFT_BRACKET = '[';
    static final char RIGHT_BRACKET = ']';
    static final String EXIT_CONDITION = ".";
    ;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            String line = sc.nextLine();
            if (line.equals(EXIT_CONDITION)) {
                break;
            }

            CharStack stack = new CharStack(line.length());
            boolean isValid = true;

            for( int i = 0; i < line.length(); i++){
                char c = line.charAt(i);

                if(c == LEFT_PAREN || c == LEFT_BRACKET){
                    stack.push(c);
                }

                else if ( c == RIGHT_PAREN){
                    if(stack.isEmpty() || stack.pop() != '('){
                        isValid = false;
                        break;
                    }
                }

                else if ( c == RIGHT_BRACKET){
                    if(stack.isEmpty() || stack.pop() != '['){
                        isValid = false;
                        break;
                    }
                }
            }

            if(!stack.isEmpty()) {
                isValid = false;
            }

            System.out.println(isValid ? "yes" : "no");
        }

    }


}

class CharStack {

    private char[] Stack;
    private int top;

    public CharStack(int size) {
        Stack = new char[size];
        this.top = -1;
    }

    public void push(char c) {
        Stack[++top] = c;
    }

    public char pop() {
        if (top == -1) {
            return '\0';
        }
        return Stack[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
