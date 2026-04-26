package Calculator_ahh_project;
import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Program Kalkulator ===");
        System.out.print("Input ekspresi matematika (+-*/): ");
        String input = sc.nextLine();

        String postfix = infixToPostFix(input);
        System.out.println("Postfix: " + postfix);

        double result = evaluatePostfix(postfix, input.length());
        System.out.println("Hasil: " + result);
        sc.close();
    }

    public static int precedence(char ch) {
        if (ch == '+' || ch == '-') return 1;
        if (ch == '*' || ch == '/') return 2;
        return -1;
    }

    public static String infixToPostFix(String infix){
        String postfix = "";
        charStack stack = new charStack(infix.length());

        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);

            if (Character.isDigit(c)) {
                postfix += c;
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix += stack.pop();
                }
                stack.pop();
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    postfix += stack.pop();
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            postfix += stack.pop();
        }
        return postfix;
    }

    public static double evaluatePostfix(String postfix, int length) {
        doubleStack stack = new doubleStack(length);

        for (int i = 0; i < postfix.length(); i++) {
            char c = postfix.charAt(i);

            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                double value2 = stack.pop();
                double value1 = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(value1 + value2);
                        break;
                    case '-':
                        stack.push(value1 - value2);
                        break;
                    case '*':
                        stack.push(value1 * value2);
                        break;
                    case '/':
                        if (value2 == 0) {
                            System.out.println("Error: Division by zero!");
                            return 0;
                        }
                        stack.push(value1 / value2);
                        break;
                }
            }
        }
        return stack.pop(); 
    }
}
