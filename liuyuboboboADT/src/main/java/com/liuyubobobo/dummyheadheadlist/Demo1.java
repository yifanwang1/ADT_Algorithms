package com.liuyubobobo.dummyheadheadlist;

public class Demo1 {
    public static void main(String[] args){

        DummyheadList<Integer> dummyheadList = new DummyheadList<Integer>();
        for (int i = 0; i < 10; i++) {
            Integer e = new Integer(i);
            dummyheadList.addFirst(e);
        }
        dummyheadList.addLast(100);
        System.out.println(dummyheadList.toString());

        System.out.println("删除元素----------------------");
        System.out.println(dummyheadList.remove(2));
    }
}
