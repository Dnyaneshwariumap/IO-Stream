package IOstream;

public class EmployeePayRoll {
    private int employeeId;
    private String employeeName;
    private double employeeSalary;

    public EmployeePayroll(int employeeId, String employeeName, double employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }
    /**
     * This method is Collecting the data From Employee
     */

    @Override
    public String toString() {
        return "EmployeePayroll [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
                + employeeSalary + "]";
    }

}

