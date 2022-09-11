import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Human1Comparator {
    public static void main(String[] args) {
        Random random = new Random();
        Human1[] array = new Human1[random.nextInt(100)];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Human1("firstName" + i,
                    "lastName" + i, random.nextInt(100));
        }
        // Можно написать анонимный класс
//        Comparator<Human1> comparator = new Comparator<Human1>() {
//            @Override
//            public int compare(Human1 o1, Human1 o2) {
//                //Можно прописать свою логику
//                if (o1.getAge() < o2.getAge()) {
//                    return -1;
//                } else if (o1.getAge() > o2.getAge()) {
//                    return 1;
//                } else return 0;
//                //Можно использовать метод у Integer - compare
//                return Integer.compare(o1.getAge(), o2.getAge());
//            }
//        };
//        Arrays.sort(array, comparator);
//        Arrays.sort(array, new ComparatorHuman());
//        Arrays.sort(array, new Comparator<Human1>() {
//            @Override
//            public int compare(Human1 o1, Human1 o2) {
//                return Integer.compare(o1.getAge(), o2.getAge());
//            }
//        });

        Arrays.sort(array, (m, n) -> (m.getAge() - n.getAge())); //Лямбда выражение!!!!!

        for (Human1 m : array) {
            System.out.println(m);
        }
    }
}
    //Можно написать отдельный класс

class ComparatorHuman implements Comparator<Human1> {
    @Override
    public int compare(Human1 o1, Human1 o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}

class Human1 {
    private String firstName;
    private String lastName;
    private int age;

    public Human1(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Имя '" + firstName + '\'' +
                ", Фамилия '" + lastName + '\'' +
                ", Возраст " + age + " лет";
    }

    public int getAge() {
        return age;
    }
}

