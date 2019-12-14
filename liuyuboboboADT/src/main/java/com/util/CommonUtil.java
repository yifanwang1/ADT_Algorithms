package com.util;

import java.util.Random;

public class CommonUtil {


    /**
    *  随机生成并返回n个元素的整型数组
    */

    public static int[] getRandomArrByInputSize(int size){

        Random random = new Random();
        int[] dataArr = new int[size];
        for (int i = 0; i < size; i++) {
            dataArr[i] = random.nextInt(100);
        }
        return dataArr;
    }


}
