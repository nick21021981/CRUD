package Polimorfism;

public class Worker {
    private String name;
    private String lastName;
    private String profession;
    private int days;

    public Worker(String name, String lastName, String profession, int days) {
        this.name = name;
        this.lastName = lastName;
        this.profession = profession;
        this.days = days;
    }

    public void goToWork(){
        System.out.println(name + " "+ lastName + " по специальности " +
                profession + " делает свою работу");
    }
    public void goToVacation(){
        System.out.println(name + " "+ lastName + " по специальности " +
                profession + " уходит в отпуск на " + days);
    }
}
