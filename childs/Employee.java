package childs;

public class Employee {
    private String fio;
    private int age;
    private int salary;
    public String name;
    public Employee(String name) {
    this.name = name;
    }

    public Employee() {

    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFio() {
        return fio;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public Employee(String fio, int age, int salary) {
        this.fio = fio;
        this.age = age;
        this.salary = salary;
    }
    public void person() {
        System.out.print(" FIO: " + fio + ", age: " + age + ", Salary: " + salary + " ");
    }
    public void goToVacation() {
        System.out.println("i going to Bali");
    }

}
