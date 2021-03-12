package ru.geekbrains.task2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Counter {

    private  Lock lock = new ReentrantLock();
    private long counter = 0l;

    public void increaseCounter(){
        try {
            lock.lock();
            counter++;
        }
        finally {
            lock.unlock();
        }
    }

    public long getCounter() {
        return counter;
    }
}
