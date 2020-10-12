package com.ls.driver;

import com.ls.practice.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeDriver {

    public static void main(String[] args) {
        List<Employee> al = new ArrayList();

        al.add(new Employee(1,"sowji",23443));
        al.add(new Employee(4,"ram",5654));
        al.add(new Employee(2,"hari",546));

       /* Comparator<Employee> c = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
               if(e1.getSalary() > e2.getSalary()){
                   return 1;
               }
               else
                   return -1;
            }
        };
*/
        Collections.sort(al);

        for(Employee l:al){
            System.out.println(l);
        }
    }
}
