package childs;

public class Developer extends Employee {




    public Grades grades;

    public Developer() {
        super();
    }




    public Developer(String fio, int age, int salary) {
        super(fio, age, salary);

    }
    public Developer(Grades grades) {
        this.grades = grades;
    }
    public void writeCode() {
        super.person();
        System.out.println(" writes code");
    }

    @Override
    public void goToVacation() {
        System.out.println("I am going to Maldivy");
    }

    public void printPhrase() {
        for (Grades grades: Grades.values()) {
            System.out.println(grades + " " + grades.phrase);
        }
    }

    public enum Grades {
        JUNIOR("jun developer"),
        MIDDLE("mid developer"),
        SENIOR("sen developer"),
        TEAMLEAD("team developer");
        String phrase;
        Grades(String phrase) {
            this.phrase = phrase;
        }



    }
    public void printDeveloperGrade() {
        switch (grades) {
            case JUNIOR:
                System.out.println("I am a " + Grades.JUNIOR + " developer");
                break;
            case MIDDLE:
                System.out.println("I am a " + Grades.MIDDLE + " developer");
                break;
            case SENIOR:
                System.out.println("I am a " + Grades.SENIOR + " developer");
                break;
            case TEAMLEAD:
                System.out.println("I am a " + Grades.TEAMLEAD + " developer");
                break;
        }
    }
}
