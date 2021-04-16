//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class -
//Lab  -

import static java.lang.System.*;

class Main {
  public static void main(String[] args) {
    //add test cases  
    StackTest st = new StackTest("a b c d e f g h i");
    System.out.println(st);
    st.setStack("1 2 3 4 5 6 7 8 9 10");
    System.out.println(st);
    st.setStack("# $ % ^ * ( ) ) _");
    System.out.println(st);
  }
}
