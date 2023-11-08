package practices.practice2.sample2;

public class ThreadsPractice {

    public static void main(String[] args) {

        Thread thread1=new Thread(()->function1());
        Thread thread2=new Thread(()->function2());
        Thread thread3=new Thread(()->function3());

        thread1.start();


      try {
          thread1.join();
      }catch (InterruptedException e){
          e.printStackTrace();
      }

      thread2.start();
        try {
            thread2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }


        thread3.start();
        try {
            thread3.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
      }

    private static void function1(){
        System.out.println("Hello");
    }
    private static void function2(){
        System.out.println("every");
    }
    private static void function3(){
        System.out.println("body");
    }
}
