
package extraabstraction5;

abstract class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    abstract double calculateSalary();
    abstract void displayInfo();
}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    double calculateSalary() {
        return baseSalary + bonus;
    }

    void displayInfo() {
        System.out.println("Manager: " + name);
        System.out.println("Total Salary: $" + calculateSalary());
    }
}

class Programmer extends Employee {
    private int overtimeHours;
    private double hourlyRate;

    public Programmer(String name, double baseSalary, int overtimeHours, double hourlyRate) {
        super(name, baseSalary);
        this.overtimeHours = overtimeHours;
        this.hourlyRate = hourlyRate;
    }

    double calculateSalary() {
        return baseSalary + (overtimeHours * hourlyRate);
    }

    void displayInfo() {
        System.out.println("Programmer: " + name);
        System.out.println("Total Salary: $" + calculateSalary());
    }
} class Main {
    public static void main(String[] args) {
        Employee m = new Manager("Tose", 6000, 1000);
        Employee p = new Programmer("Durjoy", 5000, 20, 25);

        m.displayInfo();
        System.out.println("\n\n");
        p.displayInfo();
    }
}
