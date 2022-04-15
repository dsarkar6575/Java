package com.gcettb;

import java.util.*;


class Main {
    Node head;

    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    //add in first
    public void addFirst(int data)
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
    public void addLast(int data)
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
    public void reverseIterate()
    {
        if (head==null||head.next==null){
            return;
        }


        Node prevNode=head;
        Node currNode=head.next;
        while (currNode!=null)
        {
            Node nextNode=currNode.next;
            currNode.next=prevNode;

            //update
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }


    public static void main(String[] args) {
        Main list=new Main();
       list.addFirst(1);
       list.addFirst(2);
       list.addFirst(3);
       list.addFirst(4);
        list.printList();

        list.reverseIterate();
        list.printList();

    }
}
