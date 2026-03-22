package com.dsa.main;

import com.dsa.linkedlists.Node;

import java.util.HashSet;


public class Main {

    public static void main(String[] args) {

        //createList
        Node head = new Node(3);

     boolean result= cycleDetection(head);
        System.out.println("cycle detection output:"+result);

    }
    public static Node createList(int start,int end){
        Node head = new Node(0);
        Node current=head;
        for(int i=start;i<=end;i++){
            current.next=new Node(i);
            current=current.next;
        }
        return head.next;
    }

    //cycleDetection usinh hashmap - my original thinking
    public static boolean cycledetectionHashSet(Node head){
        Node n1=new Node(2);
        Node n2=new Node(0);
        Node n3= new Node(-4);
        head.next=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n2;
        HashSet<Node>  set = new HashSet<>();
        Node current=head;
        while(current!=null){
            if(set.contains(current)){
                return true;
            }else{
                set.add(current);
                current=current.next;
            }
        }
        return false;
    }

  public static boolean cycleDetection(Node head){
        //create cycle List
      Node n1=new Node(2);
      Node n2=new Node(0);
      Node n3= new Node(-4);
      head.next=n1;
      n1.next=n2;
      n2.next=n3;
      n3.next=n2;
        Node current=head;
        Node slow=null;
        Node fast=head;
      if(head ==null|| head.next ==null){
          return false;
      }
        while(current.next!=null){
            if(fast==slow){
                return true;
            }
            slow=current.next;
            fast=fast.next.next;
            current=current.next;
        }

        return false;
  }
  //efficient tortoise and hare
    public static boolean cycleDetectionOne(Node head){
        //create cycle List
        Node n1=new Node(2);
        Node n2=new Node(0);
        Node n3= new Node(-4);
        head.next=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n2;
        Node slow=head;
        Node fast=head;
        if(head ==null|| head.next ==null){
            return false;
        }
        while(fast!=null && fast.next!=null){

            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                return true;
            }
        }

        return false;
    }


}
