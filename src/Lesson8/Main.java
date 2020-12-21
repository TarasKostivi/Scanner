package Lesson8;

public class Main {
    public static void main(String[] args) {

        EmployeeSalaryHourl employeeSalaryHourl = new EmployeeSalaryHourl(2000);
        EmployeeSalaryManth employeeSalaryManth = new EmployeeSalaryManth(100);

        employeeSalaryHourl.setSalarHourl(100);
        employeeSalaryManth.setSalaryManth(20);
        employeeSalaryHourl.salary();
        employeeSalaryManth.salary();

        int a = employeeSalaryHourl.salary();

        int b = employeeSalaryManth.salary();



    }
}
