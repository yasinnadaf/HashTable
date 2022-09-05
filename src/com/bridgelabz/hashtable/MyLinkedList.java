package com.bridgelabz.hashtable;

public class MyLinkedList<K,V> {
    MyMapNode<K,V> head;
    MyMapNode<K,V> tail;

    public MyMapNode<K,V> search(K searchData) {
        MyMapNode<K,V> temp = head;
        while(temp != null){
            if(temp.key.equals(searchData))
                return temp;
            temp = temp.next;
        }
        return null;
    }

    public void append(MyMapNode<K,V> newNode ) {
        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void print(){
        MyMapNode<K,V> temp = head;
        while(temp != null){
            System.out.println(temp);
            temp = temp.next;
        }
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }
}
