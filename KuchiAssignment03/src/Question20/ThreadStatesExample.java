package Question20;

public class ThreadStatesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread running...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread finished.");
            }
        });

        System.out.println("Thread state after creation: " + t.getState());

        t.start();

        System.out.println("Thread state after start: " + t.getState());

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread state after sleep: " + t.getState());

        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread state after join: " + t.getState());
    }


	}


