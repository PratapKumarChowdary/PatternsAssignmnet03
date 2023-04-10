package Question19;

public class ThreadDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        MyThreadEx t = new MyThreadEx();
        t.start();
        
        MyRunnable r = new MyRunnable();
        Thread t1 = new Thread(r);
        t1.start();
	}

}
