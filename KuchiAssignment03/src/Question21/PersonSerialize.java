package Question21;

import java.io.*;

public class PersonSerialize implements Serializable {
    private String name;
    private int age;
    private String address;

    public PersonSerialize(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void serialize(String fileName) {
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(this);
            out.close();
            fileOut.close();
            System.out.println("Object has been serialized here");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static PersonSerialize deserialize(String fileName) {
    	PersonSerialize p = null;
        try {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            p = (PersonSerialize) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Object has been deserialized here");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return p;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Address: " + address;
    }

    public static void main(String[] args) {
    	PersonSerialize john = new PersonSerialize("Pratap Kumar", 24, "111 5 N Dr Maryville");
        john.serialize("person.ser");

        PersonSerialize p = PersonSerialize.deserialize("person.ser");
        System.out.println(p);
    }
}

