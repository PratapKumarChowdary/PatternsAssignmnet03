package Question23;

public class ThreadDriver implements Runnable {
	
	private final ThreadSafeExample immutable;

    public ThreadDriver(ThreadSafeExample immutable) {
        this.immutable = immutable;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " - " + immutable.getValue() + " - " + immutable.getName());
    }

    public static void main(String[] args) {
    	ThreadSafeExample immutable = new ThreadSafeExample(24, "hello, Pratap");
    	ThreadDriver example = new ThreadDriver(immutable);

        Thread thread1 = new Thread(example);
        Thread thread2 = new Thread(example);

        thread1.start();
        thread2.start();
    }
}







