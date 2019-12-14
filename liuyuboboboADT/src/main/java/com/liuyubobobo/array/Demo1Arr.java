package com.liuyubobobo.array;

public class Demo1Arr {

    public static void main(String[] args) throws Exception {

        ArrayS arrayS = new ArrayS();

        for (int i = 0; i < 5; i++) {
            arrayS.add(i,i);
        }

        Demo1Arr d1 = new Demo1Arr();
        d1.testArrayGenericty();
    }



    public void testArrayGenericty() throws Exception {

        ArrayGenericty<Integer> arrTest = new ArrayGenericty<Integer>(10);
        for (int i = 0; i < 5; i++) {
            arrTest.add(i,i);
        }


        arrTest.add(3,666);

        for (int i = 0; i < arrTest.getSize(); i++) {
            System.out.print("--->" + arrTest.getValue(i));
        }

        System.out.println("---数组的容量");
        System.out.println(arrTest.getCapacity());

        arrTest.del(0);
        arrTest.del(0);
        arrTest.del(0);
        arrTest.del(0);
        arrTest.del(1);
        arrTest.del(0);
        arrTest.add(0,111);
        arrTest.add(0,111);
        arrTest.del(0);
        System.out.println("");
        for (int i = 0; i < arrTest.getSize(); i++) {
            System.out.print("--->" + arrTest.getValue(i));
        }
        System.out.println("");
        System.out.println("---数组长度");
        System.out.println(arrTest.getSize());
        System.out.println("---数组的容量");
        System.out.println(arrTest.getCapacity());
    }


}
