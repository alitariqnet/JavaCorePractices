package Java;

public class TaskRunner {

    private volatile static int number;
    private volatile static boolean ready;

    private static class Reader extends Thread {

        @Override
        public void run() {
            System.out.println("line 12");
            while (!ready) {
                System.out.println("line 14");
                Thread.yield();
                System.out.println("line 16");
            }
            System.out.println("line 18");

            System.out.println(number);
            System.out.println("line 21");
        }
    }

    public static void main(String[] args) {
        System.out.println(number);
        System.out.println(ready);
        new Reader().start();
        System.out.println("line 22");
        number = 42;
        System.out.println("line 24");
        ready = true;
        System.out.println("line 26");

//      Output(less often):
//        line 22
//        line 12
//        line 14
//        line 24
//        line 16
//        line 26
//        line 18
//        42
//        line 21

//      And:
//        line 22
//        line 12
//        line 14
//        line 24
//        line 16
//        line 18
//        42
//        line 26
//        line 21

//      Output(more often):
//        line 22
//        line 24
//        line 26
//        line 12
//        line 18
//        42
//        line 21

//        Using volatile with both variables output always:
//        line 22
//        line 24
//        line 26
//        line 12
//        line 18
//        42
//        line 21
    }
}
