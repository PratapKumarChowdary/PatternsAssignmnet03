package Question26;

public class SingletonExample {
    private static SingletonExample instance;
    private String message;
    
    private SingletonExample() {
        message = "Hello, I am a pure singleton Example";
    }
    
    public static SingletonExample getInstance() {
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }
    
    public String getMessage() {
        return message;
    }
    
    public static void main(String[] args) {
    	SingletonExample singleton1 = SingletonExample.getInstance();
    	SingletonExample singleton2 = SingletonExample.getInstance();
        
        System.out.println(singleton1.getMessage());
        System.out.println(singleton2.getMessage());
        
        System.out.println("Were they same: " + (singleton1 == singleton2));
    }
}

