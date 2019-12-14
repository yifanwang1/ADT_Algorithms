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
    * 入队
    */
    public void enqueue(E e) throws Exception {
        /*if((front - tail == 1) || (tail - front) == data.length - 1){
            throw new Exception("队列已满，无法入队");
        }*/

        if(front - tail == 1){
            throw new Exception("队列已满，无法入队");
        }
        System.out.println(">>>>>>>>>>>>>执行入队操作》》》》》》》》》");
        System.out.println("队首" + front);
        System.out.println("队尾" + tail);
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
            throw new Exception("队列为空，无法出队");
        }
        System.out.println("执行出队操作-------------");
        System.out.println("队首" + front);
        System.out.println("队尾" + tail);
        E deE = data[front];
        data[front] = null;
        if(front == data.length - 1){
            front = 0;
        }else {
            front++;
        }
        System.out.println("出队后");
        System.out.println("队首" + front);
        System.out.println("队尾" + tail);
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
