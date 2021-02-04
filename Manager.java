public class Manager extends Employee {
    private boolean hasStocks;

    public void setHasStocks(boolean hasStocks) {
        this.hasStocks = hasStocks;
    }

    public boolean isHasStocks() {
        return hasStocks;
    }

    public Manager(String fio, int age, int salary, boolean hasStocks) {
        super(fio, age, salary);
        this.hasStocks = hasStocks;
    }
    public void writeProcedures() {
        super.person();
        System.out.print("\n" +
                " developing procedures");
    }
    @Override
    public void goToVacation() {
        System.out.println("I am going to Egipet");
    }
}
