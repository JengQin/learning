package com.jeng.jdk.juc.thread;

import java.sql.Timestamp;
import java.util.Locale;
import java.util.concurrent.locks.ReentrantLock;

/**
 * The SaleTicket
 *
 * @author JiaZheng
 * @create 2020-04-16 20:51
 */
public class SaleTicket {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

        Ticket ticket = Ticket.class.newInstance();

        new Thread(() -> {ticket.saleTicket();},"A").start();
        new Thread(() -> {ticket.saleTicket();},"B").start();
        new Thread(() -> {ticket.saleTicket();},"C").start();
    }
}

class Ticket{
    private int number=30;
    private ReentrantLock lock = new ReentrantLock();

    public void saleTicket(){
        try {

            for (int i = 0; i < 40; i++) {
                lock.lock();
                if (number<=0)             {
                    break;
                }
                System.out.println("Sale 1 ticket, remain: " + --number+", by "+Thread.currentThread().getName());
                lock.unlock();  
            }
        } catch (Exception e) {
            lock.unlock();
            throw e;
        }

        

    }

}
