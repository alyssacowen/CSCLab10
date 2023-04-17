
package com.mycompany.dllists_stacks_queues.Stack;

/**
 *
 * @author MoaathAlrajab
 */
public class StackAndQueueDemo {
   public static void main(String[] args) {
      int[] numbers = { 83, 27, 44, 55, 66, 16, 42, 73, 75 };
      
      // Initialize a new Stack and add numbers
      Stack numStack = new Stack();
      for (int number : numbers) {
          numStack.push(number);
      }
      //numStack.pop();
       System.out.println("Is the stack empty: " + numStack.isEmpty());
       System.out.println("Size of the stack: " + numStack.getSize());
      // Output stack
      System.out.print("Stack after initial pushes:   ");
      numStack.print();
      
      // Pop and print, push 99 and print, pop and print again
      numStack.pop();
      System.out.print("Stack after first pop:        ");
      numStack.print();
      numStack.push(99);
      System.out.print("Stack after pushing 99:       ");
      numStack.print();
      numStack.pop();
      System.out.print("Stack after second pop:       ");
      numStack.print();
      
      // Print a blank line before the Queue demo
      System.out.println();
      
      // Initialize a new Queue and add numbers
      Queue numQueue = new Queue();
      for (int number : numbers) {
          numQueue.enqueue(number);
      }
       System.out.println("Size of the queue: " + numQueue.isEmpty());
       System.out.println("Size of the queue: " + numQueue.getSize());
      // Output queue
      System.out.print("Queue after initial enqueues: ");
      numQueue.print();
      
      // Dequeue 83 and print
      numQueue.dequeue();
      System.out.print("Queue after first dequeue:    ");
      numQueue.print();
      
      // Enqueue 99 and print
      numQueue.enqueue(99);
      System.out.print("Queue after enqueueing 99:    ");
      numQueue.print();
      
      // Dequeue 4 and print
      numQueue.dequeue();
      System.out.print("Queue after second dequeue:   ");
      numQueue.print();
      //reverse the order of the characters using stack
      String str = "CSC229"; //output 922CSC
       System.out.println("The reverse order of CSC229 is " +reverse(str));
   }
   public static String reverse(String s){
       char[] rs=new char[s.length()];
       Stack st = new Stack();
       //traversing the String and pushing the characters of the String int the st one by one
       for (int i = 0; i < s.length(); i++) {
           //pushing characters into st
           st.push(s.charAt(i));
       }
        //now pop characters from the st until st becomes empty
        int j=0;
        while(!st.isEmpty()){
            rs[j++]=(char) st.pop();
           }
        return new String(rs);
   }
}
