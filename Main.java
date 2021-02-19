import childs.Developer;
import childs.Employee;
import childs.Manager;
import childs.Specialist;
import parent.CEO;


public class Main {
    public static void main(String[] args) {
        Specialist Aktan = new Specialist("Saardarbekov", 25, 20000, 1);
        Specialist Meerim = new Specialist("Kalieva", 26, 30000, 2);
        Specialist Aika = new Specialist("Toktosopiev", 28, 40000, 3);
        Developer Akak = new Developer("Karimbekov", 29, 500000);
        Developer Ulan = new Developer("Toktobekov", 30, 60000);
        Developer Sanya = new Developer("Marsbekov", 31, 20000);
        Developer Saliya = new Developer("Sydykov", 45, 200000);
        Manager Pasha = new Manager("Mambetov", 35, 30000, true);
        Manager Sergei = new Manager("Ikramov", 25, 30000, false);
        CEO Andrei = new CEO("Babanov", 35, 3500000, true);

        Developer junior = new Developer(Developer.Grades.JUNIOR);
        junior.printDeveloperGrade();
        Developer middle = new Developer(Developer.Grades.MIDDLE);
        middle.printDeveloperGrade();
        Developer senior = new Developer(Developer.Grades.SENIOR);
        senior.printDeveloperGrade();
        Developer teamlead = new Developer(Developer.Grades.TEAMLEAD);
        teamlead.printDeveloperGrade();
        Developer developer = new Developer();
        developer.printPhrase();


        Aktan.workWithClients();
        Meerim.workWithClients();
        Aika.workWithClients();
        Akak.writeCode();
        Ulan.writeCode();
        Sanya.writeCode();
        Saliya.writeCode();
        Pasha.writeProcedures();
        Sergei.writeProcedures();
        Andrei.goPublic();
        Aika.goToVacation();

        Employee[] EmployeeArray = new Employee[10];
        EmployeeArray[0] = new Employee("childs.Specialist Aktan");
        EmployeeArray[1] = new Employee("childs.Specialist Meerim");
        EmployeeArray[2] = new Employee("childs.Specialist Aika");
        EmployeeArray[3] = new Employee("childs.Developer Akak");
        EmployeeArray[4] = new Employee("childs.Developer Ulan");
        EmployeeArray[5] = new Employee("childs.Developer Sanya");
        EmployeeArray[6] = new Employee("childs.Developer Saliya");
        EmployeeArray[7] = new Employee("childs.Manager Pasha");
        EmployeeArray[8] = new Employee("childs.Manager Sergei");
        EmployeeArray[9] = new Employee("parent.CEO Andrei");


        for (Employee employee : EmployeeArray) {

            System.out.println(employee.name + " едет в отпуск в честь дня рождения компании");
        }




    }
}
