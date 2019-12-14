package com.liuyubobobo.stack;

public class Array<E> {
    private E[] data;
    private int size;

    public Array(){
        this(10);
    }

    public Array(int capacity){
        data = (E[]) new Object[capacity];
        size = 0;
    }

    /**
     *  获取数组的长度
     */
    public int getSize(){
        return size;
    }

    /**
     * 获取数组的容量
     */
    public int getCapacity(){
        return data.length;
    }
    /**
     * 获取指定索引的数据
     */
    public E getValue(int index){
        return data[index];
    }

    /**
     * 在指定索引处插入元素
     */
    public void add(int index, E e){

        if(index > size || index < 0){
            throw new ArrayIndexOutOfBoundsException("插入索引大于数组的长度或小于0，无法插入");
        }

        //扩容
        if(size == data.length){
            reSize(data.length * 2);
        }

        for (int i = size - 1; i >= index; i--) {
            data[i+1] = data[i];
        }
        data[index] = e;
        size++;
    }

    /**
     *  在数组开始处添加元素
     */
    public void addFirst(E e){
        add(0, e);
    }

    /**
     * 在数组末尾添加元素
     */
    public void addLast(E e){
        add(size, e);
    }

    /**
     *   查找目标元素第一次出现的数组下标
     */
    public int findFirstIndex(E e){
        for (int i = 0; i < size; i++) {
            if(data[i] == e){
                return i;
            }
        }
        return -1;
    }

    /**
     *   删除指定索引出的元素
     */
    public E del(int index) throws Exception {

        if(index < 0 || index > size - 1){
            throw new Exception("索引超出数组范围，请调整");
        }

        E delE = data[index];
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i+1];
        }
        size--;
        //缩容操作
        if(size == data.length/4 && data.length/2 != 0){
            reSize(data.length/2);
        }
        return delE;
    }

    /**
    * 删除头结点元素
    */
    public E delFirst() throws Exception {
        return del(0);
    }

    /**
    * 删除末尾节点的元素
    */
    public E delLast() throws Exception {
        return del(size - 1);
    }

    /**
     *   实现数组的容量的大小调整
     */
    public void reSize(int newCapacity){

        E[] newData = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }
}
