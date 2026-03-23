package com.dsa.main;

import com.dsa.linkedlists.Node;

import java.util.HashSet;


public class Main {

    public static void main(String[] args) {

        //createList
        Node head = new Node(3);


        Node position=cycleDetectionWithPosition(head);
        System.out.println("cycle detection output:"+position.value);

    }
    
    //Cycle detection-2 my version - ************destructive code (it deletes the whole list)
    public static Node cycleDetectionWithPosition(Node head){
        //create cycle List
        Node n1=new Node(2);

        head.next=n1;
        n1.next=head;
         Node newHead=head;
        Node resetHead=newHead;
        Node position=new Node(-1);
        if(head ==null|| head.next ==null){
            return position;
        }
        while(resetHead!=null){
            ;System.out.print("newhead value:"+newHead.value);
            resetHead=newHead.next;
            ;System.out.print("resthead value:"+resetHead.value);
              newHead.next=null;
              newHead=resetHead;

               if(resetHead.next==null){
                   return newHead;
               }

            }
        return position;
        }
        //Floyd's algorithm - can aslo do this with hashset like in the earlier case
    public static Node cycleDetectionWithPositionOne(Node head){
        //create cycle List
        Node n1=new Node(2);
        Node n2=new Node(0);
        Node n3= new Node(-4);
        head.next=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n1;
        Node slow=head;
        Node fast=head;
        if(head ==null|| head.next ==null){
            return null;
        }
        while(fast!=null && fast.next!=null){

            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                slow=head;
                while(fast!=slow) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return slow;
            }

        }

        return null;
    }

    }



