
package com.mycompany.dllists_stacks_queues;

/**
 *
 * @author MoaathAlrajab
 */
public class DoublyLinkedListDemoApp {
    
    public static boolean isPrime(int a){
if(a<=1)
return false;
else{
        for (int i = 2; i <= a / 2; i++) {

            if (a % i == 0){ 
                return false;
            }
        }
        return true;
    }
    }
   public static void main(String[] args) {
      DoublyLinkedList numList = new DoublyLinkedList();
      Node nodeA = new Node(14);
      Node nodeB = new Node(2);
      Node nodeC = new Node(20);
      Node nodeD = new Node(31);
      Node nodeE = new Node(16);
      Node nodeF = new Node(55);

      numList.append(nodeA);   // Add 14
      numList.append(nodeB);   // Add 2, make the tail
      numList.append(nodeC);   // Add 20, make the tail

      numList.prepend(nodeD);  // Add 31, make the head

      numList.insertAfter(nodeB, nodeE);  // Insert 16 after 2
      numList.insertAfter(nodeC, nodeF);  // Insert 55 after tail, 55 becomes new tail

      // Output list
      System.out.print("List after adding nodes: ");
      numList.printList();
       
      System.out.println("The size of my linked list: " + numList.size());
      System.out.println("The index of 55 is " + numList.indexOf(55));
      int[] myTestArr = numList.toArray();
       for (int i = 0; i < myTestArr.length; i++) {
           System.out.println(myTestArr[i]);
       


//      // Remove the tail node, then the head node
//      numList.remove(nodeF);
//      numList.remove(nodeD);
//
//      // Output final list
//      System.out.print("List after removing nodes: ");
//      numList.printList();
//      System.out.println("The size is " + numList.size());
//      numList.printRevList();
//      System.out.println("The max is " + numList.max());
//      System.out.println("The min is " + numList.min());
//   }
//}
// Output list reverse order
//System.out.print("List printed in reverse order: ");
//numList.printRevList();
//Output max and min
//System.out.print("The max is: " + numList.max());
//System.out.print(The min is: "+ numList.min());
//Output linked list as an array
//int[] testArray = numList.toArray();
//for(int i=0; i<testArray.length; i++){ System.out.println(testArray[i]);}
//System.out.println("The index of 20 " + numList.indexOf(20));
//sum method test
System.out.println("The sum of the last 3 elements in the list are: " + numList.sumOfLastElements(4));
}
   }
}

