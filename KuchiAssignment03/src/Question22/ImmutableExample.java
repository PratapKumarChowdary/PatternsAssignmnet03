package Question22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ImmutableExample {
    private final String name;
    private final int age;
    private final List<String> hobbies;

    public ImmutableExample(String name, int age, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = new ArrayList<>(hobbies); 
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getHobbies() {
        return Collections.unmodifiableList(hobbies);
    }



    public static void main(String[] args) {
        List<String> hobbies = new ArrayList<>();
        hobbies.add("Watching Movies");
        hobbies.add("Music");
        ImmutableExample person = new ImmutableExample("Pratap", 24, hobbies);

        System.out.println(person.getName()); 
        System.out.println(person.getAge()); 
        System.out.println(person.getHobbies()); 

        // Here it is immutable
        hobbies.add("cooking");
        System.out.println(person.getHobbies()); 
    }
}
