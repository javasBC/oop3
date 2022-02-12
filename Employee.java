public class Employee {
    //DATA
    private static  int ids=0;
    private int id;
    private String firstName;
    private String lastName;
    private double salary;
    private int floor;
    //func
    public Employee(String firstName, String lastName, double salary, int floor) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setSalary(salary);
        this.setFloor(floor);
        this.setId();
    }

    public int getId() {
        return id;
    }

    private void setId() {
        this.id = ++ids;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }


    public static void hireEmp(Employee employee){
        ids++;

    }
    public static void removeTheRookie(){
        ids--;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", floor=" + floor +
                '}';
    }
}
