import java.util.Scanner;
import java.util.Stack;

public class brackets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(') stack.push(ch);
            else if(ch==')'){
                if(stack.isEmpty()){
                    System.out.println(false);
                    return;
                }
                stack.pop();
            }
        }
        if(stack.isEmpty()){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
