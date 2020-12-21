package Lesson8;

public class EmployeeSalaryHourl implements Salary{
    private int salarHourl;

    public EmployeeSalaryHourl(int salarHourl) {
        this.salarHourl = salarHourl;
    }

    public int getSalarHourl() {
        return salarHourl;
    }

    public void setSalarHourl(int salarHourl) {
        this.salarHourl = salarHourl;
    }

    @Override
    public int salary() {
        return salarHourl;
    }
}
