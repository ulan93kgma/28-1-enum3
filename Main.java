public class Main {
    public static void main(String[] args) {
        Specialist Aktan = new Specialist("Saardarbekov", 25, 20000, 1 );
        Specialist Meerim = new Specialist("Kalieva", 26, 30000, 2);
        Specialist Aika = new Specialist("Toktosopiev", 28, 40000, 3);
        Developer Akak = new Developer("Karimbekov", 29, 500000, "Middle");
        Developer Ulan = new Developer("Toktobekov", 30, 60000, "Senior");
        Developer Sanya = new Developer("Marsbekov", 31, 20000, "Junior");
        Developer Saliya = new Developer("Sydykov", 45, 200000, "Junior");
        Manager Pasha = new Manager("Mambetov", 35, 30000, true);
        Manager Sergei = new Manager("Ikramov", 25, 30000, false);
        CEO Andrei = new CEO("Babanov", 35, 3500000, true);
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

    }
}
