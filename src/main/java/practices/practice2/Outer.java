package practices.practice2;



public class Outer {

    class inner{

      private static String name = "Moshe";
  private static int age = 39;

        private inner(String name , int age) {

        }
    }

       private static String getName(String name) {
            return name;
        }

       private   static int getAge(int age) {
            return age;
        }



        public static void main(String[] args) {
            Outer outer = new Outer();
            inner in = outer.new inner(inner.name,inner.age);

            System.out.println(getAge(in.age)+" "+getName(in.name));

        }
    }



