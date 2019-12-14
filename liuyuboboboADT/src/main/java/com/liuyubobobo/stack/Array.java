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
     *  ��ȡ����ĳ���
     */
    public int getSize(){
        return size;
    }

    /**
     * ��ȡ���������
     */
    public int getCapacity(){
        return data.length;
    }
    /**
     * ��ȡָ������������
     */
    public E getValue(int index){
        return data[index];
    }

    /**
     * ��ָ������������Ԫ��
     */
    public void add(int index, E e){

        if(index > size || index < 0){
            throw new ArrayIndexOutOfBoundsException("����������������ĳ��Ȼ�С��0���޷�����");
        }

        //����
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
     *  �����鿪ʼ�����Ԫ��
     */
    public void addFirst(E e){
        add(0, e);
    }

    /**
     * ������ĩβ���Ԫ��
     */
    public void addLast(E e){
        add(size, e);
    }

    /**
     *   ����Ŀ��Ԫ�ص�һ�γ��ֵ������±�
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
     *   ɾ��ָ����������Ԫ��
     */
    public E del(int index) throws Exception {

        if(index < 0 || index > size - 1){
            throw new Exception("�����������鷶Χ�������");
        }

        E delE = data[index];
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i+1];
        }
        size--;
        //���ݲ���
        if(size == data.length/4 && data.length/2 != 0){
            reSize(data.length/2);
        }
        return delE;
    }

    /**
    * ɾ��ͷ���Ԫ��
    */
    public E delFirst() throws Exception {
        return del(0);
    }

    /**
    * ɾ��ĩβ�ڵ��Ԫ��
    */
    public E delLast() throws Exception {
        return del(size - 1);
    }

    /**
     *   ʵ������������Ĵ�С����
     */
    public void reSize(int newCapacity){

        E[] newData = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }
}
