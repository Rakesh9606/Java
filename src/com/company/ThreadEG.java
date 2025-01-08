package com.company;

class Degree implements Runnable {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(" Degre College");
            try {
                Thread.sleep(500);
            } catch (Exception e) {}
        }
    }
}
class College implements Runnable {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("college");
            try {Thread.sleep(500);} catch (Exception e) {}
        }
    }
}

public class ThreadEG {
    public static void main(String[] args) {
        Degree ob = new Degree();
        College obj = new College();
        Thread t1 = new Thread(ob);
        Thread t2 = new Thread(obj);
        t1.start();
        t2.start();
    }
}
