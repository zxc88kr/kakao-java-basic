package ch17;

public class EmployeeTest {
    public static void main(String[] args) {
        System.out.println(Employee.getSerialNum());

        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("이순신");

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김유신");

        System.out.println(Employee.getSerialNum());

        // System.out.println(employeeLee.serialNum);
        // employeeKim.serialNum++;
        // System.out.println(employeeLee.serialNum);
        // System.out.println(employeeKim.serialNum);
        
        System.out.println(employeeLee.getEmployeeName() + "님의 사번은 " + employeeLee.getEmployeeId());
        System.out.println(employeeKim.getEmployeeName() + "님의 사번은 " + employeeKim.getEmployeeId());
    }
}