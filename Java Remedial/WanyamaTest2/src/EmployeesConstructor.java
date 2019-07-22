public class EmployeesConstructor {

    String empName, empEmail, empPhoneNumber, empSalary, empPeriodEmployed;

    public EmployeesConstructor(String empName, String empEmail, String empPhoneNumber, String empSalary, String empPeriodEmployed) {
        this.empName = empName;
        this.empEmail = empEmail;
        this.empPhoneNumber = empPhoneNumber;
        this.empSalary = empSalary;
        this.empPeriodEmployed = empPeriodEmployed;
    }

    @Override
    public String toString() {
        return empName + empEmail + empPhoneNumber + empSalary + empPeriodEmployed;
    }
}
