//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class -
//Lab  -

import java.util.Stack;
import static java.lang.System.*;

public class StackTest
{
 private Stack<String> stack;

 public StackTest()
 {
  setStack("");
 }

 public StackTest(String line)
 {
   stack = new Stack<String>();
   String[] s = line.split(" ");
   for (String str: s)
    stack.push(str);
 }
 
 public void setStack(String line)
 {
   stack = new Stack<String>();
   String[] s = line.split(" ");
   for (String str: s)
   stack.push(str);
 }

 public void popEmAll()
 {
   while (!stack.isEmpty())
    stack.pop();
 }

 //add a toString
 public String toString()
 {
   String orig = stack.toString() + "\npopping all items from the stack\n";
   String pops = "";
   while (!stack.isEmpty())
    pops += stack.pop() + " ";
  return orig + pops;
 }
}
