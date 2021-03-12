package ru.geekbrains.task1;

public class SyncPingPong {

    private boolean flag = false;

    public synchronized void doPong(){
        while (!flag){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }
        System.out.println("pong");
        flag = false;
        notify();
    }

    public synchronized void doPing(){
        while (flag) {
            try {
                wait();
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("ping");
        flag = true;
        notify();
    }
}
