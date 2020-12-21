package Lesson8;

public class EmployeeSalaryManth implements Salary {
    private int salaryManth;

    public EmployeeSalaryManth(int salaryManth) {
        this.salaryManth = salaryManth;
    }

    public int getSalaryManth() {
        return salaryManth;
    }

    public void setSalaryManth(int salaryManth) {
        this.salaryManth = salaryManth;
    }

    @Override
    public int salary() {
        return salaryManth;
    }
}
