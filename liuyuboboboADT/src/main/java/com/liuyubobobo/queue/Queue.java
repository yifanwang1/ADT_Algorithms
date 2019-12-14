package com.liuyubobobo.queue;

public interface Queue<E> {
    /**
    * ���
    */
    void enqueue(E e) throws Exception;
    /**
    * ����
    */
    E dequeue() throws Exception;
    /**
    * ��ȡ����Ԫ��
    */
    E getFront();
    /**
    * ��ȡ���г���
    */
    int getSize();
    /**
    * �ж϶����Ƿ�Ϊ��
    */
    boolean isEmpty();
}
