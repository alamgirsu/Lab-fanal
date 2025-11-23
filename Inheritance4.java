public class Inheritance4 {
    public static void main(String[] args) {
        HRManager manager = new HRManager();
        manager.work();
        manager.addEmployee();
        System.out.println("Manager Salary: " + manager.getSalary());
    }
}

class Employee {
    public void work() {
        System.out.println("Employee is working.");
    }

    public double getSalary() {
        return 50000.00;
    }
}

class HRManager extends Employee {
    @Override
    public void work() {
        System.out.println("HR Manager is managing HR activities.");
    }

    public void addEmployee() {
        System.out.println("HR Manager is adding a new employee.");
    }
}