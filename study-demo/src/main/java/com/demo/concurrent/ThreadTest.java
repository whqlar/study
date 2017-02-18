package com.demo.concurrent;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wu on 17/2/18.
 */
public class ThreadTest {

    @Test
    public void testThreadNum() {
        List<Thread> threads = new ArrayList<Thread>();

        int i = 0;
        while (true) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            thread.start();
            threads.add(thread);

            System.out.println(++i);
        }

    }
}
