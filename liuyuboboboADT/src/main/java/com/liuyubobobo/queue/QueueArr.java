package com.liuyubobobo.queue;

public class QueueArr<E> implements Queue<E>{

    private E[] data;
    Array arrayQueue;

    public QueueArr(int capacity){
        arrayQueue = new Array(capacity);
    }

    public QueueArr(){
        this(10);
    }

    /**
    * ����
    */
    public void enqueue(E e) {
        arrayQueue.addLast(e);
    }

    /**
    * ����
    */
    public E dequeue() throws Exception {
        return (E) arrayQueue.delFirst();
    }

    /**
    * ��ȡ������Ԫ��
    */
    public E getFront() {
        return null;
    }

    /**
    *
    */
    public int getSize() {
        return arrayQueue.getSize();
    }

    /**
    *
    */
    public boolean isEmpty() {
        return arrayQueue.getSize() == 0;
    }
}
