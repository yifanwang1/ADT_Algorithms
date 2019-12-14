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
    * 进栈操作
    */
    public void push(E e){
        array.addLast(e);
    }

    /**
    * 出栈操作
    */
    public E pop() throws Exception {
        return (E) array.delFirst();
    }

    /**
    * 获取数据元素的长度
    */
    public int getSize(){
        return array.getSize();
    }

    /**
    * 判断栈中元素是否为空
    */
    public boolean isEmpty(){
        return array.getSize() == 0;
    }
}
