package com.liuyubobobo.queue;

public class LoopQueue<E> implements Queue<E>{

    private E[] data;
    private int front, tail;
    private int size;

    public LoopQueue(int capacity){
        front = 0;
        tail = 0;
        size = 0;
        data = (E[]) new Object[capacity];
    }

    public LoopQueue(){
        this(10);
    }

    /**
    * ���
    */
    public void enqueue(E e) throws Exception {
        /*if((front - tail == 1) || (tail - front) == data.length - 1){
            throw new Exception("�����������޷����");
        }*/

        if(front - tail == 1){
            throw new Exception("�����������޷����");
        }
        System.out.println(">>>>>>>>>>>>>ִ����Ӳ���������������������");
        System.out.println("����" + front);
        System.out.println("��β" + tail);
        data[tail] = e;
        if(tail == data.length - 1){
            tail = 0;
        }else{
            tail++;
        }
        size++;
    }

    public E dequeue() throws Exception {
        if(front == tail){
            throw new Exception("����Ϊ�գ��޷�����");
        }
        System.out.println("ִ�г��Ӳ���-------------");
        System.out.println("����" + front);
        System.out.println("��β" + tail);
        E deE = data[front];
        data[front] = null;
        if(front == data.length - 1){
            front = 0;
        }else {
            front++;
        }
        System.out.println("���Ӻ�");
        System.out.println("����" + front);
        System.out.println("��β" + tail);
        return deE;
    }



    public E getFront() {
        return null;
    }

    public int getSize() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }
}
