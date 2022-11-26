package JavaForAdvanced;

public class mnogopotochnostb {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("Hello world from main thread");
    }

}
class MyThread extends Thread{
    public void run () {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Thread from MyThread");
        }
    }
}


