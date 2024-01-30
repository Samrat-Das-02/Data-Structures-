// 150. Evaluate Reverse Polish Notation
// You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.

// Evaluate the expression. Return an integer that represents the value of the expression.

// Note that:

// The valid operators are '+', '-', '*', and '/'.
// Each operand may be an integer or another expression.
// The division between two integers always truncates toward zero.
// There will not be any division by zero.
// The input represents a valid arithmetic expression in a reverse polish notation.
// The answer and all the intermediate calculations can be represented in a 32-bit integer.
// Example 1:

// Input: tokens = ["2","1","+","3","*"]
// Output: 9
// Explanation: ((2 + 1) * 3) = 9
// Example 2:

// Input: tokens = ["4","13","5","/","+"]
// Output: 6
// Explanation: (4 + (13 / 5)) = 6
// Example 3:

// Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
// Output: 22
// Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
// = ((10 * (6 / (12 * -11))) + 17) + 5
// = ((10 * (6 / -132)) + 17) + 5
// = ((10 * 0) + 17) + 5
// = (0 + 17) + 5
// = 17 + 5
// = 22
import java.util.Scanner;
import java.util.Stack;

public class Evaluate_Reverse_Polish_Notation {
     public static int calculate(int num1,int num2,char c)
    {
        int result;
        switch(c)
        {
            case '+': result=num1+num2;
                      break;
            case '-': result=num1-num2;
                      break;
            case '*': result=num1*num2;
                      break;
            case '/': if(num2!=0)
                        result=num1/num2;
                      else
                        result=num1;
                     break;
            default: result=0;
        }
        return result;                

    }
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<tokens.length;i++)
        {
            if(tokens[i].length()==1 && tokens[i].charAt(0)<48)
            {
                if(stack.size()>=2)
                {
                //char[] c=tokens[i].toCharArray();
                int num2=stack.pop();
                int num1=stack.pop();
                int result= calculate(num1,num2,tokens[i].charAt(0));
                stack.push(result);
                }
                
            }
            else
            {
                int n=Integer.parseInt(tokens[i]);
                stack.push(n);
            }
        }
        return stack.pop();
    }
     public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the number of tokens : "); 
        int n=scanner1.nextInt();
        String[] tokens = new String[n];
        System.out.print("Enter string at index 0 : ");
        tokens[0] = scanner.nextLine();
        for (int i = 1; i < n; i++) {
            System.out.print("Enter string at index " + i + ": ");
            tokens[i] = scanner.nextLine();
        }
        System.out.println("The result is " + evalRPN(tokens));
        scanner.close();
        scanner1.close();
    }
}
