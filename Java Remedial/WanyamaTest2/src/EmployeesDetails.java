import java.util.ArrayList;

public class EmployeesDetails {

    public static void main(String[] args) {
        ArrayList<EmployeesConstructor> details;
// Instantiate the ArrayList
        details = new ArrayList<>();

        //Create the List Item using the constructor
        EmployeesConstructor emp1 = new EmployeesConstructor("King Wanyama ","wanyamasinior@email.com ","12345 ","20K ","3 Months");
        EmployeesConstructor emp2 = new EmployeesConstructor("King Wanyama ","wanyamasinior@email.com ","12345 ","20K ","3 Months");
        EmployeesConstructor emp3 = new EmployeesConstructor("King Wanyama ","wanyamasinior@email.com ","12345 ","20K ","3 Months");
        EmployeesConstructor emp4 = new EmployeesConstructor("King Wanyama ","wanyamasinior@email.com ","12345 ","20K ","3 Months");
        EmployeesConstructor emp5 = new EmployeesConstructor("King Wanyama ","wanyamasinior@email.com ","12345 ","20K ","3 Months");
        EmployeesConstructor emp6 = new EmployeesConstructor("King Wanyama ","wanyamasinior@email.com ","12345 ","20K ","3 Months");
        EmployeesConstructor emp7 = new EmployeesConstructor("King Wanyama ","wanyamasinior@email.com ","12345 ","20K ","3 Months");
        EmployeesConstructor emp8 = new EmployeesConstructor("King Wanyama ","wanyamasinior@email.com ","12345 ","20K ","3 Months");
        EmployeesConstructor emp9 = new EmployeesConstructor("King Wanyama ","wanyamasinior@email.com ","12345 ","20K ","3 Months");
        EmployeesConstructor emp10 = new EmployeesConstructor("King Wanyama ","wanyamasinior@email.com ","12345 ","20K ","3 Months");


        // Add your student names to the ArrayList
        details.add(emp1);
        details.add(emp2);
        details.add(emp3);
        details.add(emp4);
        details.add(emp5);
        details.add(emp6);
        details.add(emp7);
        details.add(emp8);
        details.add(emp9);
        details.add(emp10);

        // Finally print your arrayList using the toString function on the constructor class
        System.out.println(details.toString());
    }
}
