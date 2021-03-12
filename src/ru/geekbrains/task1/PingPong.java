package ru.geekbrains.task1;

public class PingPong{

    private SyncPingPong syncPingPong;
    private int repeatNumber;

    public PingPong(int repeatNumber) {
        syncPingPong = new SyncPingPong();
        this.repeatNumber = repeatNumber;
    }

    public void action(){

        new Thread(() -> {
            for(int i = 0; i < repeatNumber; i++) {
                syncPingPong.doPing();
            }
        }).start();

        new Thread(() -> {
            for(int i = 0; i < repeatNumber; i++) {
                syncPingPong.doPong();
            }
        }).start();
    }
}
