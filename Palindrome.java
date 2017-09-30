import java.util.Scanner;
/** 
* This class implements a program to check whether a string is palindrome
*
* @author Dennis Pratama Kamah 
* @version 2017.09.30
**/
public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the string : ");
        String input = sc.next();
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < input.length(); i++) {
            st.push(input.charAt(i));
        }
        boolean valid = true;
        int j = 0;
        while(!st.isEmpty()) {
            if(input.charAt(j) != st.pop()) {
                valid = false;
                break;
            }
            j++;
        }
        if(valid) {
            System.out.println("It's a palindrome");
        } else {
            System.out.println("It's not a palindrome");
        }
    }
}
