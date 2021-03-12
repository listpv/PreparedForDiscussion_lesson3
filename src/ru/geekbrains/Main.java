package ru.geekbrains;

import ru.geekbrains.task1.PingPong;
import ru.geekbrains.task2.CounterTreads;

//1. Реализовать программу, в которой два потока поочередно пишут ping и pong.
//2. Реализовать потокобезопасный счетчик с помощью интерфейса Lock.

public class Main {

    public static void main(String[] args) {
	// write your code here

        new PingPong(5).action();

        new CounterTreads().action();
    }
}
