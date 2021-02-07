package childs;

import childs.Employee;

public class Specialist extends Employee {
    private int levels;



    public void setLevels(int levels) {
        this.levels = levels;
    }

    public int getLevels() {
        return levels;
    }

    public Specialist(String fio, int age, int salary, int levels) {
        super(fio, age, salary);
        this.levels = levels;
    }
    public void workWithClients() {
        super.person();
        System.out.print("\n" +
                " work with clients");
    }
}
