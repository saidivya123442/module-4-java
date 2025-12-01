class Employee {
    String name;
    double salary;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    void displayManagerInfo() {
        displayInfo();
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "Hithashree";
        m.salary = 75000;
        m.department = "Human Resources";
        m.displayManagerInfo();
    }
}
