package CRUD;

import java.util.Date;

public class User  {
    private long ID;
    private String name;
    private String lastName;
    private int age;
    private boolean work;

    public User(long ID, String name, String lastName, int age, boolean work) {
        this.ID = ID;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.work = work;
    }
    public User(){};

    public long getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isWork() {
        return work;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWork(boolean work) {
        this.work = work;
    }

    public String convert(){
        return getID() + "|" + name + "|" + lastName +
                "|" + age + "|" + work + "|";
    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", work=" + work +
                '}';
    }
}
