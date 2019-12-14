package com.liuyubobobo.stack;

import com.util.CommonUtil;


public class Demo {
    public static void main(String[] args) throws Exception {
        int[] testArr = CommonUtil.getRandomArrByInputSize(200);
        StackArr<Integer> stack = new StackArr<Integer>(10);
        for (int i = 0; i < 10; i++) {
            System.out.println("--->" + testArr[i]);
            stack.push(testArr[i]);
        }

        System.out.println("start pop------------------------------");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
