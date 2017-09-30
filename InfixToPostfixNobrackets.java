import java.util.Scanner;
/** 
* This class implements a program to
* convert an infix representation of arithmetics expression into postfix
* representation without brackets
*
* @author Dennis Pratama Kamah 
* @version 2017.09.30
**/
public class InfixToPostfixNobrackets 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the in infix arithmetics expression : ");
        String infix = sc.next();
        int length = infix.length();
        Symbol[] symbol = new Symbol[length];
        for(int i = 0; i < length; i++) {
            symbol[i] = new Symbol(infix.charAt(i));
        }
        Stack<Symbol> st = new Stack<>();
        String postfix = "";
        for(int j = 0; j < length; j++) {
            Symbol scan = symbol[j];
            if(st.isEmpty()) {
                st.push(scan);
            } else {
                while(!st.isEmpty()) {
                    Symbol curr = st.peek();
                    if(curr.strength >= scan.strength) {
                        postfix += st.pop().data;
                    } else {
                        break;
                    }
                }
                st.push(symbol[j]);
            }
        }
        while(!st.isEmpty()) {
            postfix += st.pop().data;
        }
        System.out.println("Postfix Representation : " + postfix);
    }
}

class Symbol
{
    char data;
    int strength;
    
    public Symbol(char data)
    {
        this.data = data;
        if(data == '+' || data == '-') {
            strength = 1;
        } else if(data == '*' || data == '/') {
            strength = 2;
        } else if(data == '^') {
            strength = 3;
        } else {
            strength = 4;
        }
    }
}


