package Question6;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "Hello";
        s.charAt(0) = "K";
        
        
        System.out.println(s);
        
        StringBuffer sb = new StringBuffer("Hello");
        sb.setCharAt(0, 'P');
        System.out.println(sb); 

        
	}

}
