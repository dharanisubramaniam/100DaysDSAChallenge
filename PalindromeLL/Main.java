package com.dsa.main;

import com.dsa.linkedlists.Node;


public class Main {

    public static void main(String[] args) {

      //creating the two linkedlists
        Node head=new Node(1,new Node(2));

       boolean output=isPalindrome(head);
       System.out.println("final ouput"+output);

    }

    //chek palindrome
    public static boolean isPalindrome(Node head){
        if(head==null || head.next==null);
        boolean isPalindrome=true;
        //finding the mid of LL
        Node mid=findingMid(head);
        System.out.println("mid value:"+mid.value);
        //reversing the list from mid point
        Node secondHalf=reverseLL(mid);
        Node current=secondHalf;
        while(current!=null){
            System.out.println("secondhalf value:"+current.value);
            current=current.next;
        }
       Node firstHalf=head;
       while(secondHalf!=null){
           if(firstHalf.value!=secondHalf.value) {
               isPalindrome = false;
           }
               firstHalf=firstHalf.next;
               secondHalf=secondHalf.next;

       }
        return isPalindrome;
    }

    //reverse untile mid
    public static Node reverseLL(Node mid){
        Node current=mid;
        Node prev=null;
        while(current!=null){
            Node temp= current.next;
            current.next=prev;
            prev=current;
            current=temp;

        }
        return prev;
    }
    // find the mid of the linkedlist
    public static Node findingMid(Node head){
        if(head==null)return null;
        Node slow = head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

}
