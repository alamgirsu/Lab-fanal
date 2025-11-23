
public class InheritanceEmployee {
    public static void main(String[] args) {
        HRManager manager = new HRManager();
        System.out.print("HR Manager work: ");
        manager.work();
        System.out.print("HR Manager new task: ");
        manager.addEmployee();
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