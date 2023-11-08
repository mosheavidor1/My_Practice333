package practices.practice9;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public  class ParallelAdvance implements Runnable {
        private int taskId;

        public ParallelAdvance(int taskId) {
            this.taskId = taskId;
        }

        public void run() {
            ExecutorService executor = Executors.newFixedThreadPool(3);
            executor.execute(() -> run1());
            executor.execute(() -> run2());
            executor.execute(() -> run3());
            executor.shutdown();
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


