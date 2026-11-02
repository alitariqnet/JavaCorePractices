package Java.concurrency;

public class MultiThreading {

    public class HelloRunnable implements Runnable {

        public void run() {
            System.out.println("Hello from a thread!");
        }

    }

    public class HelloThread extends Thread {

        public void run() {
            System.out.println("Hello from a thread!");
        }

    }

    public static void main(String[] args) {
        (new Thread(new HelloRunnable())).start();
        (new HelloThread()).start();

    }
}
