# Chapter-3-Lab-1

This lab was designed to teach you more about stacks.

**Lab Description :** Take a string of tokens and put each token in the stack. Then, print the contents of the stack on the screen. Finally, pop each item from the stack one by one until the stack is empty.

  

**Sample Data :** 

a b c d e f g h i

1 2 3 4 5 6 7 8 9 10

\# $ % ^ * ( ) ) _

      

**Sample Output :**

[a, b, c, d, e, f, g, h, i]

popping all items from the stack

i h g f e d c b a

[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

popping all items from the stack

10 9 8 7 6 5 4 3 2 1

[#, $, %, ^, *, (, ), ), _]

popping all items from the stack

_ ) ) ( * ^ % $ #

**_BASIC STACK CODE_**

Stack<Integer> s = new Stack<Integer>();

s.add(67);

s.add(34);

s.add(12):

System.out.println(s); //outs [67, 34, 12 ]

System.out.println(s.pop()); //outs 12

System.out.println(s.pop()); //outs 34
