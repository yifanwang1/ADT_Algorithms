package com.liuyubobobo.dummyheadheadlist;

public class DummyheadList<E> {

    private int size;
    private Node dummyHead;

    public  DummyheadList(){
        size = 0;
        dummyHead = new Node();
    }


    /**
    * 节点内部类
    */
     private class Node{
        Node next;
        E data;

        public Node(E data){
            this(data, null);
        }

        public Node(E data, Node node){
            this.data = data;
            this.next = node;
        }

        public Node(){
            this(null,null);
        }

         @Override
         public String toString() {
             return data.toString();
         }
     }

    /**
    * 添加节点
    */
    public void add(E e, int index){

        if(index < 0 || index > size){
            throw new IllegalArgumentException("Add failed. Illegal index.");
        }

        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        Node node = new Node(e, prev.next);
        prev.next = node;
        size++;
    }

    /**
    * 添加首节点
    */
    public void addFirst(E e){
       add(e, 0);
    }

    /**
    * 添加尾结点
    */
    public void addLast(E e){
        add(e, size);
    }

    /**
    * 获取链表的长度
    */
    public int getSize(){
        return size;
    }

    /**
    * 判断数组是否为空
    */
    public boolean isEmpty(){
        return size == 0;
    }


    /**
    * 获取链表某个位置的元素
    */
    public E get(int index){

        if(index < 0 || index > size){
            throw new IllegalArgumentException("Add failed. Illegal index.");
        }
        Node prev  = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        return  prev.data;
    }

    /**
    * 删除链表中某个位置的元素
    */
    public E remove(int index){

        if(index < 0 || index > size){
            throw new IllegalArgumentException("Add failed. Illegal index.");
        }

        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }

        Node removeNode = prev.next;
        prev.next = prev.next.next;
        return removeNode.data;
    }



    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        Node prev = dummyHead;
        for (int i = 0; i < size; i++) {
            prev = prev.next;
            stringBuffer.append("index =" + i + "; data = " + prev.data.toString()).append("\n");
        }


        return stringBuffer.toString();
    }
}
