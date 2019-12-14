package com.liuyubobobo.array;

public class ArrayS {

    /**
    * 用于存放数据
    */
    private int[] data;

    /**
    * 数组的大小
    */
    private int size;

    /**
    *  扩容倍数
    */
    private int EXPANSION_SIZE = 2;

    /**
    *   无参构造函数，默认初始化数组容量为10
    */
    public ArrayS() throws IllegalAccessException {
        this(10);
    }

    /**
    * 数据工具类初始化，参数用于初始化容量
    */
    public ArrayS(int capacity) throws IllegalAccessException {
        if(capacity < 0){
            throw new IllegalAccessException("capacity could not < 0");
        }
        data = new int[capacity];
    }

    /**
    * 获取数组的长度
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
    * 在数组指定下表，添加元素
    */
    public void add(int index, int value){

        if(index > size || index < 0){
            throw new ArrayIndexOutOfBoundsException("插入索引大于数组的长度，无法插入");
        }

        if(data.length == size){
            reSize(size * EXPANSION_SIZE);
        }

        for (int i = size; i > index ; i--) {
            data[i] = data[i-1];
        }
        data[index] = value;
        size++;
    }

    /**
    * 在开头添加元素
    */
    public void addFirst(int e){
        this.add(0,e);
    }
    /**
    * 在末尾添加元素
    */
    public void addLast(int e){
        this.add(size,e);
    }

    /**
    *  获取元素第一次出现的下标
    */
    public int indexFirstAt(int e){
        for (int i = 0; i < size; i++) {
            if(data[i] == e){
                return  i;
            }
        }
        return -1;
    }


    /**
    *   实现数组的扩容
    */
    public void reSize(int capacity){
        int[] newData = new int[capacity];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    @Override
    public String toString(){

        StringBuffer strBF = new StringBuffer();
        strBF.append("数组容量为" + this.size + "\n");
        strBF.append("----------------------------------------------------");
        strBF.append("数组长度为" + data.length + "\n");
        strBF.append("----------------------------------------------------");
        for (int i = 0; i < size; i++) {
            strBF.append("------>" + data[i] + "; \n" );
        }
        return strBF.toString();
    }
}
