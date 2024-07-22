/* example of approaching a variable by two or more threads
results in collapse of getting the correct value of the variable */
class Counter{
    int count;
    public synchronized void  increment(){
        count++;
    }
}

public class Eg_race_condition{

    public static void main(String[] a) throws InterruptedException {
        Counter c = new Counter();
        Runnable obj1 = ()->
        {
            for(int i = 0;i<1000;i++)
            {
                c.increment();
            }
        };
        Runnable obj2 = ()->
        {
            for(int i = 0;i<1000;i++)
            {
                c.increment();
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}

/*

next topic is about states in the Threads
        new state
        start()
        runnable state
        run()
        running state
        sleep(),wait()
        waiting state
        notify()
        dead state
        stop()

 */