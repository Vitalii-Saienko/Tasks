package Practise16_thread;

public class ThreadHomeWork extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("task1: " + i);
        }
    }
}
class ThreadTask2 extends Thread{
    @Override
    public void run(){
        for (int i = 1; i <= 10; i++) {
            System.out.println("task2: " + i*i);
        }
    }
}
class ThreadTask4 extends Thread{
    @Override
    public void run(){
        try {
            ThreadTask4.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hello, world!");
    }
}
class ThreadTask5 extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("my name is: " + this.getName());
        }
    }
}