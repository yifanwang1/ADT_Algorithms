package com.liuyubobobo.queue;

public interface Queue<E> {
    /**
    * 入队
    */
    void enqueue(E e) throws Exception;
    /**
    * 出队
    */
    E dequeue() throws Exception;
    /**
    * 获取队首元素
    */
    E getFront();
    /**
    * 获取队列长度
    */
    int getSize();
    /**
    * 判断队列是否为空
    */
    boolean isEmpty();
}
