
class A extends Thread{
   public void run(){
       for(int i = 0;i<5;i++){
           System.out.println("hi");
           try {
               Thread.sleep(10);
           }catch (InterruptedException e){
               e.printStackTrace();
           };
       }
       //Thread t1 = new Thread();
   }
}

class B extends Thread{
    public void run(){
        for(int i = 0;i<5;i++){
            System.out.println("hello");
            try {
                Thread.sleep(10);
            }catch (InterruptedException e){
                e.printStackTrace();
            };
        }
    }
}

public class Eg_thread_priority {
    public static void main(String[] a)
    {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        obj2.start();
    }
}
