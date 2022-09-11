package Polimorfism;

public class RZA extends Worker {
    public RZA(String name, String lastName, String profession, int days) {
        super(name, lastName, profession, days);
    }

    @Override
    public void goToWork() {
        super.goToWork();
    }

    @Override
    public void goToVacation() {
        super.goToVacation();
    }
}