package com.LJX.flight;

import java.util.Iterator;

public class GenericList <T> implements Iterable<T>{
    Node tail;

    int index;

    public GenericList() {this.index = 0;}
    @Override
    public Iterator iterator() {
        return tail;
    }


    class Node implements Iterator<T>{
        T value;
        Node nextNode;

        public Node() {
        }

        public Node(T value, Node nextNode) {
            this.value = value;
            this.nextNode = nextNode;
        }

        @Override
        public boolean hasNext() {
            return nextNode == null ? false:true;
        }

        @Override
        public T next() {
            Node temp = nextNode;
            nextNode = nextNode.nextNode;
            return temp.value;
        }
    }

    /**
     * 添加
     * @param data
     * @return
     */

    public int add(T data){
        if(tail == null){
            tail = new Node();
            tail.value = data;
        }else {
            Node next = new Node();
            Node temp = tail;
            while(temp.nextNode != null){
                temp = temp.nextNode;
            }
            next.value = data;
            temp.nextNode = next;
        }
        return index++;
    }

    public T delete(String name) {
        Node t1 = tail;
        T val = t1.value;
        if(val.equals(name)){
            tail = t1.nextNode;
            return t1.value;
        }
        while(t1.nextNode != null){
            T value = t1.nextNode.value;
            //删除节点
            if(value.equals(name)){
                t1.nextNode = t1.nextNode.nextNode;
                return value;
            }
           t1 = t1.nextNode;
        }
        return null;
    }
}
