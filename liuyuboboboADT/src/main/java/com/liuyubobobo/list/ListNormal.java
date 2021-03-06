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

    public ListNormal(){
        size = 0;
        head = null;
    }


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

    /**
    * 返回链表的长度
    **/
    public int getSize(){
        return size;
    }

    /**
    * 判断链表是否为空
    **/
    public boolean isEmpty(){
        return size == 0;
    }

    /**
    * 添加数据到链表中
    **/
    public void add(int index, E e) throws Exception {

        if(index > size){
            throw new Exception("超过链表长度，无法插入");
        }

        if(index == 0){
            addFirst(e);
        }else{
            Node preNode = head;
            for (int i = 0; i < index - 1; i++) {
                preNode = preNode.next;
            }
            Node node = new Node(e,preNode.next);
            preNode.next = node;
            size++;
        }
    }

    /**
    * 添加到头结点
    **/
    public void addFirst(E e){
        Node node = new Node(e, head);
        head = node;
        size++;
    }

    /**
    * 删除指定位置的元素
    **/
    public E remove(int index){
        Node currentNode = head;
        for (int i = 0; i < size; i++) {
            
        }

        return null;
    }

    @Override
    public String toString(){
        StringBuffer stringBuffer = new StringBuffer();
        Node currentNode = head;
        for (int i = 0; i < size; i++) {
            stringBuffer.append(currentNode.e).append("\n");
            currentNode = currentNode.next;
        }
        return stringBuffer.toString();
    }
}
