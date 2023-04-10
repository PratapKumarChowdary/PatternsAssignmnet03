package Question24;

public class GarbageCollectionExample {

    public static void main(String[] args) {
       
        Object obj1 = new Object();
        Object obj2 = new Object();

       
        obj1 = null;
        obj2 = null;

        // calling garbage collection so that created objects were destroyed
        System.gc();

       
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Garbage collection finished by here");
    }
}

