package com.liuyubobobo.array;

public class ArrayS {

    /**
    * ���ڴ������
    */
    private int[] data;

    /**
    * ����Ĵ�С
    */
    private int size;

    /**
    *  ���ݱ���
    */
    private int EXPANSION_SIZE = 2;

    /**
    *   �޲ι��캯����Ĭ�ϳ�ʼ����������Ϊ10
    */
    public ArrayS() throws IllegalAccessException {
        this(10);
    }

    /**
    * ���ݹ������ʼ�����������ڳ�ʼ������
    */
    public ArrayS(int capacity) throws IllegalAccessException {
        if(capacity < 0){
            throw new IllegalAccessException("capacity could not < 0");
        }
        data = new int[capacity];
    }

    /**
    * ��ȡ����ĳ���
    */
    public int getSize(){
        return size;
    }

    /**
    * �ж������Ƿ�Ϊ��
    */
    public boolean isEmpty(){
        return size == 0;
    }

    /**
    * ������ָ���±����Ԫ��
    */
    public void add(int index, int value){

        if(index > size || index < 0){
            throw new ArrayIndexOutOfBoundsException("����������������ĳ��ȣ��޷�����");
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
    * �ڿ�ͷ���Ԫ��
    */
    public void addFirst(int e){
        this.add(0,e);
    }
    /**
    * ��ĩβ���Ԫ��
    */
    public void addLast(int e){
        this.add(size,e);
    }

    /**
    *  ��ȡԪ�ص�һ�γ��ֵ��±�
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
    *   ʵ�����������
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
        strBF.append("��������Ϊ" + this.size + "\n");
        strBF.append("----------------------------------------------------");
        strBF.append("���鳤��Ϊ" + data.length + "\n");
        strBF.append("----------------------------------------------------");
        for (int i = 0; i < size; i++) {
            strBF.append("------>" + data[i] + "; \n" );
        }
        return strBF.toString();
    }
}
