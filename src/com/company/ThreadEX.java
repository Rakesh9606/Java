package com.company;
//one way to create thtread
class Hai extends Thread {
    public void run() {
        for (int i = 0; i <= 4; i++) {
            System.out.println("hi");

            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }

    }
}
    class Hello extends Thread {
        public void run() {
            for (int i = 0; i <= 4; i++) {
                System.out.println("hello");

                try {
                    Thread.sleep(1000);
                } catch (Exception e) {

                }
            }
        }
    }


    public  class ThreadEX {
        public static void main(String[] args) {
            Hai ob = new Hai();
            Hello obj = new Hello();
            ob.start();
            obj.start();
        }
    }

