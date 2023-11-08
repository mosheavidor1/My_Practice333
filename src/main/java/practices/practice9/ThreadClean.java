package practices.practice9;

public class ThreadClean {
    public static void main(String[] args) {


    }
    class MyTask implements Runnable {




        private int taskId;

        public MyTask(int taskId) {
            this.taskId = taskId;
        }

        public void run() {
            Thread t1 = new Thread(() -> run1());
            Thread t2 = new Thread(() -> run2());
            Thread t3 = new Thread(() -> run3());

            t1.start();
            t2.start();
            t3.start();

            try {
                t1.join();
                t2.join();
                t3.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public void run1() {
            System.out.println("hello");
        }

        public void run2() {
            System.out.println("good");
        }

        public void run3() {
            System.out.println("bye");
        }
    }

}
