package parent;

import childs.Employee;

public class CEO extends Employee {
    private boolean hasCompanyCar;

    public void setHasCompanyCar(boolean hasCompanyCar) {
        this.hasCompanyCar = hasCompanyCar;
    }

    public boolean isHasCompanyCar() {
        return hasCompanyCar;
    }

    public CEO(String fio, int age, int salary, boolean hasCompanyCar) {
        super(fio, age, salary);
        this.hasCompanyCar = hasCompanyCar;
    }
    public void goPublic() {
        super.person();
        System.out.print("\n" +
                " working on IPO");
    }
    @Override
    public void goToVacation() {
        System.out.println("I am going to Thailand");
    }
}
