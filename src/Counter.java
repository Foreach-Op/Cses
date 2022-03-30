import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class Counter {
    private int value;
    public  void increment(){
        this.value++;
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService threadPool= Executors.newFixedThreadPool(10);
        Counter counter=new Counter();
        for (int i = 0; i < 100; i++) {
            threadPool.submit(new Incrementer(counter,1000));
        }
        threadPool.shutdown();
        threadPool.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println(counter.value);
    }

    static class Incrementer implements Runnable{
        private Counter counter;
        private final int num;
        public Incrementer(Counter counter,int num){
            this.counter=counter;
            this.num=num;
        }
        @Override
        public void run() {
            for (int i = 0; i < num; i++) {
                this.counter.increment();
            }
        }
    }
}
