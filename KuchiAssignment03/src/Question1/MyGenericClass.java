package Question1;

import java.util.ArrayList;

public class MyGenericClass<T> {
    private ArrayList<T> myList = new ArrayList<T>();
    
    public void addElement(T element) {
        myList.add(element);
    }
    
    public T getElement(int index) {
        return myList.get(index);
    }
    
    public static void main(String[] args) {
        MyGenericClass<String> myStringList = new MyGenericClass<String>();
        myStringList.addElement("Hiii");
        myStringList.addElement("Pratap Kumar Kuchi");
        System.out.println(myStringList.getElement(0) + " " + myStringList.getElement(1));
        
        MyGenericClass<Integer> myIntList = new MyGenericClass<Integer>();
        myIntList.addElement(880);
        myIntList.addElement(887);
        System.out.println(myIntList.getElement(0) + myIntList.getElement(1));
    }
}
