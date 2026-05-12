package SingleInheritance;

import com.sun.xml.internal.ws.encoding.soap.SOAP12Constants;

public class Main_Company {

    public static void main(String[] args) {


        Employee obj = new Employee();
        System.out.println("Company Name: "+obj.company_name);
        System.out.println("Company Location: "+obj.company_location);
        System.out.println("Employee Name: "+obj.EmpName);
        System.out.println("Employee Id: "+obj.EmpId);

    }

}