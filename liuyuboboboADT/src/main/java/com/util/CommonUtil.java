package com.util;

import java.util.Random;

public class CommonUtil {


    /**
    *  ������ɲ�����n��Ԫ�ص���������
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
