import java.util.*;

public class TreeSetPerson {
    public static void main(String[] args) {

        //Set<Person> math = new HashSet<Person>();
        Set<Person> math = new TreeSet<Person>();
        math.add(new Person(13, "Nick"));
        math.add(new Person(10, "Mick"));
        math.add(new Person(28, "goodbye1"));
        math.add(new Person(20, "goodbye9"));
        math.add(new Person(20, "goodbye9"));
        math.add(new Person(20, "goodbye9"));

        Iterator<Person> iterator = math.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}

class Person implements Comparable<Person> {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }


    @Override
    public int compareTo(Person o1) {
        if (this.age < o1.age) return -1;
        else return 1;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}
