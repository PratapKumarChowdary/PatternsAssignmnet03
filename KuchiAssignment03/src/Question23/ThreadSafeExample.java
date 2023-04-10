package Question23;

public class ThreadSafeExample {
	
	private final int value;
    private final String name;
    
    public ThreadSafeExample(int value, String name) {
        this.value = value;
        this.name = name;
    }
    
    public int getValue() {
        return value;
    }
    
    public String getName() {
        return name;
    }
}
