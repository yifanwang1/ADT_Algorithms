package com.liuyubobobo.list;

/**
 * @program: liuyuboboboADT
 * @description:
 * @author: WangYiFan
 * @create: 2019-12-15 11:15
 **/

public class ListNormal<E> {

    /**
    * 指定头结点
    **/
    private Node head;
    private int size;

    class Node{
        Node next;
        E e;
        public Node(){
            this(null, null);
        }

        public Node(E e){
            this(e, null);
        }

        public Node(E e, Node next){
            this.e = e;
            this.next = next;
        }
    }

    public void add(int index, E e) throws Exception {

        if(index > size){
            throw new Exception("超过链表长度，无法插入");
        }

        if(index == 0){
            addFirst(e);
        }else{

            Node preNode = head;
            for (int i = 0; i < index; i++) {
                preNode = preNode.next;
            }

            Node node = new Node(e,preNode.next);
            preNode.next = node;


        }
    }

    public void addFirst(E e){
        Node node = new Node(e, head);
        head = node;
    }



}
