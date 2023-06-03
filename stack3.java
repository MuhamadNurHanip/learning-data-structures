import java.util.*;
import java.io.*;

class PraktikumStack3 {

    public static void main(String[] args) {
        
        Stack<String> stack = new Stack<String>();

        stack.push("Welcome");
        stack.push("TO");
        stack.push("Poliwangi");
        stack.push("TRPL");
        stack.push("JINGGO");

        System.out.println("Initial Stack: " + stack);

        System.out.println("The element at the top of the" + " stack is : " + stack.peek());

        System.out.println("Final Stack" + stack);
    }
    
}
