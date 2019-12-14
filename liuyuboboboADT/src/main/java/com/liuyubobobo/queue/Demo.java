package com.liuyubobobo.queue;

import org.junit.Test;

public class Demo {


    @Test
    public void testLoopQueue() throws Exception {

        LoopQueue<Integer> loopQueue = new LoopQueue<Integer>(5);
        loopQueue.enqueue(1);
        loopQueue.enqueue(2);
        loopQueue.enqueue(3);
        loopQueue.enqueue(4);
        loopQueue.enqueue(4);
        loopQueue.dequeue();
       /* loopQueue.dequeue();
        loopQueue.enqueue(4);
        loopQueue.dequeue();
        loopQueue.dequeue();
        loopQueue.dequeue();
        loopQueue.enqueue(4);
        loopQueue.enqueue(4);
        loopQueue.enqueue(4);
        loopQueue.dequeue();
        loopQueue.dequeue();
        loopQueue.dequeue();
        loopQueue.dequeue();
        loopQueue.dequeue();
        loopQueue.enqueue(4);
        loopQueue.enqueue(4);*/
        //loopQueue.enqueue(4);
    }
}
