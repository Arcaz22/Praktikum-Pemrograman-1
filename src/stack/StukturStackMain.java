package stack;

import java.io.IOException;
import java.util.Scanner;

public class StukturStackMain {
  public static void main (String [] args) throws IOException {
    // StrukturStack stack = new StrukturStack(3);
    // System.out.println("Size:" + stack.size());
    // System.out.println("Empty: " + stack.isEmpty());
    // System.out.println("Full: " + stack.isFull());
    // System.out.println("Top: " + stack.top());

    // stack.push(2);
    // stack.push(4);
    // stack.push(1);

    // System.out.println("Size:" + stack.size());
    // System.out.println("Empty: " + stack.isEmpty());
    // System.out.println("Full: " + stack.isFull());
    // System.out.println("Top: " + stack.top());
    // stack.display();

    String input;
    int output;

    while(true) {
      System.out.print("Masukkan ekspresi postfix: ");
      System.out.flush();
      input = getString();
      if(input.equals("")) {
        break;
      }

      ParsePost parsePost = new ParsePost(input);
      output = parsePost.doParse();
      System.out.println("Hasilnya: " + output);
    }
  }

  public static String getString() throws IOException {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    return s;
  }
}
