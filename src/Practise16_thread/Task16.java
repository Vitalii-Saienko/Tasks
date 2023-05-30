package Practise16_thread;

public class Task16 {
    public static void main(String[] args) {
//        Задача:
//        Создайте 5 потоков, которые выводят числа от 1 до 10. Каждый поток должен использовать метод run() для вывода чисел.
        ThreadHomeWork threadHomeWork1 = new ThreadHomeWork();
        ThreadHomeWork threadHomeWork2 = new ThreadHomeWork();
        ThreadHomeWork threadHomeWork3 = new ThreadHomeWork();
        ThreadHomeWork threadHomeWork4 = new ThreadHomeWork();
        ThreadHomeWork threadHomeWork5 = new ThreadHomeWork();
        threadHomeWork1.start();
        threadHomeWork2.start();
        threadHomeWork3.start();
        threadHomeWork4.start();
        threadHomeWork5.start();

//        Задача:
//        Создайте 3 потока, которые вычисляют и выводят квадраты чисел от 1 до 10. Каждый поток должен использовать метод run() для вычисления и вывода квадратов.
        ThreadTask2 threadTask2_1 = new ThreadTask2();
        ThreadTask2 threadTask2_2 = new ThreadTask2();
        ThreadTask2 threadTask2_3 = new ThreadTask2();
        threadTask2_1.start();
        threadTask2_2.start();
        threadTask2_3.start();

//        Задача:
//        Создайте 2 потока, которые выводят все четные числа от 1 до 20 и все нечетные числа от 1 до 20 соответственно. Каждый поток должен использовать метод run() для вывода чисел.
        Thread threadTask3 = new Thread(()-> {
            for (int i = 0; i < 21; i++) {
                if (i % 2 == 0){
                    System.out.println("task3, thread1: " + i);
                }
            }
        });
        threadTask3.start();

        Thread threadTask3_2 = new Thread(()-> {
            for (int i = 0; i < 21; i++) {
                if (i % 2 != 0){
                    System.out.println("task3, thread2: " + i);
                }
            }
        });
        threadTask3_2.start();

//        Задача:
//        Создайте 4 потока, которые выводят сообщение "Hello, World!" каждый с задержкой в 1 секунду. Каждый поток должен использовать метод run() для вывода сообщения.
        ThreadTask4 threadTask4_1 = new ThreadTask4();
        ThreadTask4 threadTask4_2 = new ThreadTask4();
        ThreadTask4 threadTask4_3 = new ThreadTask4();
        ThreadTask4 threadTask4_4 = new ThreadTask4();
        threadTask4_1.start();
        threadTask4_2.start();
        threadTask4_3.start();
        threadTask4_4.start();

//      Задача:
//      Создайте 3 потока, каждый из которых выводит свое имя 5 раз. Каждый поток должен использовать метод run() для вывода имени.
        ThreadTask5 threadTask5_1 = new ThreadTask5();
        ThreadTask5 threadTask5_2 = new ThreadTask5();
        ThreadTask5 threadTask5_3 = new ThreadTask5();
        threadTask5_1.setName("Mister Thread One");
        threadTask5_2.setName("Mister Thread Two");
        threadTask5_3.setName("Mister Thread Three");
        threadTask5_1.start();
        threadTask5_2.start();
        threadTask5_3.start();
    }

}
