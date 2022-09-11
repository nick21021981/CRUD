import java.util.Arrays;
import java.util.Random;

public class HumanComparable {
    public static void main(String[] args) {
        Random random = new Random();
        Human[] array = new Human[random.nextInt(100)];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Human("firstName" + i, "lastName" + i, random.nextInt(100));
        }
        Arrays.sort(array);

        for (Human m : array) {
            System.out.println(m);
        }
    }
}

class Human implements Comparable<Human> {
    private String firstName;
    private String lastName;
    private int age;

    public Human(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Human o) {
        if (this.getAge() < o.getAge()) {
            return -1;
        } else if (this.getAge() > o.getAge()) {
            return 1;
        } else return 0;
    }

    @Override
    public String toString() {
        return "Имя '" + firstName + '\'' +
                ", Фамилия '" + lastName + '\'' +
                ", Возраст " + age + " лет";
    }

}


