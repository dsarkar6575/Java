package com.gcettb;

import java.util.*;


class Main {
    Node head;

        class Node{
            String data;
            Node next;
            Node(String data)
            {
                this.data=data;
                this.next=null;
            }
        }
        //add in first
        public void addFirst(String data)
        {
            Node newNode=new Node(data);
            if (head==null)
            {
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        //add in last
    public void addLast(String data)
    {
        Node newNode=new Node(data);
        if (head==null)
        {
            head=newNode;
            return;
        }
        Node currNode=head;
        while (currNode.next!=null)
        {
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    //print list
    public void printList()
    {
        if (head==null)
        {
            System.out.println("List is empty");
            return;
        }
        Node currNode=head;
        while (currNode!=null)
        {
            System.out.print(currNode.data +" -> ");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }
    //delete first
    public void deleteFirst()
    {
        if (head==null)
        {
            System.out.println("This list is empty");
            return;
        }
        head=head.next;

    }
    //delete last
    public void deleteLast()
    {
        if (head==null){
            System.out.println("The list is empty");
            return;
        }
        if (head.next==null)
        {
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while (lastNode.next!=null)
        {
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }


    public static void main(String[] args) {
   Main list=new Main();
   list.addFirst("a");
   list.addLast("is");
   list.printList();
   list.addLast("List");
   list.printList();
   list.addFirst("this");
   list.printList();

   list.deleteFirst();
   list.printList();

   list.deleteLast();
   list.printList();


    }
}
