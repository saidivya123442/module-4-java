public class employee {
    private int salary;
    private String name;

    public employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        employee emp = new employee("Anand", 50000);

        System.out.println("employee Name: " + emp.getName());
        System.out.println("employee Salary: " + emp.getSalary());

        emp.setName("Anand Reddy");
        System.out.println("Updated Employee Name: " + emp.getName());
    }
}
