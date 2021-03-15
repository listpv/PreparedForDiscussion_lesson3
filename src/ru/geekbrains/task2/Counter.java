package ru.geekbrains.task2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Counter {

    private  Lock lock;
    private long counter;

    public Counter() {
        this.lock = new ReentrantLock();
        this.counter = 0l;
    }

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
