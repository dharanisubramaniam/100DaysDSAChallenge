package com.dsa.main;

import com.dsa.linkedlists.Node;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Node head = createList(1,5);
       Node current =head;
      while(current!=null){

          System.out.println("end current value:"+current.value);
          current=current.next;
      }

      //Node head= deleteNodeWithValue(3,head);

    }
   public static Node createList(int start, int end) {
    Node temp = new Node(0); 
    Node current = temp;

    for (int i = start; i <= end; i++) {
        current.next = new Node(i);
        current = current.next;
    }
   
    return temp.next; 
}

    public static Node deleteNodeWithValue(int val,Node head)  {
        if(head == null)return null;
        Node prev=null;
        Node current=head;
        //my version of deleting the given value
        while(current!=null){
            // this is reduntant and can be taken outside the loop
            if(current.value==val && current==head){ 
                return head.next;
            }else if(current.value==val){
                prev.next=current.next;
                break;
            }
            prev=current;
            current=current.next;
        }

        //efficient version of deleting a given value 
        Node current = head;
        while (current != null && current.next != null) {
            if (current.next.value == val) {
                current.next = current.next.next; // The "Jump"
                // Note: Don't move current here if you want to delete multiple occurrences
            } else {
                current = current.next;
            }
        }

        return head;
        }

}
