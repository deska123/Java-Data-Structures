import java.util.Scanner;
/** 
* This class implements a program to reverse a string using stack
*
* @author Dennis Pratama Kamah 
* @version 2017.09.30
**/
public class ReverseString
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the string : ");
        String input = sc.next();
        System.out.print("Its reversed representation is : ");
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < input.length(); i++) {
            st.push(input.charAt(i));
        }
        while(!st.isEmpty()) {
            System.out.print(st.pop());
        }
        System.out.println();
    }
}
