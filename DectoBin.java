import java.util.Scanner;
/** 
* This class implements a program to
* change a number in decimal representation into binary representation with stack
*
* @author Dennis Pratama Kamah 
* @version 2017.09.30
**/
public class DectoBin 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number : ");
        int number = sc.nextInt();
        System.out.print("Its binary representation is : ");
        int result = number;
        Stack<Integer> st = new Stack<>();
        while(result > 1) {
            st.push(result % 2);
            result /= 2;
        }
        st.push(1);
        while(!st.isEmpty()) {
            System.out.print(st.pop());
        }
        System.out.println();
    }
}