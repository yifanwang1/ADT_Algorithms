package com.liuyubobobo.stack;

public class StackArr<E> {

    Array array;

    public StackArr(){
        this(10);
    }

    public StackArr(int capacity){
        array = new Array<E>(capacity);
    }

    /**
    * ��ջ����
    */
    public void push(E e){
        array.addLast(e);
    }

    /**
    * ��ջ����
    */
    public E pop() throws Exception {
        return (E) array.delFirst();
    }

    /**
    * ��ȡ����Ԫ�صĳ���
    */
    public int getSize(){
        return array.getSize();
    }

    /**
    * �ж�ջ��Ԫ���Ƿ�Ϊ��
    */
    public boolean isEmpty(){
        return array.getSize() == 0;
    }
}
