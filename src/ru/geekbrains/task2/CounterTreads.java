package ru.geekbrains.task2;

public class CounterTreads {

    private Counter counter;

    public CounterTreads() {
        counter = new Counter();
    }

    public void action(){
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 10; j++) {
                        counter.increaseCounter();
                    }
                }
            }).start();
        }

        try {
            Thread.sleep(1000);
            System.out.println("Количество = " + counter.getCounter());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

