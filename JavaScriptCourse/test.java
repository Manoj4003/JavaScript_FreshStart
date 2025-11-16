package Test;

import java.util.ArrayList;
import java.util.List;

public class Employee_emp {

    private int emp_id;
    private String emp_name;
    private int emp_salary;

   
    public Employee_emp(int emp_id, String emp_name, int emp_salary) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_salary = emp_salary;
    }

    
    public int getEmp_id() {
        return emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public int getEmp_salary() {
        return emp_salary;
    }

   
    public void setSalary(int emp_salary) {
        this.emp_salary = emp_salary;
    }

   
    public void display() {
        System.out.println("Id : " + emp_id + " Name : " + emp_name + " Salary : " + emp_salary);
    }

    
    public static void main(String[] args) {

       
        List<Employee_emp> list = new ArrayList<>();

       
        list.add(new Employee_emp(101, "Manoj", 35000));
        list.add(new Employee_emp(102, "Arun", 45000));
        list.add(new Employee_emp(103, "Kumar", 60000));
        list.add(new Employee_emp(104, "Bala", 25000));

        
        for (Employee_emp e : list) {
            if (e.getEmp_salary() > 40000) {

                int hike = (e.getEmp_salary() * 20) / 100;   
                int newSalary = e.getEmp_salary() + hike;    
                e.setSalary(newSalary);
            }
        }

        
        System.out.println("Employee Details After Hike\n");
        for (Employee_emp e : list) {
            e.display();
        }
    }
}
