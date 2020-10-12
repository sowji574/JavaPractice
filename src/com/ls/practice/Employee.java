package com.ls.practice;
//If you dont want to change the existing class and want to implement sorting then we can go for comparator

public class Employee implements  Comparable<Employee>{
    int eno;
    String ename;
    float salary;

    public Employee(int eno, String ename, float salary) {
        this.eno = eno;
        this.ename = ename;
        this.salary = salary;
    }

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eno=" + eno +
                ", ename='" + ename + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee e2 ){
        return this.ename.compareTo(e2.ename);

    }
}
